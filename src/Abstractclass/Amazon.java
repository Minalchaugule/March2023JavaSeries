package Abstractclass;

public class Amazon {

	public static void main(String[] args) {
	Login lp=new Login();
	lp.title();
	lp.url();
	lp.defaultPageTimeout();
	lp.DisplayLogo();
	Page.pageFooter();//static method
	
	
	System.out.println("++++++++++++++++");
	Page p=new Login();
	p.title();
	p.url();
	p.defaultPageTimeout();
	p.DisplayLogo();
	Page.pageFooter();
	
	
	System.out.println("++++++++++++++++");
	//down casting
	//Login l=new Page();can't create oj=bject of abstract class
	}

}
