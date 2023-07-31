package Stringclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringInterview {

public static String reverseString(String s) throws Exception
{
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);
	}
	return rev;
	
}



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<String> browserList=Arrays.asList("Chrome","Firefox","Edge","Safari");
		System.out.println(browserList);
	
		for(int i=0;i<=browserList.size()-1;i++)
		{
			System.out.println(i);
		}



}

	

}

	


