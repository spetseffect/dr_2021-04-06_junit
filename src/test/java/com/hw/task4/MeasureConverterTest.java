package com.hw.task4;

import com.hw.task3.StrFunc;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MeasureConverterTest {
    @Test
    public void testconvert(){
        double expected= MeasureConverter.convert(245,MeasureUnits.mm,MeasureUnits.sm);
        double actual=24.5;
        assertEquals(expected,actual,"testVowelCount failed");
    }
    @Test
    public void testgetMM(){}
    @Test
    public void testgetSM(){}
    @Test
    public void testgetDM(){}
    @Test
    public void testgetM(){}
    @Test
    public void testgetKM(){}
}