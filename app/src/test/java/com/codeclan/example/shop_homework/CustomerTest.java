package com.codeclan.example.shop_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/02/2017.
 */

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        customer1 = new Customer("Anna", 500);
        customer2 = new Customer("Elsa", 450);
    }


    @Test
    public void testGetName() {
        assertEquals("Anna", customer1.getName());
    }

    @Test
    public void testGetTotalMoney() {
        assertEquals(450, customer2.getMoney());
    }

    @Test
    public void testBuy() {
        customer1.buy(200);
        assertEquals(300, customer1.getMoney());
    }

    @Test
    public void testGetRefund() {
        customer2.buy(100);
        customer2.getRefund(100);
        assertEquals(450, customer2.getMoney());
    }
}
