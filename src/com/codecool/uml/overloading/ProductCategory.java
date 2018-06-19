package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory{
        private static int nextUniqueID = 0;
        protected int id;
        protected String name;
        protected String department;
        protected String description;

    public ProductCategory() {
        this.id = nextUniqueID++;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = nextUniqueID++;
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        //TODO
        return null;
    }

    @Override
    public String toString() {
        return "id:" + Integer.toString(this.id) +
                ",name:" + name +
                ",department:" + department +
                ",description:" + description;
    }
}
