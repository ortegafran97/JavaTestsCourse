package com.platzi.javatests.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    /*
        Si el número es divisible por 3, retorna “Fizz”
        Si el número es divisible por 5, retorna “Buzz”
        Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
        En otro caso, retorna el mismo número
*/

    @Test
    public void fizz_if_divisible_by_three() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void buzz_if_divisible_by_five() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void fizzbuzz_if_divisible_by_three_and_five() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void number_if_not_divisible_by_three_nor_five() {
        assertEquals("1",FizzBuzz.fizzBuzz(1));
        assertEquals("2",FizzBuzz.fizzBuzz(2));
        assertEquals("4",FizzBuzz.fizzBuzz(4));
        assertEquals("16",FizzBuzz.fizzBuzz(16));
    }
}