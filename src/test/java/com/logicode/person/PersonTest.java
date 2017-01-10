package com.logicode.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jjenkins on 1/10/2017.
 */
public class PersonTest {


    @Test
    public void checkInitialAgeNotNegative(){

        Person person = new Person(1);
        Assert.assertFalse();
    }
}
