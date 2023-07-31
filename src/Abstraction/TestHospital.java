package Abstraction;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
        fh.arthoServices();
        fh.cardiacServices();
        fh.emergencyServices();
        fh.ENTServices();
        fh.neuroServices();
        fh.gynoServices();
        fh.MedicalInsurance();
        fh.MedicalTraining();
        fh.covidVaccination();
        fh.MedicalResearch();
        System.out.println("Minimum fee of US :"+USMedical.min_fee);
        USMedical.USMedPharmacy();
        fh.billing();
        
        //can't create object of interface -as there is no method body
       // USMedical us=new USMedical();
        
        System.out.println("++++++++++++++++++++");
        //upcasting
        USMedical fh1=new FortisHospital();
        fh1.cardiacServices();
        fh1.ENTServices();
        fh1.physioServices();
        fh1.emergencyServices();
        
        System.out.println("++++++++++++++++++++");
        //upcasting
        UKMedical uk=new FortisHospital();
        uk.arthoServices();
        uk.emergencyServices();
        uk.arthoServices();
        uk.emergencyServices();
        
        System.out.println("++++++++++++++++++++");
        //upcasting
        IndianMedical i=new FortisHospital();
        i.DentalServices();
        i.gynoServices();
        i.oncologyServices();
        i.emergencyServices();
        
        //downcasting -downcasting is not allowed ,we can't create object of interface
        //FortisHospital fh2=new IndianMedical();
        
       
	}

}
