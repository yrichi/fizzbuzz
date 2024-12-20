package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ + BUZZ;

    public String eval(int min, int max) {
        String result = "";
        result = getString(min, result);
        if (min < max) {
            result = getString(max, result);
        }


        return result;
    }

    private static String getString(int max, String result) {
        if (max == 0) {
            result += String.valueOf(max);
        } else if (max % 3 == 0 && max % 5 == 0) {
            result += FIZZBUZZ;
        } else if (max % 3 == 0) {
            result += FIZZ;
        } else if (max % 5 == 0) {
            result += BUZZ;
        } else {
            result += String.valueOf(max);
        }
        return result;
    }
}
