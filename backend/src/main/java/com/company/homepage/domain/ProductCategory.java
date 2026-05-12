package com.company.homepage.domain;

public class ProductCategory {
    private final String name;
    private final String description;

    public ProductCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
