package Interfaces;
public  interface Shapes {

double calculateArea();
double calculatePerimeter();

    default String getInfo() {
        return "Powierzchnia: " + calculateArea() + " Oraz obwód: " + calculatePerimeter();
    }

}
