package com.kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @Test
    public void should_return_2_when_we_have_2_in_input(){
        // GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        // WHEN
        String result = fizzbuzz.eval(2);
        // THEN
        Assertions.assertThat(result).isEqualTo("2");
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



}
