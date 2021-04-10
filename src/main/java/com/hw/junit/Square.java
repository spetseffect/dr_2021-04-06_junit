package com.hw.junit;

import java.util.Objects;

public class Square implements IFigure{
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public Double getArea() {
        return a*a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
