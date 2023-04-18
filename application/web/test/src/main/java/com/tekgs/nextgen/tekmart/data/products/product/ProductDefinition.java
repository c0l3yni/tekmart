package com.tekgs.nextgen.tekmart.data.products.product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ProductDefinition { // going to be
    private String title;
    private Integer price;

    public ProductDefinition() {
    }

    public static ProductDefinition getInstance() {
        return new ProductDefinition();
    }

    public ProductDefinition withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }
}