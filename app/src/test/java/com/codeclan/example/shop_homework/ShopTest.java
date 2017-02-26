package com.codeclan.example.shop_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/02/2017.
 */

public class ShopTest {

    Shop shop1;
    Shop shop2;

    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        shop1 = new Shop(5000);
        shop2 = new Shop(3500);

        customer1 = new Customer("Anna", 500);
        customer2 = new Customer("Elsa", 450);
    }

    @Test
    public void testGetBalance() {
        assertEquals(5000, shop1.getBalance());
    }

    @Test
    public void testSellGoods() {
        shop2.sellGoods(200);
        customer1.buy(200);
        assertEquals(3700, shop2.getBalance());
        assertEquals(300, customer1.getMoney());
    }

    @Test
    public void testGiveRefund() {
        shop1.giveRefund(50);
        customer1.getRefund(50);
        assertEquals(4950, shop1.getBalance());
        assertEquals(550, customer1.getMoney());
    }
}
