package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String eval(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZ+BUZZ;
        }

        if (number % 3 == 0 ) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
          return String.valueOf(number);
    }
}
