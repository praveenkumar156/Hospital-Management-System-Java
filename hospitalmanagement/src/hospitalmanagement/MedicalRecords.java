package hospitalmanagement;

public class MedicalRecords {
	String diagnosis;
	String treatment;
	
	public MedicalRecords(String diagnosis , String treatment) throws InvalidMedicalRecordException {
		if (diagnosis.isEmpty() || treatment.isEmpty()) {
            throw new InvalidMedicalRecordException("Diagnosis or treatment cannot be empty.");
        }
		this.diagnosis =  diagnosis;
		this.treatment = treatment;
	}
	public void showRecord() {
		 System.out.println("Diagnosis: " + diagnosis + ", Treatment: " + treatment);
	}

}
