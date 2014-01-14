package com.FizzBuzz;

import com.FizzBuzz.components.FizzBuzzNumber;

/**
 * Created with IntelliJ IDEA.
 * User: Roman
 * Date: 11/01/14
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz
{
    private static FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

    public static String say(FizzBuzzNumber fizzBuzzNum)
    {
        fizzBuzzNumber = fizzBuzzNum;
        StringBuilder result = new StringBuilder();

        result.append(sayFizzOrDie());
        result.append(sayBuzzOrDie());
        result.append(sayNumber());

        return result.toString();
    }

    private static String sayNumber()
    {
        StringBuilder result = new StringBuilder("");

       if  (!fizzBuzzNumber.isFizz() && !fizzBuzzNumber.isBuzz())
           result.append(String.valueOf(fizzBuzzNumber.getNumber()));

       return result.toString();
    }

    private static String sayFizzOrDie()
    {
        StringBuilder result = new StringBuilder("");

        if (fizzBuzzNumber.isFizz()) result.append(FizzBuzzNumber.FIZZ);

        return result.toString();
    }

    private static String sayBuzzOrDie()
    {
        StringBuilder result = new StringBuilder("");

        if (fizzBuzzNumber.isBuzz()) result.append(FizzBuzzNumber.BUZZ);

        return result.toString();
    }
}