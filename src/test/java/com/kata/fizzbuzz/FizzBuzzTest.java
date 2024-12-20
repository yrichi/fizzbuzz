package com.kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


@Test
    public void should_return_1_when_we_have_1_in_input(){
    // GIVEN
    FizzBuzz fizzbuzz = new FizzBuzz();
    // WHEN
    String result = fizzbuzz.get(1);
    // THEN
    Assertions.assertThat(result).isEqualTo("1");
}



}
