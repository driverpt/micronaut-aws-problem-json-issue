package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;
import jakarta.validation.ConstraintViolationException;

import java.util.Set;

@Controller
public class HomeController {

    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World");
    }

    @Get("/someProblem")
    public HttpResponse<?> someProblemJsonError() {
        throw new ConstraintViolationException("property", Set.of());
    }
}
