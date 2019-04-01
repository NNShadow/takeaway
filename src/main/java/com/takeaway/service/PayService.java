package com.takeaway.service;

import com.takeaway.model.Order;

public interface PayService {
    void pay(Order order);
    boolean callback(String payId, double amount);
}
