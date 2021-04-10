package com.hw;

import java.util.Objects;

public class Rectangle implements IFigure{
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double getArea() {
        return a*b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0)
                || (Double.compare(rectangle.b, a) == 0 && Double.compare(rectangle.a, b) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
