package com.takeaway.model;

/*
订单菜品对象
 */
public class OrderDishes {
    //菜品数量
    private int count;
    //菜品
    private Dishes dishes;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }
}
