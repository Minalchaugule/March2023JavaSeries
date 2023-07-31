package Abstraction;

public interface USMedical extends WHO,UN {
	//method don't have body only signature/no business logic-Abstract methods
	//abstract keywords not mandatory write
	//abstract static method not allowed
	
	static int min_fee=100;
	
	public void physioServices();
	
	public void cardiacServices();
	
	public void ENTServices();
	
	public void emergencyServices();
	
	public void test(int a);
	
	public String get(int a);

	public String get(int a,int b);
	
	//jDK 1.8 ,added 2 new methods
	//1.interface can have static method with method body
	
	public static void USMedPharmacy()
	{
		System.out.println("Implementing Us med pharmacy");
	}
	
	public static void USMedPharmacy(int a)
	{
		System.out.println("Implementing Us med pharmacy with para");
	}
	//2.we can hav default non static method
	
	default void billing()
	{
		System.out.println("default billing US Medical");
	}
}
