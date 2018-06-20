package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private static int nextUniqueID = 0;

    private String name;
    private String description;
    private int id;

    public Supplier() {
        this.id = nextUniqueID++;
    }

    public Supplier(String name, String description) {
        this.id = nextUniqueID++;
        this.description = description;
        this.name = name;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id:" + Integer.toString(this.id) + ",name:" + this.name + ",description:" + this.description;
    }
}
