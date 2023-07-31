package Encapsuation;
//POJO class- Plain Old java Object class
//pojo class never be the child of any class
public class Register {
	
	private String name;
	private int age;
	private long phnumber;
	private String city;
	private boolean isPerm;
	
	public Register(String name, int age, long phnumber, String city, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.phnumber = phnumber;
		this.city = city;
		this.isPerm = isPerm;
		
		}
	
	public Register(String name, long phnumber) {
		super();
		this.name = name;
		this.phnumber = phnumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	

}
