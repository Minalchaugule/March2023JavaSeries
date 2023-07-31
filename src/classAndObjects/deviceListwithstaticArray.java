package classAndObjects;

import java.util.Arrays;

public class deviceListwithstaticArray {
	
	public String[] getDeviceList(String empName)
	{
		System.out.println("Getting employee devices: "+empName);
		String s[]=new String[5];
		
		switch (empName) {
		case "Minal":
			 s[0]="HP Laptop";
			 s[1]="Desktop";
			 s[2]="Android phone";
			 s[3]="IFB Headset";
			break;
			
		case "Prisha":
			 s[0]="Iphone 11";
			 s[1]="Macbbok";
			break;
			
		case "Sandy":
			 s[0]=" Laptop";
			 s[1]="Apple Earphones";
			 s[2]="Tablet";
			break;

		default:
			System.out.println("Pls pas correct employee name.Employee is not found....");
			break;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deviceListwithstaticArray dlsa=new deviceListwithstaticArray();
		String[] ls=dlsa.getDeviceList("Sandy");
		System.out.println(Arrays.toString(ls));
		
	}

}
