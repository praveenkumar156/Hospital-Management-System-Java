package hospitalmanagement;


class DuplicatePatientException extends Exception {
 public DuplicatePatientException(String message) {
     super(message);
 }
}

class DoctorNotAvailableException extends Exception {
 public DoctorNotAvailableException(String message) {
     super(message);
 }
}


class InvalidMedicalRecordException extends Exception {
 public InvalidMedicalRecordException(String message) {
     super(message);
 }
}

