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
        //TODO: No usar primitivas en clase publica, usar un objeto FizzBuzzNumber

        StringBuilder result = new StringBuilder(sayFizzOrDie(number));
        result.append(sayBuzzOrDie(number));
        result.append(sayNumber(number));
        return result.toString();
    }

    private static String sayNumber(int number)
    {
        StringBuilder result = new StringBuilder("");

       if  (!isFizz(number) && !isBuzz(number))
           result.append(String.valueOf(number));

       return result.toString();
    }

    private static String sayFizzOrDie(int number)
    {
        StringBuilder result = new StringBuilder("");

        if (isFizz(number)) result.append(FIZZ);

        return result.toString();
    }

    private static String sayBuzzOrDie(int number)
    {
        StringBuilder result = new StringBuilder("");

        if (isBuzz(number)) result.append(BUZZ);

        return result.toString();
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