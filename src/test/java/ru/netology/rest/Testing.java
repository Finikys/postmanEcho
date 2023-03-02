package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Testing {
    @Test
    void shouldReturns() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some info")
                .when()
                .post("/post")
                .then()
                .statusCode(100)
                .body("data", equalTo("some info"))
                ;
    }
}