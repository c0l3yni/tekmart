package com.tekgs.nextgen.tekmart.data.cart;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tekgs.nextgen.tekmart.data.cart.item.Item;
import com.tekgs.nextgen.tekmart.data.cart.item.ItemDefinition;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    String cartID;
    List<Item> items = new ArrayList<>();


    public boolean equivalent(CartDefinition comparator) {
        if (comparator == null)
            return false;
        boolean isEquivalent = itemsAreEquivalent(comparator.getItems());
        isEquivalent &= comparator.getSubTotal() == null || getSubTotal().equals(comparator.getSubTotal());
        return isEquivalent;
    }

    private boolean itemsAreEquivalent(List<ItemDefinition> comparatorItems) {
        List<Item> thisItems = new ArrayList<>(this.items);
        for (ItemDefinition comparatorItem : comparatorItems) {
            Item itemFound = null;
            for (Item candidate : thisItems) {
                if (candidate.equivalent(comparatorItem)) {
                    itemFound = candidate;
                    break;
                }
            }
            if (itemFound == null)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }

    public String getID() {
        return this.cartID;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public Integer getSubTotal() {
        int subtotal = 0;
        for (Item item : this.items) {
            subtotal += item.getProduct().getPrice() * item.getQuantity();
        }
        return subtotal;
    }
}
