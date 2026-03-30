package tests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.ProductService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ProductTest extends BaseTest {

    ProductService service = new ProductService();

    String productBody;

    @BeforeEach
    void setupTestData() {
        productBody = "{ \"title\": \"Produto Teste QA\", \"price\": 1500 }";
    }

    @Test
    void shouldListProducts() {
        service.getAllProducts()
                .then()
                .statusCode(200)
                .body("products", notNullValue())
                .body("products.size()", greaterThan(0));
    }

    @Test
    void shouldGetProductById() {
        service.getProductById(1)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", notNullValue());
    }

    @Test
    void shouldReturnNotFoundWhenProductDoesNotExist() {
        service.getProductById(999999)
                .then()
                .statusCode(404);
    }

    @Test
    void shouldCreateProduct() {
        service.createProduct(productBody)
                .then()
                .statusCode(201)
                .body("title", equalTo("Produto Teste QA"));
    }

    @Test
    void shouldGetProductsWithAuth() {
        service.getAuthProducts()
                .then()
                .statusCode(200)
                .body("products", notNullValue());
    }

    @Test
    void shouldFailWithoutToken() {
        given()
                .when()
                .get("/auth/products")
                .then()
                .statusCode(401);
    }
}