package javaAssignments;

public class Browser {

	public static void main(String[] args) {
		// if -else if
     String browserName="firefox";
     if(browserName=="chrome")
     {
    	 System.out.println("Launch the chrome driver");
     }
     else if(browserName=="firefox")
     {
    	 System.out.println("Launch the firefox driver");	 
     }
     else if(browserName=="safari")
     {
    	 System.out.println("Launch the safari driver");	 
     }
     else if(browserName=="IE")
     {
    	 System.out.println("Launch the IE driver");	 
     }
     else
     {
    	 System.out.println("please pass the right browser name");
     }
     
     //switch-case
     String browser="IE";
     switch (browser) {
	case "Chrome":
	{
		 System.out.println("Launch the chrome driver");	
	}
		break;
		
	case "edge":
	{
		 System.out.println("Launch the edge driver");	
	}
		break;
		
		
	case "Firefox":
	{
		 System.out.println("Launch the firefox driver");	
	}
		break;
		
	case "IE":
	{
		 System.out.println("Launch the ie driver");	
	}
		break;
		
	case "safari":
	{
		 System.out.println("Launch the safari driver");	
	}
		break;

	default:
		System.out.println("pls pass correct browser");
		break;
	}
	}

}
