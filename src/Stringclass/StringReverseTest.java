package Stringclass;

public class StringReverseTest {
	
	public static String reverseString(String s) throws Exception
	{
		//for null check string
		if(s==null) {
			System.out.println("Null values are not allowed");
			throw new Exception("String shouldnot be null");
		}
		
		//blank space
		if(s.isBlank()) {
			System.out.println("blank values are not allowed");
			throw new Exception("String shouldnot be blank");
		}
		
		
		int len=s.length();
		System.out.println(s +"length is : "+ len);
		//length check=0
		if(len==0)
		{
			System.out.println("length is zero");
			return "zero";
		}
		//length =1
		if(len==1)
		{
			return s;
		}
		//length is more than 1
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(reverseString(" "));		
System.out.println(reverseString(""));
System.out.println(reverseString("Minal"));
System.out.println(reverseString("Prisha chaugule"));
System.out.println(reverseString("123456"));
System.out.println(reverseString("S"));
System.out.println(reverseString(null));


	}

}
