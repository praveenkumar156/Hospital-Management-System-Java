package hospitalmanagement;
import java.time.LocalDateTime;
import java.util.Scanner;
public class MainMethod {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HospitalManagement hms = new HospitalManagement();

	        while (true) {
	            System.out.println("---- Hospital Management System ---");
	            System.out.println("1. Add Patient");
	            System.out.println("2. Add Doctor");
	            System.out.println("3. Make Appointment");
	            System.out.println("4. Add Medical Record");
	            System.out.println("5. Show All Patients");
	            System.out.println("6. Show All Appointments");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            try {
	                switch (choice) {
	                    case 1 :
	                        System.out.print("Patient ID: ");
	                        String id = sc.nextLine();
	                        System.out.print("Name: ");
	                        String name = sc.nextLine();
	                        System.out.print("Age: ");
	                        int age = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Contact: ");
	                        String contact = sc.nextLine();
	                        hms.addPatient(new Patient(id,name,age));
	                        System.out.println("Patient added.");
	                    
	                    case 2 :
	                        System.out.print("Doctor ID: ");
	                        String did = sc.nextLine();
	                        System.out.print("Name: ");
	                        String name1 = sc.nextLine();
	                        System.out.print("Age: ");
	                        int age1 = sc.nextInt();
	                        sc.nextLine();
	                        System.out.print("Contact: ");
	                        String contact1 = sc.nextLine();
	                        System.out.print("Specialization: ");
	                        String spec = sc.nextLine();
	                        hms.addDoctor(new Doctor(did, name1, age1, contact1));
	                        System.out.println("Doctor added.");
	                    
	                    case 3 :
	                        System.out.print("Appointment ID: ");
	                        String aid = sc.nextLine();
	                        System.out.print("Patient ID: ");
	                        String pid = sc.nextLine();
	                        System.out.print("Doctor ID: ");
	                        String did1 = sc.nextLine();
	                        System.out.print("Date (dd-mm-yyyy): ");
	                        String date = sc.nextLine();
	                        hms.makeAppointment(aid, pid, did1, date);
	                        System.out.println("Appointment booked.");
	                    
	                    case 4 :
	                        System.out.print("Patient ID: ");
	                        String pid1 = sc.nextLine();
	                        System.out.print("Diagnosis: ");
	                        String diag = sc.nextLine();
	                        System.out.print("Treatment: ");
	                        String treat = sc.nextLine();
	                        MedicalRecords record = new MedicalRecords(diag, treat);
	                        hms.addMedicalRecord(pid1, record);
	                        System.out.println("Medical record added.");
	                    
	                    case 5 : hms.showAllPatients();
	                    case 6 : hms.showAllAppointments();
	                    case 0 : 
	                        System.out.println("Goodbye!");
	                        sc.close();
	                        return;
	                    
	                    default : System.out.println("Invalid choice.");
	                }
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	}

}
