package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

class Product {
    private static int nextUniqueID = 0;
    private final int id;
    private String name;
    private Float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        this.id = nextUniqueID++;
    }

    public Product(String name, Float defaultPrice, Currency defaultCurrency) {
        this.id = nextUniqueID++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

    static void addProduct(Product product) {
        Product.productList.add(product);
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

    public Float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(Float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productsByCategory = new ArrayList<>();
        for (Product product: productList) {
            if (product.productCategory.equals(productCategory)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product product : productList) {
            if (product.supplier.equals(supplier)) {
                productsBySupplier.add(product);
            }
        }
        return productsBySupplier;
    }

    @Override
    public String toString() {

        return "id:" + Integer.toString(this.id) +
                ",name:" + this.name +
                ",defaultprice:" + this.defaultPrice +
                ",defaultcurrency" + this.defaultCurrency.toString() +
                ",supplier:" + this.supplier;
    }
}

