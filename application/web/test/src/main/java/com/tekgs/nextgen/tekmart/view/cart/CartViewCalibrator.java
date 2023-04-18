package com.tekgs.nextgen.tekmart.view.cart;

import com.softwareonpurpose.calibrator4test.Calibrator;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegionCalibratable;
import com.tekgs.nextgen.tekmart.view.cart.item.ItemRegionCalibrator;
import com.tekgs.nextgen.tekmart.view.cart.item.list.ItemListRegionCalibrator;

import java.util.List;

public class CartViewCalibrator extends Calibrator {
    private static final String description = "'Cart' view";
    private final CartViewExpected expected;
    private final CartView actual;

    private CartViewCalibrator(CartViewExpected expected, CartView actual) {
        super(description, expected, actual);
        this.expected = expected;
        this.actual = actual;
        addChildCalibrator(ItemListRegionCalibrator.getInstance(expected.inItems(), actual.inItems()));
    }

    public static Calibrator getInstance(CartViewExpected expect, CartView actual) {
        return new CartViewCalibrator(expect, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Empty message", expected.getEmptyMessage(), actual.getEmptyMessage());
        verify("Subtotal", expected.getSubtotal(), actual.getSubtotal());
    }


}
