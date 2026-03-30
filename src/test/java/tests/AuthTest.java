package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import services.AuthService;

import static org.hamcrest.Matchers.*;

public class AuthTest extends BaseTest {

    AuthService authService = new AuthService();

    @Test
    void shouldLoginSuccessfully() {

        String body =  "{ \"username\": \"emilys\", \"password\": \"emilyspass\" }";

        authService.login(body)
                .then()
                .log().all()
                .statusCode(200);
    }

}

