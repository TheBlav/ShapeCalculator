package Data;

import Interfaces.Shapes;

public class Triangle implements Shapes {
double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return (0.5*a)*c;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b + c);
    }

    @Override
    public String getInfo() {
        return "Dla trójkąta: " + Shapes.super.getInfo();
    }
}
