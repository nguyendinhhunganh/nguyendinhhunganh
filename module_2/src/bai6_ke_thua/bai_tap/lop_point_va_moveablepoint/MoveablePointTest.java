package bai6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablepoint = new MoveablePoint();
        System.out.println(moveablepoint);
        MoveablePoint moveablePoint1 = new MoveablePoint(4,7);
        System.out.println(moveablePoint1);
        MoveablePoint moveablePoint2 = new MoveablePoint(4,5,7,9);
        System.out.println(moveablePoint2);
    }
}
