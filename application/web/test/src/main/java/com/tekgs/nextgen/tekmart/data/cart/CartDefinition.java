package com.tekgs.nextgen.tekmart.data.cart;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tekgs.nextgen.tekmart.data.cart.item.ItemDefinition;

import java.util.ArrayList;
import java.util.List;

public class CartDefinition {
    List<ItemDefinition> items = new ArrayList<>();
    String cartID;
    private Integer subTotal;

    public static CartDefinition getInstance() {
        return new CartDefinition();
    }

    public CartDefinition withItem(ItemDefinition itemDefinition) {
        items.add(itemDefinition);
        return this;
    }

    public List<ItemDefinition> getItems() {
        return items;
    }

    public Integer getSubTotal() {
        return this.subTotal;
    }

    public CartDefinition withSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }
}
