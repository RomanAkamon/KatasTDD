package com.FizzBuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Roman
 * Date: 11/01/14
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class FizzBuzzTest
{
    @Test
    public void oneTriggersOne()
    {
        final String expected = "1";
        String result = FizzBuzz.say(1);
        assertEquals("not One", expected, result);
    }

    @Test
    public void twoTriggersTwo()
    {
        final String expected = "2";
        String result = FizzBuzz.say(2);
        assertEquals("not Two", expected, result);
    }

    @Test
    public void answersNumberAsString()
    {
        final String anyNumber = "11";
        String result = FizzBuzz.say(11);
        assertEquals("not the number as String", anyNumber, result);
    }

    @Test
    public void threeTriggersFizz()
    {
        final String expected = "Fizz";
        String result = FizzBuzz.say(3);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void fiveTriggersBuzz()
    {
        final String expected = "Buzz";
        String result = FizzBuzz.say(5);
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void sixTriggersFizz()
    {
        final String expected = "Fizz";
        String result = FizzBuzz.say(6);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void nineTriggersFizz()
    {
        final String expected = "Fizz";
        String result = FizzBuzz.say(9);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void tenTriggersBuzz()
    {
        final String expected = "Buzz";
        String result = FizzBuzz.say(10);
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void twelveTriggersFizz()
    {
        final String expected = "Fizz";
        String result = FizzBuzz.say(12);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void fifteenTriggersFizzBuzz()
    {
        final String expected = "FizzBuzz";
        String result = FizzBuzz.say(15);
        assertEquals("not FizzBuzz", expected, result);
    }
}
