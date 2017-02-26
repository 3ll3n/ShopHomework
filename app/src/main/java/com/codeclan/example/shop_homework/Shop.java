package com.codeclan.example.shop_homework;

import java.util.ArrayList;

/**
 * Created by user on 26/02/2017.
 */

public class Shop {

    private int balance;
    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    public Shop(int balance) {
        this.balance = balance;
        sales = new ArrayList<Integer>();
        refunds = new ArrayList<Integer>();
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
