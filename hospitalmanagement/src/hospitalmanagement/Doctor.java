package hospitalmanagement;

import java.util.ArrayList;

public class Doctor extends Person {
      String doc ;
      
      public Doctor(String id,String name,int age ,String doc) {
    	  super(id,name,age);
    	  this.doc = doc;
      }
	
	public void displaydetails() {
		 System.out.println("Doctor: " + name + " (ID: " + id + ", Specialty: " + doc + ")");
	}
}
