package com.FizzBuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Roman
 * Date: 11/01/14
 * Time: 10:40
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz
{
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int THREE_MULTIPLIER = 3;
    public static final int FIVE_MULTIPLIER = 5;

    public static String say(int number)
    {
        //TODO: el result como StringBuffer
        //TODO: No usar primitivas en clase publica, usar un objeto FizzBuzzNumber

        String result = sayFizzOrDie(number);
        result += sayBuzzOrDie(number);
        result += sayNumber(number);
        return result;
    }

    private static String sayNumber(int number)
    {
        String result ="";

       if  (!isFizz(number) && !isBuzz(number))
           result = String.valueOf(number);

       return result;
    }

    private static String sayFizzOrDie(int number)
    {
        String result = "";
        if (isFizz(number)) result = FIZZ;
        return result;
    }

    private static String sayBuzzOrDie(int number)
    {
        String result = "";
        if (isBuzz(number)) result = BUZZ;
        return result;
    }

    private static boolean isFizz(int number)
    {
        return number % THREE_MULTIPLIER == 0;
    }

    private static boolean isBuzz(int number)
    {
        return number % FIVE_MULTIPLIER == 0;
    }
}