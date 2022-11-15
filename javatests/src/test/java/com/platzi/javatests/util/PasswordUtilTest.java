package com.platzi.javatests.util;

import org.junit.jupiter.api.Test;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("12!4567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void medium_when_has_letters_and_numbres(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }



    @Test
    public void strong_when_has_letters_and_numbres_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }






}