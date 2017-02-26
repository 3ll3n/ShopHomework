package com.codeclan.example.shop_homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/02/2017.
 */

public class ShopTest {

    Shop shop1;
    Shop shop2;

    Customer customer1;
    Customer customer2;

    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    @Before
    public void before() {

        sales = new ArrayList<Integer>();
        sales.add(150);
        sales.add(200);
        sales.add(400);

        refunds = new ArrayList<Integer>();
        refunds.add(20);
        refunds.add(50);
        refunds.add(100);

        shop1 = new Shop(5000, sales, refunds);
        shop2 = new Shop(3500, sales, refunds);

        customer1 = new Customer("Anna", 500);
        customer2 = new Customer("Elsa", 450);
    }



    @Test
    public void testGetBalance() {
        assertEquals(5000, shop1.getBalance());
    }

    @Test
    public void testSellGoods() {
        shop2.sellGoods(200, customer1);
        assertEquals(3700, shop2.getBalance());
    }

    @Test
    public void testGiveRefund() {
        shop1.giveRefund(50, customer1);
        assertEquals(4950, shop1.getBalance());
    }

    @Test
    public void testTotalSales() {
        shop1.sellGoods(10, customer1);
        assertEquals(760, shop1.totalSales());
        assertEquals(5010, shop1.getBalance());
    }

    @Test
    public void testTotalRefunds() {
        shop1.giveRefund(20, customer1);
        assertEquals(190, shop1.totalRefunds());
        assertEquals(4980, shop1.getBalance());
    }

    @Test
    public void testTotalSalesMinusTotalRefunds() {
        assertEquals(580, shop1.totalIncome());
    }
}
