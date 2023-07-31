package classAndObjects;

import java.util.ArrayList;

public class DeviceListwithswitch {

	public ArrayList<String> getDeviceList(String empName)
	{
		System.out.println("Getting employee devices :" + empName);
		ArrayList<String>deviceList=new ArrayList<String>();
		switch (empName) {
		case "Minal":
			deviceList.add("Hp Laptop");
			deviceList.add("Android Phone");
			deviceList.add("IFB Headsets");
			deviceList.add("Noisefit Watch");
			break;
			
		case "Prisha":
			deviceList.add("Iphone 10");
			deviceList.add("Tablet");
			break;
			
		case "Sandy":
			deviceList.add("Acer Laptop");
			deviceList.add("Apple earphones");
			deviceList.add("Headset");	
			break;

		default:
			System.out.println("Pls pas correct employee name.Employee is not found....");
			break;
		}
		return deviceList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeviceListwithswitch dls=new DeviceListwithswitch();
		ArrayList<String>as=dls.getDeviceList("Sandy");
		System.out.println(as);
	}

}
