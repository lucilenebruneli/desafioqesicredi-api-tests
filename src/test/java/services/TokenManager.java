package services;

public class TokenManager {

    private static String token;

    public static String getToken() {

        if (token == null) {

            AuthService authService = new AuthService();

            String body = "{ \"username\": \"emilys\", \"password\": \"emilyspass\" }";

            token = authService.login(body)
                    .then()
                    .extract()
                    .path("token");
        }

        return token;
    }
}