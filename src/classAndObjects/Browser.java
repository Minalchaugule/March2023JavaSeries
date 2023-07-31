package classAndObjects;

import java.util.ArrayList;

public class Browser {
	//WAF
	//get employeedevices
	//you have to collect all devices and return it
	
	public ArrayList<String> getEmployeeDevices(String empName)
	{
		System.out.println("Getting the device list for :"+ empName);
		//empName=empName.trim().toLowerCase();
		ArrayList<String> deviceList=new ArrayList<String>();
		
		if(empName.equalsIgnoreCase("Minal"))
		{
			deviceList.add("Hp Laptop");
			deviceList.add("Android Phone");
			deviceList.add("IFB Headsets");
			deviceList.add("Noisefit Watch");	
		}
		else if(empName.equalsIgnoreCase("Prisha"))
		{
			deviceList.add("Iphone 10");
			deviceList.add("Tablet");	
		}
		else if(empName.equalsIgnoreCase("Sandy"))
		{
			deviceList.add("Acer Laptop");
			deviceList.add("Apple earphones");
			deviceList.add("Headset");	
		}
		else
		{
			System.out.println("Pls pass the correct employee name....Employee name is not found...");
		}
		return deviceList;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser b=new Browser();
		ArrayList<String> dl=b.getEmployeeDevices("Minal");
		System.out.println(dl);
		System.out.println("Total no of dvices: "+dl.size());
	}

	}
