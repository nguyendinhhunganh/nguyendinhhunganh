package exam.models;

public class MedicalRecordNormal extends MedicalRecord {
    private float hospitalCost;

    public MedicalRecordNormal() {
    }

    public MedicalRecordNormal(float hospitalCost) {
        this.hospitalCost = hospitalCost;
    }

    public MedicalRecordNormal(int number, int id, String name, String dayIn, String dayOut, String reason, int recordType, float hospitalCost) {
        super(number, id, name, dayIn, dayOut, reason, recordType);
        this.hospitalCost = hospitalCost;
    }

    public float getHospitalCost() {
        return hospitalCost;
    }

    public void setHospitalCost(float hospitalCost) {
        this.hospitalCost = hospitalCost;
    }

    @Override
    public String toString() {
        return "medicalRecordNormal{" +
                "hospitalCost=" + hospitalCost +
                '}';
    }
}
