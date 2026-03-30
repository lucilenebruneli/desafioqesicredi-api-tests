package services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ProductService {

    // GET - listar produtos
    public Response getAllProducts() {
        return given()
                .when()
                .get("/products");
    }

    // GET - buscar por ID
    public Response getProductById(int id) {
        return given()
                .when()
                .get("/products/" + id);
    }

    // POST - criar produto
    public Response createProduct(String body) {
        return given()
                .contentType("application/json")
                .body(body)
                .when()
                .post("/products/add");
    }

    // GET com token
    public Response getAuthProducts() {
        return given()
                .header("Authorization", "Bearer " + TokenManager.getToken())
                .when()
                .get("/products");
    }
}