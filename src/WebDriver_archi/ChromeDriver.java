package WebDriver_archi;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver()
	{
		System.out.println("Launch chrome Driver");
	}

	@Override
	public void click() {
		System.out.println("click on element");
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("send values ");
	}


	public void submit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		System.out.println("close all browser windows");
		
	}

	@Override
	public void finDelement(String ele) {
		System.out.println("Find element on webPage "+ele);
		
		
	}

	
}
