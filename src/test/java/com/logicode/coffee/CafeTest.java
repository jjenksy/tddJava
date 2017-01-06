package com.logicode.coffee;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jjenkins on 1/6/2017.
 */
public class CafeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void canBrewExpresso() throws Exception {
        //get a cafe object
        Cafe cafe = new Cafe();

        //add beans
        cafe.restockBeans(7);
        //brew an expresso
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //assert it is an expresso
        //no milk
        //we have enough coffee
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBeans());


    }

    @Test
    public void testBrew1() throws Exception {

    }

    @Test
    public void testRestockBeans() throws Exception {

    }

    @Test
    public void testRestockMilk() throws Exception {

    }

    @Test
    public void testGetBeansInStock() throws Exception {

    }

    @Test
    public void testGetMilkInStock() throws Exception {

    }
}