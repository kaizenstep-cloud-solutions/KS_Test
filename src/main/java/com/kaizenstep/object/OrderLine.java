package com.kaizenstep.object;

public class OrderLine extends ksObject {

    public OrderLine( Order order , Product product ) {
        super();
        order.addChildren(this);
        product.addChildren(this);
    }
}
