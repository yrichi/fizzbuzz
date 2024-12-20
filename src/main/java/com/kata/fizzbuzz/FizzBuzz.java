package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = FIZZ+BUZZ;

    public String eval(int number) {

        if (number == 0) {
            return String.valueOf(number);
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZBUZZ;
        }

        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
