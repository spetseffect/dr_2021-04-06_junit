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
    @Test
    public void testTriangle(){
        var f=new Triangle(a,b,c);
        double expected=f.getArea();
        double actual=6.0;
        assertEquals(expected,actual,"testTriangle failed");
    }
    @Test
    public void testRectangle(){
        var f=new Rectangle(a,b);
        double expected=f.getArea();
        double actual=12.0;
        assertEquals(expected,actual,"testRectangle failed");
    }
    @Test
    public void testSquare(){
        var f=new Square(a);
        double expected=f.getArea();
        double actual=9.0;
        assertEquals(expected,actual,"testSquare failed");
    }
    @Test
    public void testRhomb(){
        var f=new Rhomb(a,b);
        double expected=f.getArea();
        double actual=6.0;
        assertEquals(expected,actual,"testRhomb failed");
    }
}
