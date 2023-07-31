package Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Rectangle r=new Rectangle();
  System.out.println(r.height);
  System.out.println(r.length);
  r.calculateArea();
  
  Rectangle r1=new Rectangle(5.45,6.90);

  r1.calculateArea();
	}

}
