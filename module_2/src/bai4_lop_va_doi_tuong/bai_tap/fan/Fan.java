package bai4_lop_va_doi_tuong.bai_tap.fan;

public class Fan {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        FanClass fan2 = new FanClass();
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.print(fan1.toString());
        System.out.print(fan2.toString());
    }
}
