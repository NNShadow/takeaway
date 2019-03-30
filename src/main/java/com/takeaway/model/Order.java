package com.takeaway.model;

import java.util.Date;

/*
订单对象
 */
public class Order {
    //订单ID 唯一
    private String orderID;
    //收货地址
    private String address;
    //下单时间
    private Date orderTime;
    //订单中包含的菜品
    private OrderDishes[] dishes;
    //订单金额
    private double totalAmount;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public OrderDishes[] getDishes() {
        return dishes;
    }

    public void setDishes(OrderDishes[] dishes) {
        this.dishes = dishes;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
