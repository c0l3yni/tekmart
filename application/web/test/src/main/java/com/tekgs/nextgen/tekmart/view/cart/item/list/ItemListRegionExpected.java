package com.tekgs.nextgen.tekmart.view.cart.item.list;

import com.tekgs.nextgen.tekmart.data.cart.item.Item;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegionCalibratable;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegionExpected;

import java.util.ArrayList;
import java.util.List;

public class ItemListRegionExpected implements ItemListRegionCalibratable {
    private final List<Item> items = new ArrayList<>();

    public ItemListRegionExpected(List<Item> items) {
        this.items.addAll(items);
    }

    public static ItemListRegionExpected getInstance(List<Item> items) {
        return new ItemListRegionExpected(items);
    }

    @Override
    public List<ItemRegionCalibratable> getItems() {
        List<ItemRegionCalibratable> itemRegions = new ArrayList<>();
        this.items.forEach(item -> itemRegions.add(ItemRegionExpected.getInstance(item)));
        return itemRegions;
    }
}
