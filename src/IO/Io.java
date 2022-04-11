package IO;
import Data.Circle;
import Data.Square;
import Data.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Io {

    Printer printer = new Printer();
    Scanner sc = new Scanner(System.in);
    double a;

    public double getDouble() {

        a = sc.nextDouble();
        return a;
    }
    public void nextLine(){
        sc.nextLine();
    }

    public void circle() {
        boolean error = false;
        do {
            try {
                printer.printer("Podaj promień koła r: ");
                double r = getDouble();
                Circle circle = new Circle(r);
                printer.printer(circle.getInfo());
                error = true;
            } catch (InputMismatchException e) {
                System.err.println("Nie została podana liczba");
                error = false;
                sc.nextLine();
            }
        } while (!error);
    }

    public void square() {
        boolean error = false;
        do {
            try {

                printer.printer("Kwadrat - poda krawędź a: ");
                double a = getDouble();
                Square square = new Square(a);
                printer.printer(square.getInfo());
                error = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Nie została podana liczba");
                error = false;
                sc.nextLine();
            }
        }while (!error);
    }

    public void triangle() {
        boolean error = false;
        do {
            try {

                printer.printer("Trójkąt - podaj bok a: ");
                double a = getDouble();
                printer.printer("Trójkąt - podaj bok b: ");
                double b = getDouble();
                printer.printer("Trójkąt - podaj bok c: ");
                double c = getDouble();


                Triangle triangle = new Triangle(a,b,c);
                printer.printer(triangle.getInfo());
                error = true;
            }
            catch (InputMismatchException e) {
                System.err.println("Nie została podana liczba");
                error = false;
            sc.nextLine();
            }
        }while (!error);
    }
}

