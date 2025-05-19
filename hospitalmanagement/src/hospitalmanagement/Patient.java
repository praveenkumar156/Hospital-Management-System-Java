package hospitalmanagement;

import java.util.ArrayList;

 public class Patient extends Person {
	ArrayList<MedicalRecords> records;
	
	public Patient(String id,String name,int age) {
		super(id,name,age);
		records = new ArrayList<>();
	}
	public void addRecords(MedicalRecords record) {
		records.add(record);
	}
	public void displayInfo() {
		System.out.println("Patient: " + name + " (ID: " + id + ", Age: " + age + ")");
		
	}
	public void displaydetails() {
        displayInfo();
    }

}
