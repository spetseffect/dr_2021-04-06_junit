package com.hw.task1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Testing Figures.")
public class FiguresTest {
    private static double a;
    private static double b;
    private static double c;
    @BeforeAll
    public static void initAll(){
        a=3.0;
        b=4.0;
        c=5.0;
    }
    @BeforeEach
    public void init(){}

    @Test
    public void testTriangle(){
        var t=new Triangle(a,b,c);
        double expected=t.getArea();
        double actual=6.0;
        assertEquals(expected,actual,"esli ne udachno");
    }
}
