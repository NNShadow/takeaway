package com.takeaway.service.impl;

import com.takeaway.model.Order;

public class WeixinPayService extends AbstractPayService {

    @Override
    public void pay(Order order) {
        System.out.println("微信支付");
    }
}
