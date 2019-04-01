package com.takeaway.service.impl;

import com.takeaway.service.PayService;

public abstract class AbstractPayService implements PayService {
    @Override
    public boolean callback(String payId, double amount) {
        System.out.println("核销订单支付");
        return true;
    }
}
