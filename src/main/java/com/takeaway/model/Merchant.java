package com.takeaway.model;

/*
商家，设计商家模型
 */
public class Merchant {
    //商家名称
    private String name;
    //商家地址
    private String address;
    //商家菜品
    private Dishes[] dishes;
    //经度
    private double lon;
    //纬度
    private double lat;
    //距离
    private double distance;

    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
