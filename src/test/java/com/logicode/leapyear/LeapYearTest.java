package com.logicode.leapyear;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jjenkins on 1/9/2017.
 */
public class LeapYearTest {
    //a year is a leap year if it divisible by 4
    // if divisible by 100 not a leap year
    //except divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour(){
        assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test
    public void normalYearsNotDivisibleByfour(){
        assertFalse(LeapYear.isLeapYear(3));
    }

    @Test
    public void leapYearsAreNotDivisibleByOneHundred(){
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void LeapYearsAreDivisibleByFourHundred(){
        assertTrue(LeapYear.isLeapYear(2000));
    }
}
