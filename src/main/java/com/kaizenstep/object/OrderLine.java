package com.kaizenstep.object;

public class OrderLine extends sObject {

    public OrderLine( Order order , Product product ) {
        super();
        order.addChildren(this);
        product.addChildren(this);
    }
}
