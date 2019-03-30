package com.takeaway.control;

import com.takeaway.model.car.FastCar;

public class Test {
    public static void main(String[] args) {
        FastCar fastCar = new FastCar();
        fastCar.setBrand("宝马");
        fastCar.setPlateNumber("京K11111");

        System.out.println("我打了一辆车:"+fastCar.getBrand()+":"+fastCar.getPlateNumber());
    }
}
