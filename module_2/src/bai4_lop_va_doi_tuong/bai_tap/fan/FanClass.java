package bai4_lop_va_doi_tuong.bai_tap.fan;

public class FanClass {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public FanClass() {
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if (this.on == true){
            return "speed: " + this.getSpeed() + "\tcolor: " + this.getColor() + "\tradius: " + this.getRadius() + "\nfan is on";
        }
        else {
            return "color: " + this.getColor() + "\tradius: " + this.getRadius() + "\nfan is off";
        }
    }
}