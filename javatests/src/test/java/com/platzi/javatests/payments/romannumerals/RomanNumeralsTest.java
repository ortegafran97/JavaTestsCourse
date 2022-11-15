package com.platzi.javatests.payments.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.platzi.javatests.romannumerals.RomanNumerals.arabicToRoman;

class RomanNumeralsTest {

    @Test
    public void void_if_zero() {
        assertEquals("", arabicToRoman(0));
    }

    //@Test
    public void simple_numbers() {
//        Con numeros simples me refieron aquellos que no restan ubicandose a la izquierda de otro 1 ,2,3,5,6,7,8,10...
        assertEquals("I",arabicToRoman(1));
        assertEquals("II",arabicToRoman(2));
        assertEquals("III",arabicToRoman(3));

        assertEquals("V",arabicToRoman(5));

        assertEquals("X",arabicToRoman(10));
        assertEquals("XV",arabicToRoman(15));

    }
}