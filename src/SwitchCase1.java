
public class SwitchCase1 {

	public static void main(String[] args) {
		//vowel a,e,i,o,u
		
		char ch='u';
		switch (ch) {
		case 'a':
			System.out.println("it is vowel");
			break;
			
		case 'e':
			System.out.println("it is vowel");
			break;
			
		case 'i':
			System.out.println("it is vowel");
			break;
			
		case 'o':
			System.out.println("it is vowel");
			break;
			
		case 'u':
			System.out.println("it is vowel");
			break;

		default:
			System.out.println("It is consonant");
			break;
		}
		//environment : dev,qa,prod,uat,stage
		
		String env="Prod";
		switch (env) {
		case "QA":
			System.out.println("Run on QA environment");
			break;
			
		case "Dev":
			System.out.println("Run on dev environment");
			break;
			
		case "UAT":
			System.out.println("Run on UAT environment");
			break;
			
		case "Stage":
			System.out.println("Run on Stage environment");
			break;
			
		case "Prod":
			System.out.println("Run on Prod environment");
			break;

		default:
			System.out.println("Pls provide right environment:"+env);
			break;
		}
		//months in year
		String month="April";
		switch (month) {
		case "Jan":
			System.out.println("First month of the year");
			break;
			
		case "Feb":
			System.out.println("Second month of the year");
			break;
			
		case "Aug":
			System.out.println("8th month of the year");
			break;

		default:
			System.out.println("Provide a correct month ");
			break;
		}
		//Cab booking app-uber
		String carType="Mini";
		int persons=5;
		switch (carType) {
		case "Mini":
			if(persons<=4) {
				System.out.println("mini is allocated");
			}
			break;
			
		case "sedan":
			if(persons>=5) {
				System.out.println("Sedan is allocated");
			}
			break;
			
			
		default:
			System.out.println("Can't allocate");
			break;
		}
		//Authontication/RBAC-Admin,Agent ,Team leader,Aggregrator,customer

	}

}
