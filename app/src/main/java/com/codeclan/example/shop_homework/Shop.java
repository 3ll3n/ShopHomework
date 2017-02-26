package com.codeclan.example.shop_homework;

/**
 * Created by user on 26/02/2017.
 */

public class Shop {

    private int balance;

    public Shop(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void sellGoods(int goods) {
        this.balance += goods;
    }

    public void giveRefund(int refund) {
        this.balance -= refund;
    }

}
