package com.hw.task1;

import java.util.Objects;

public class Rhomb implements IFigure{
    //диагонали ромба
    private final double a;
    private final double b;

    public Rhomb(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double getArea() {
        return a*b/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhomb rhomb = (Rhomb) o;
        return (Double.compare(rhomb.a, a) == 0 && Double.compare(rhomb.b, b) == 0)
                || (Double.compare(rhomb.b, a) == 0 && Double.compare(rhomb.a, b) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
