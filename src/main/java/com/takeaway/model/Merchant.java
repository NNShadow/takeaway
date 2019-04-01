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
    //
    private double lon;
    //
    private double lat;

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

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
