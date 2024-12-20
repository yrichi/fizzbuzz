package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ + BUZZ;

    public String eval(int min, int max) {
        String result = "";
        result += getString(min);
        if (min < max) {
            result += getString(max);
        }


        return result;
    }

    private static String getString(int input) {
        if (input == 0) {
            return String.valueOf(input);
        } else if (input % 3 == 0 && input % 5 == 0) {
            return FIZZBUZZ;
        } else if (input % 3 == 0) {
            return FIZZ;
        } else if (input % 5 == 0) {
            return BUZZ;
        } else {
            return String.valueOf(input);
        }
    }
}
