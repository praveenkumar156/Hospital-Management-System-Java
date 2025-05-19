package hospitalmanagement;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class HospitalManagement {
	public ArrayList<Patient> patients = new ArrayList<>();
	public ArrayList<Doctor> doctors = new ArrayList<>();
	public ArrayList<Appointment> appt  = new ArrayList<>();
	
	 public void addPatient(Patient newPatient) throws DuplicatePatientException {
	        for (Patient p : patients) {
	            if (p.id.equals(newPatient.id)) {
	                throw new DuplicatePatientException("Patient already exists.");
	            }
	        }
	        patients.add(newPatient);
	    }

	    public void addDoctor(Doctor doctor) {
	        doctors.add(doctor);
	    }

	    public void makeAppointment(String appointmentId, String patientId, String doctorId, String date)
	            throws DoctorNotAvailableException {
	        Patient patient = null;
	        Doctor doctor = null;

	        for (Patient p : patients) {
	            if (p.id.equals(patientId)) {
	                patient = p;
	                break;
	            }
	        }

	        for (Doctor d : doctors) {
	            if (d.id.equals(doctorId)) {
	                doctor = d;
	                break;
	            }
	        }

	        if (patient == null || doctor == null) {
	            throw new DoctorNotAvailableException("Doctor or Patient not found.");
	        }

	        appt.add(new Appointment( patient, doctor, date));
	    }

	    public void addMedicalRecord(String patientId, MedicalRecords record) {
	        for (Patient p : patients) {
	            if (p.id.equals(patientId)) {
	                p.addRecords(record);
	                return;
	            }
	        }
	        System.out.println("Patient not found.");
	    }

	    public void showAllPatients() {
	        for (Patient p : patients) {
	            p.displayInfo();
	            for (MedicalRecords r : p.records) {
	                r.showRecord();
	            }
	            System.out.println("----------");
	        }
	    }

	    public void showAllAppointments() {
	        for (Appointment a : appt) {
	             a.showDetails();
	            System.out.println("----------");
	        }
	    }

		
}
