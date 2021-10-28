package exam.models;

public abstract class MedicalRecord {
    private int number;
    private int id;
    private String name;
    private String dayIn;
    private String dayOut;
    private String reason;
    private int recordType;
    public MedicalRecord() {
    }

    public MedicalRecord(int number, int id, String name, String dayIn, String dayOut, String reason, int recordType) {
        this.number = number;
        this.id = id;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
        this.recordType = recordType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordType() {
        return recordType;
    }

    public void setRecordType(int recordType) {
        this.recordType = recordType;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "medicalRecord{" +
                "number=" + number +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
