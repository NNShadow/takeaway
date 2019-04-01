package com.takeaway.service.impl;

import com.takeaway.model.Order;

public class ALiPayService extends AbstractPayService {
    @Override
    public void pay(Order order) {
        System.out.println("支付宝支付");
    }

}
