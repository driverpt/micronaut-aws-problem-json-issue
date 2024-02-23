package com.example;

import io.micronaut.function.aws.test.annotation.MicronautLambdaTest;
import io.micronaut.http.HttpStatus;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;


@MicronautLambdaTest
class HomeControllerIT {

    @Test
    void test(RequestSpecification spec) {
        spec
                .get("/someProblem")
                .then()
                .log().all()
                .statusCode(HttpStatus.BAD_REQUEST.getCode());
    }
}
