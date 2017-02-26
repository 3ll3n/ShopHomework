package com.codeclan.example.shop_homework;

/**
 * Created by user on 26/02/2017.
 */

public class Customer {

    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void buy(int purchase) {
        this.money -= purchase;
    }

    public void getRefund(int refund) {
        this.money += refund;
    }
}
