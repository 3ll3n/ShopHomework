package com.codeclan.example.shop_homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 26/02/2017.
 */

public class Shop {

    private int balance;
    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    public Shop(int balance, ArrayList<Integer> sales, ArrayList<Integer> refunds) {
        this.balance = balance;
        this.sales = sales;
        this.refunds = refunds;
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


    public int totalSales() {
        int totalSales = 0;
        for(int sale : this.sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public int totalRefunds() {
        int totalRefunds = 0;
        for(int refund : this.refunds) {
            totalRefunds += refund;
        }
        return totalRefunds;
    }

    public int totalIncome() {
        return totalSales() - totalRefunds();
    }
}
