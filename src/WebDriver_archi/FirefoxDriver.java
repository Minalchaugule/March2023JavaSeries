package WebDriver_archi;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver()
	{
		System.out.println("Launch firefox Driver");
	}


	@Override
	public void click() {
		System.out.println(" Firefox -click on element");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Firefox send value");
		
	}

	@Override
	public void quit() {
		System.out.println("firefox -close all browser windows");
		
	}

	@Override
	public void finDelement(String ele) {
		System.out.println("firefox -close all browser windows");
	}

}
