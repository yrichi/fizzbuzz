package com.kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.kata.fizzbuzz.FizzBuzz.BUZZ;
import static com.kata.fizzbuzz.FizzBuzz.FIZZ;

public class FizzBuzzTest {


@Test
    public void should_return_1_when_we_have_1_in_input(){
    // GIVEN
    FizzBuzz fizzbuzz = new FizzBuzz();
    // WHEN
    String result = fizzbuzz.eval(1);
    // THEN
    Assertions.assertThat(result).isEqualTo("1");
}

    @ParameterizedTest
    @CsvSource(value = "1,2,4,7,11")
    public void should_return_number_as_string_when_not_divisible_by_3_or_5(int number){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(number);
        // THEN
        Assertions.assertThat(result).isEqualTo(String.valueOf(number));
    }

    @Test
    public void should_return_fizz_when_we_have_3_in_input(){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(3);
        // THEN
        Assertions.assertThat(result).isEqualTo(FIZZ);
    }

    @Test
    public void should_return_buzz_when_we_have_5_in_input(){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(5);
        // THEN
        Assertions.assertThat(result).isEqualTo(BUZZ);
    }

    @Test
    public void should_return_fizz_when_we_have_6_in_input(){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(6);
        // THEN
        Assertions.assertThat(result).isEqualTo(FIZZ);
    }


    @Test
    public void should_return_buzz_when_we_have_10_in_input(){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(10);
        // THEN
        Assertions.assertThat(result).isEqualTo(BUZZ);
    }


}
