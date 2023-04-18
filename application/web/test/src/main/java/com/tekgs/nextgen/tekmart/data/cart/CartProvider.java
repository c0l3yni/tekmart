package com.tekgs.nextgen.tekmart.data.cart;

import java.util.List;

public class CartProvider {


    public static CartProvider getInstance() {
        return new CartProvider();
    }

    public Cart get(CartDefinition cartDefinition) {
        List<Cart> cartList = CartRepository.getInstance().query();
        Cart cart = null;
        for (Cart candidate : cartList) {
            if (candidate.equivalent(cartDefinition)) {
                cart = candidate;
                break;
            }
        }
        return cart;
    }
}
