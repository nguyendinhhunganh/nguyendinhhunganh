package bai_7_abtract_class_interface.bai_tap.Colorable;


import bai_7_abtract_class_interface.bai_tap.resizeable.Rectangle;
import bai_7_abtract_class_interface.bai_tap.resizeable.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(4);
        squares[2] = new Square(4,"blue", false);
        for (Square square: squares) {
            System.out.println(square);
            if (square.isFilled()) {
                square.howToColor();
            }
        }
    }
}
