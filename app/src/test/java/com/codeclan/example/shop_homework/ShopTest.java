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
}
