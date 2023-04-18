package com.tekgs.nextgen.tekmart.data.cart.item;

import com.tekgs.nextgen.tekmart.data.products.product.Product;

public class Item {
    Integer quantity;
    Product product;
    String title;

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public String getTitle() {
        return title;
    }

    public boolean equivalent(ItemDefinition comparatorItem) {
        if (comparatorItem == null) return false;
        boolean isEquivalent = comparatorItem.getProduct() == null || this.product.equivalent(comparatorItem.getProduct());
        isEquivalent &= comparatorItem.getQuantity() == null || this.quantity.equals(comparatorItem.getQuantity());
        return isEquivalent;
    }
}
