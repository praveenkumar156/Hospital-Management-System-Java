package hospitalmanagement;

import java.time.LocalDateTime;

public class Appointment {
	 Doctor doctor;
	    Patient patient;
	    String dateTime;

	    public Appointment(Patient patient, Doctor doctor, String date) {
	        this.doctor = doctor;
	        this.patient = patient;
	        this.dateTime = date;
	    }


		public void showDetails()  {
	        System.out.println("Appointment on " + dateTime + " with Dr. " + doctor.name + " and Patient " + patient.name);
	       
	        
	    }



}
