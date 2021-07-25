package bai_7_abtract_class_interface.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Square(6);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            shape.resize(Math.random()*100);
        }
        for (Shape shape :shapes) {
            System.out.println(shape);
        }
    }
}
