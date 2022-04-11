package Data;


import Interfaces.Shapes;

import java.awt.*;

public class Circle implements Shapes {
    private final double PI = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return  PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*r;
    }

    @Override
    public String getInfo() {
        return "Dla koła " + Shapes.super.getInfo();
    }
}
