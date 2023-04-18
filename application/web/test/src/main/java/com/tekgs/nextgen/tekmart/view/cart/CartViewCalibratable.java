package com.tekgs.nextgen.tekmart.view.cart;

import com.tekgs.nextgen.tekmart.view.cart.item.list.ItemListRegionCalibratable;

public interface CartViewCalibratable {
    String getEmptyMessage();

    ItemListRegionCalibratable inItems();

    String getSubtotal();
}
