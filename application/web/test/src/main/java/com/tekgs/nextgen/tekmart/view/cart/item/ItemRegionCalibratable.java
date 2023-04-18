package com.tekgs.nextgen.tekmart.view.cart.item;

public interface ItemRegionCalibratable {

    String getTitle();

    boolean equivalent(ItemRegionCalibratable expectedItem);

    Integer getQuantity();

    String getPrice();
}
