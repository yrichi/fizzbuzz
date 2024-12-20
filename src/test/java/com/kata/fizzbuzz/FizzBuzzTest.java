package com.kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.kata.fizzbuzz.FizzBuzz.*;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"1", "2", "4", "7", "8", "11", "13", "14", "16", "17", "19"})
    public void should_return_number_as_string_when_not_divisible_by_3_or_5(int number) {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(number, number);
        // THEN
        Assertions.assertThat(result).isEqualTo(String.valueOf(number));
    }


    @ParameterizedTest
    @CsvSource({"-3", "3", "6", "9", "12"})
    public void should_return_fizz_when_divisible_by_3_and_not_by_5(int input) {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(input, input);
        // THEN
        Assertions.assertThat(result).isEqualTo(FIZZ);
    }


    @ParameterizedTest
    @CsvSource({"-5","5", "10"})
    public void should_return_buzz_when_divisible_by_5_and_not_by_3(int input) {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(input, input);
        // THEN
        Assertions.assertThat(result).isEqualTo(BUZZ);
    }

    @ParameterizedTest
    @CsvSource({"-15","15", "30"})
    public void should_return_buzz_when_divisible_by_5_and_by_3(int input) {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(input, input);
        // THEN
        Assertions.assertThat(result).isEqualTo(FIZZBUZZ);
    }


    @Test
    public void should_return_0_as_string_when_input_is_0() {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(0, 0);
        // THEN
        Assertions.assertThat(result).isEqualTo(String.valueOf(0));
    }


    @Test
    void should_12_when_input_is_1and2() {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(1,2);
        // THEN
        Assertions.assertThat(result).isEqualTo("12");
    }

    @Test
    void should_FizzBuzz16_when_input_is_15And16() {
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(15,16);
        // THEN
        Assertions.assertThat(result).isEqualTo("FizzBuzz16");
    }


}
