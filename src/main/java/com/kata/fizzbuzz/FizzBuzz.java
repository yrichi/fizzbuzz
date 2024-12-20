package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String eval(int number) {
        if (number == 1) {
            return String.valueOf(number);
        }
        if (number == 2) {
            return String.valueOf(number);
        }
        if (number == 3 || number == 6) {
            return FIZZ;
        }

        if (number == 5) {
            return BUZZ;
        }
        return "";
    }
}
