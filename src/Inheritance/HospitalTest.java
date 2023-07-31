package Inheritance;

public class HospitalTest {

	public static void main(String[] args) {
		// parent class object
Hospital h=new Hospital();
h.AccidentCare();
h.EmergencyCare();
h.TestReports();

//Apollo class object
Apollo a=new Apollo();
System.out.println("Apollo hospital details");
a.childcare();
a.EmergencyCare();
a.TestReports();
a.MaternityCare();

//upcasting
Hospital hp=new Apollo();
hp.AccidentCare();
hp.EmergencyCare();
hp.TestReports();

//downcasting-is not in java
Max m=(Max) new Hospital();






	}

}
