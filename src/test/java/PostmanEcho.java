import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEcho {

    @Test
    void test1(){
        //Given - When -Then
        given()
                .baseUri("https://postman-echo.com")
                .body("07.09.2022")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("07.09.2022"));

    }
}
