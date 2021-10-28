package exam.models;

import java.util.Arrays;

public class MedicalRecordVip extends MedicalRecord {
    private final String[] vipTypeArr = {"VIP I", "VIP II", "VIP III"};
    private String vipType;
    private String vipDuration;

    public MedicalRecordVip(int number, int id, String name, String dayIn, String dayOut, String reason, int vipType, String vipDuration) {
    }

    public MedicalRecordVip(int number, int vipType, String name, String dayIn, String vipDuration, float hospitalCost) {
        this.vipType = vipTypeArr[vipType];
        this.vipDuration = vipDuration;
    }

    public MedicalRecordVip(int number, int id, String name, String dayIn, String dayOut, String reason, int recordType, String vipType, String vipDuration) {
        super(number, id, name, dayIn, dayOut, reason, recordType);
        this.vipType = vipType;
        this.vipDuration = vipDuration;
    }

    public String[] getVipTypeArr() {
        return vipTypeArr;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(int vipType) {
        this.vipType = vipTypeArr[vipType];
    }

    public String getVipDuration() {
        return vipDuration;
    }

    public void setVipDuration(String vipDuration) {
        this.vipDuration = vipDuration;
    }

    @Override
    public String toString() {
        return "medicalRecordVip{" +
                "vipTypeArr=" + Arrays.toString(vipTypeArr) +
                ", vipType='" + vipType + '\'' +
                ", vipDuration='" + vipDuration + '\'' +
                '}';
    }
}
