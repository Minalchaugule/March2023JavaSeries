
public class switchCase {

	public static void main(String[] args) {
		//switch is used with int,short,byte,char and string
		// browser selection-string
String Browser="chrome";
switch (Browser) {
case "chrome":
System.out.println("Launch chrome browser");
	break;
	
case "Firefox":
System.out.println("Launch firefox browser");
	break;
	
case "IE":
System.out.println("Launch IE browser");
	break;
case "Safari":
System.out.println("Launch safari browser");
	break;
case "Edge":
System.out.println("Launch Edge browser");
	break;
case "Chromium":
System.out.println("Launch chromium browser");
	break;

default:
	System.out.println("Pls pass the right browser"+Browser);
	break;
}
	
	//Grade -int
	int marks=9;
	switch (marks) {
	case 10:
		System.out.println("Grade D");
		break;
		
	case 90:
		System.out.println("Grade A");
		break;

	default:
		System.out.println("Fail");
		break;
	
}
	//char
	char ch='b';
	switch (ch) {
	case 'a':
		System.out.println("Pass a");
		break;
		
	case 'c':
		System.out.println("Pass a");
		break;

	default:
		System.out.println("failed");
		break;
	}
	//short
	short sh=23;
	switch (sh) {
	case 20:
		System.out.println("Pass 20");
		break;
		
	case 23:
		System.out.println("Pass 23");
		break;

	default:
		System.out.println("Fail");
		break;
	}
	
	//byte
	byte a=2;
	switch (a) {
	case 3:
		System.out.println("Pass");
		break;

	default:
		System.out.println("Fail");
		break;
	}
	}

}
