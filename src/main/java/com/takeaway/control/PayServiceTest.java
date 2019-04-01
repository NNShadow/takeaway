package com.takeaway.control;

import com.takeaway.model.Order;
import com.takeaway.service.PayService;
import com.takeaway.service.impl.ALiPayService;

public class PayServiceTest {
    public static void main(String[] args) {
        PayService payService = new ALiPayService();
        Order order = new Order();
        order.setOrderID("123");
        order.setTotalAmount(100d);
        payService.pay(order);

        payService.callback("123",100d);
    }
}
