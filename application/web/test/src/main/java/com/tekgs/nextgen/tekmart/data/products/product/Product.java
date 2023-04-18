package com.tekgs.nextgen.tekmart.data.products.product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Product { //dao
    Integer price;
    String title;
    String description;
    Integer stock;

    public Product() {
    }

    public boolean equivalent(ProductDefinition product) {
        boolean isEquivalent = product.getTitle() == null || this.title.equals(product.getTitle());
        isEquivalent &= product.getPrice() == null || this.price.equals(product.getPrice());
        return isEquivalent;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getStock(){
        return this.stock;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }

    public String getDescription() {
        return this.description;
    }
}
