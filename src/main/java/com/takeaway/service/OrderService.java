package com.takeaway.service;

import com.takeaway.exception.NoAddressException;
import com.takeaway.model.Order;
import com.takeaway.model.OrderDishes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderService {

    public Order createOrder(OrderDishes[] orderDishes) throws NoAddressException {
        //此处进行过修改，but有错...
        Order order = new Order();
        if(order.getAddress() == null){
            throw new NoAddressException();
        }

        double totalAmount = 0d;
        for(OrderDishes orderDish : orderDishes){
            double amount = orderDish.getDishes().getPrice()*orderDish.getCount();
            totalAmount = totalAmount + amount;
        }
        order.setTotalAmount(totalAmount);
        order.setDishes(orderDishes);
        return order;
    }

    //收据
    public void confirmOrder(Order order){
        System.out.println("本次下单的收货地址是："+order.getAddress());
        System.out.println("-------");
        System.out.println("本次下单的商品信息是：");
        System.out.println("-------");
        for(OrderDishes dish : order.getDishes()){
            System.out.println("菜品名称："+dish.getDishes().getName());
            System.out.println("菜品价格："+dish.getDishes().getPrice());
            System.out.println("菜品数量："+dish.getCount());
            System.out.println("-------");
        }
        System.out.println("本次需要支付的总金额是："+order.getTotalAmount());
    }

    //支付检测
    public void payOrder(Order order){
        boolean isTrue = false;

        while (!isTrue){
            String str = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                str = bufferedReader.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            double amount = Double.valueOf(str);
            if(amount == order.getTotalAmount()){
                isTrue = true;
            }
            if(!isTrue)
                System.out.println("请输入正确的金额！");
            else
                System.out.println("感谢惠顾！");
        }

    }

}
