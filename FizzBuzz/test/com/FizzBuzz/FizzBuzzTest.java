package com.FizzBuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Roman
 * Date: 11/01/14
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */

import com.FizzBuzz.components.FizzBuzzNumber;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class FizzBuzzTest
{

    private FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();
    @Test
    public void oneTriggersOne()
    {
        final String expected = "1";
        fizzBuzzNumber.setNumber(1);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not One", expected, result);
    }

    @Test
    public void twoTriggersTwo()
    {
        final String expected = "2";
        fizzBuzzNumber.setNumber(2);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Two", expected, result);
    }

    @Test
    public void answersNumberAsString()
    {
        final String anyNumber = "11";
        fizzBuzzNumber.setNumber(11);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not the number as String", anyNumber, result);
    }

    @Test
    public void threeTriggersFizz()
    {
        final String expected = "Fizz";
        fizzBuzzNumber.setNumber(3);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void fiveTriggersBuzz()
    {
        final String expected = "Buzz";
        fizzBuzzNumber.setNumber(5);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void sixTriggersFizz()
    {
        final String expected = "Fizz";
        fizzBuzzNumber.setNumber(6);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void nineTriggersFizz()
    {
        final String expected = "Fizz";
        fizzBuzzNumber.setNumber(9);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void tenTriggersBuzz()
    {
        final String expected = "Buzz";
        fizzBuzzNumber.setNumber(10);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Buzz", expected, result);
    }

    @Test
    public void twelveTriggersFizz()
    {
        final String expected = "Fizz";
        fizzBuzzNumber.setNumber(12);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not Fizz", expected, result);
    }

    @Test
    public void fifteenTriggersFizzBuzz()
    {
        final String expected = "FizzBuzz";
        fizzBuzzNumber.setNumber(15);

        String result = FizzBuzz.say(fizzBuzzNumber);
        assertEquals("not FizzBuzz", expected, result);
    }
}
