package com.kata.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String eval(int number) {
        if (number == 1 ){
            return String.valueOf(number);
        }
        if (number == 2 ){
            return String.valueOf(number);
        }
        if (number == 3){
            return FIZZ;
        }
        return "";
    }
}
