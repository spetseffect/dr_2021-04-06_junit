package com.hw.task3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Testing StrFunc.")
public class StrFuncTest {
    private static String str;
    private static String word;
    @BeforeAll
    public static void init(){
        str="Тут какя-то строка для тестирования и для очередной тренировки набора текста вслепую. " +
                "Также тут дополнительно несколько просто наборов букв для количества: авырпдляав, тута, набор, текст.";
        word="для";
    }
    @Test
    public void testPalindrom(){
        boolean expected=StrFunc.Palindrom("радар rotor радар");
        assertTrue(expected,"testPalindrom failed");
    }
    @Test
    public void testVowelCount(){
        int expected=StrFunc.VowelCount("очередной");
        int actual=4;

    }
    @Test
    public void testConsonantCount(){}
    @Test
    public void testWordCount(){}
}
