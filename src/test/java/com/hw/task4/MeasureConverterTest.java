package com.hw.task4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MeasureConverterTest {
    @Test
    public void testconvert(){
        double expected= MeasureConverter.convert(245,MeasureUnits.mm,MeasureUnits.sm);
        double actual=24.5;
        assertEquals(expected,actual,"testconvert failed");
    }
    @Test
    public void testgetMM(){
        double expected= MeasureConverter.getMM(245,MeasureUnits.sm);
        double actual=2450;
        assertEquals(expected,actual,"testgetMM failed");
    }
    @Test
    public void testgetSM(){
        double expected= MeasureConverter.getSM(245,MeasureUnits.dm);
        double actual=2450;
        assertEquals(expected,actual,"testgetSM failed");
    }
    @Test
    public void testgetDM(){
        double expected= MeasureConverter.getDM(245,MeasureUnits.km);
        double actual=2450000;
        assertEquals(expected,actual,"testgetDM failed");
    }
    @Test
    public void testgetM(){
        double expected= MeasureConverter.getM(245,MeasureUnits.mm);
        double actual=0.245;
        assertEquals(expected,actual,"testgetM failed");
    }
    @Test
    public void testgetKM(){
        double expected= MeasureConverter.getKM(245,MeasureUnits.m);
        double actual=0.245;
        assertEquals(expected,actual,"testgetKM failed");
    }
}
