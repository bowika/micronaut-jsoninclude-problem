package com;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HomeController {
    @Get
    public Whatever index() {
        return new Whatever();
    }
}
