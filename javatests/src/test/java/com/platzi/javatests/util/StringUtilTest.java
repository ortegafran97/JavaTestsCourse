package com.platzi.javatests.util;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    public void repeat_string_once(){
        assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_three_times(){
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times(){
        assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test
    public void repeat_string_negative_times(){
        assertThrows(IllegalArgumentException.class,
                () -> {
            StringUtil.repeat("hola", -1);
        });
    }

    @Test
    public void true_when_string_is_empty(){
        // El test pasa si se dejan espacios en blanco
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void true_when_string_is_filled_with_blank_spaces(){
        // El test pasa si se dejan espacios en blanco
        assertTrue(StringUtil.isEmpty("  "));
    }

    @Test
    public void false_when_string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("asd "));
    }
}