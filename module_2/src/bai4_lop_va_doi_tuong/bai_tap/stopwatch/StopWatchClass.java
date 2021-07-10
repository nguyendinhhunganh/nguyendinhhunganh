package bai4_lop_va_doi_tuong.bai_tap.stopwatch;

import java.time.LocalTime;

public class StopWatchClass {
    private LocalTime startTime, endTime;
    public StopWatchClass() {
    }
    public StopWatchClass(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime(){
        return this.startTime;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public void setStartTime(){
        this.startTime = startTime;
    }
    public void setEndTime(){
        this.endTime = endTime;
    }
    public void start(){
        this.startTime = LocalTime.now();
    }
    public void stop(){
        this.endTime = LocalTime.now();
    }
    public double getElapsedTime(){
        return (this.endTime.getHour() - this.startTime.getHour()) * 3600 + (this.endTime.getMinute() - this.startTime.getMinute()) * 60 + this.endTime.getSecond() -this.startTime.getSecond();
    }
}
