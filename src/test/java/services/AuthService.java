package services;


import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AuthService {

    public Response login(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/auth/login");
    }
}
