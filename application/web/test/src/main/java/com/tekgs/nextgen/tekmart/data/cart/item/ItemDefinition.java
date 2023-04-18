package com.tekgs.nextgen.tekmart.data.cart.item;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tekgs.nextgen.tekmart.data.products.product.ProductDefinition;

public class ItemDefinition {
    private ProductDefinition product;
    private Integer quantity;

    public static ItemDefinition getInstance() {
        return new ItemDefinition();
    }

    public ItemDefinition withProduct(ProductDefinition product) {
        this.product = product;
        return this;
    }

    public ProductDefinition getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }
}
