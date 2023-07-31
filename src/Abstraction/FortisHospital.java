package Abstraction;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical{

	@Override
	public void physioServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-physio services");
	}

	@Override
	public void cardiacServices() {
		// TODO Auto-generated method stub
		System.out.println("FH-cardiac services");
	}

	@Override
	public void ENTServices() {
		System.out.println("FH-ENT uuservices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH-neuro services");
		
	}

	@Override
	public void arthoServices() {
		System.out.println("FH-artho services");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH- oncology services");
		
	}

	@Override
	public void DentalServices() {
		System.out.println("FH-Dental services");
		
	}

	@Override
	public void gynoServices() {
		System.out.println("FH-gyno services");	
	}
	
	public void MedicalTraining()
	{
		System.out.println("FH -medical training ");
	}
	
	public void MedicalInsurance()
	{
		System.out.println("FH -medical Insurance ");
	}

	@Override
	//common method in all interfaces
	public void emergencyServices() {
		System.out.println("FH -Emergency Services ");
		
	}

	@Override
	public void test(int a) {
		System.out.println("FH -Test ");
		
	}

	@Override
	public String get(int a) {
		System.out.println("Mehtod with parameter ");
		return "pass";
	}

	@Override
	public String get(int a, int b) {
		System.out.println("method with 2 para ");
		return "Both pass";
	}

	@Override
	public void covidVaccination() {
		System.out.println("fh - covid vaccinations are avaible");
		
	}

	@Override
	public void medicalNews() {
		System.out.println("fh- Display medical news");
		
	}

}
