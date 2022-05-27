package com;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.core.annotation.Introspected;

@Introspected
@JsonInclude
public class Whatever {
    private String name;

    public String getName() {
        return name;
    }

    public Whatever setName(String name) {
        this.name = name;
        return this;
    }
}
