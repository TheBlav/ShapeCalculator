package Data;


import Interfaces.Shapes;


public class Square implements Shapes {
double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 4 * a;
    }

    @Override
    public double calculatePerimeter() {
        return a * a;
    }

    @Override
    public String getInfo() {
        return "Dla kwadratu: " + Shapes.super.getInfo();
    }
}
