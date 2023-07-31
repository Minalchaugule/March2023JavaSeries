package WebDriver_archi;

import org.openqa.selenium.safari.SafariDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ChromeDriver d=new ChromeDriver();
//FirefoxDriver d1=new FirefoxDriver();

		String browserName="Chrome";
		WebDriver driver=null;
		
		switch (browserName.toLowerCase()) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
			
		case "Firefox":
			driver=new FirefoxDriver();
			break;
			
//		case "IE":
//			driver=new IEDriver();
//			break;
//		case "Edge":
//			driver=new EdgeDriver();
//			break;
//		case "safari":
//			driver=new SafariDriver();
//			break;

		default:
			System.out.println("Pass correct browser");
			break;
		}
		
driver.finDelement("");
driver.click();
driver.sendKeys();
//driver.submit();
driver.quit();

System.out.println("+++++++++++++++");


//d1.finDelement("");
//d1.click();
//d1.sendKeys();
////d1.submit();
//d1.quit();
	}
	

}
