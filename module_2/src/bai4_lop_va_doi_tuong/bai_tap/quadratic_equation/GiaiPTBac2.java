package bai4_lop_va_doi_tuong.bai_tap.quadratic_equation;
import java.util.Scanner;
public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a == 0) {
            System.out.println("Phuong trinh co 1 nghiem: " + (-c / b));
        } else {
            if (quadraticEquation.getDiscriminant() > 0){
                System.out.print("Equation has 2 roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
            }
            else if (quadraticEquation.getDiscriminant() == 0){
                System.out.print("Equation has 1 roots: " + quadraticEquation.getRoot1());
            }
            else System.out.print("The equation has no roots");
        }
    }
}
