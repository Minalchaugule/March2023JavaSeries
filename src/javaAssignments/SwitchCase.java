package javaAssignments;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String carType="Sedan";
 switch (carType) {
case "Mini":
	System.out.println("Mini is allocated");
	break;
	
case "Sedan":
	System.out.println("Sedan is allocated");
	break;
	
case "SUV":
	System.out.println("SUV is allocated");
	break;
	
case "Premium":
	System.out.println("Premium is allocated");
	break;

default:
	System.out.println("please select the right car type");
	break;
}
	}

}
