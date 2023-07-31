package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = null;
		if( browser==null)
			try {
		throw new Exception("No browser exception");
			}
		catch(Exception e)
		{
			System.out.println("Browser is not found");
			e.printStackTrace();
		}
	}

}
	