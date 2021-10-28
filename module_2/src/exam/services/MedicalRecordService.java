package exam.services;

import exam.models.MedicalRecord;

public interface MedicalRecordService {
    public void addNewVip();
    public void addNewNormal();
    public void delete();
    public void display();
    public MedicalRecord isMedicalRecordService(int id);
}
