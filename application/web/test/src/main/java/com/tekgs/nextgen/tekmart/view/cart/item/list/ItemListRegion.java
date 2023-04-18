package com.tekgs.nextgen.tekmart.view.cart.item.list;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiLocatorType;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegion;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegionCalibratable;

import java.util.ArrayList;
import java.util.List;

public class ItemListRegion extends UiRegion implements ItemListRegionCalibratable {

    public static final String DESCRIPTION = "'Item List' Region";
    public static final String LOCATOR_TYPE = UiLocatorType.ID;
    public static final String LOCATOR_VALUE = "item-list";

    public ItemListRegion(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, LOCATOR_TYPE, LOCATOR_VALUE, parent));
    }

    public static ItemListRegion getInstance(UiElement parent) {
        return new ItemListRegion(parent);
    }

    @Override
    public List<ItemRegionCalibratable> getItems() {
        List<ItemRegionCalibratable> itemRegions = new ArrayList<>();
        List<UiElement> itemElementList = UiElement.getList("Item", UiLocatorType.CLASS, "item", this.getElement());
        itemElementList.forEach(itemElement -> {
            itemRegions.add(ItemRegion.getInstance(itemElement));
        });
        return itemRegions;
    }
}
