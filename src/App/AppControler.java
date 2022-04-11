package App;

import Data.Circle;
import Data.Square;
import Data.Triangle;
import IO.Io;
import IO.Printer;

import java.util.InputMismatchException;

public class AppControler {
    Printer printer = new Printer();
    Io inOut = new Io();

    public void appControler() {

        inOut.circle();
        inOut.square();
        inOut.triangle();


    }





}