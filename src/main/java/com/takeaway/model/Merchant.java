package com.takeaway.model;

/*
商家
 */
public class Merchant {
    //商家名称
    private String name;
    //商家地址
    private String address;
    //商家菜品
    private Dishes[] dishes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Dishes[] getDishes() {
        return dishes;
    }

    public void setDishes(Dishes[] dishes) {
        this.dishes = dishes;
    }
}
