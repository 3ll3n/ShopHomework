package com.codeclan.example.shop_homework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/02/2017.
 */

public class TransactionTest {

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
    }
    
}
