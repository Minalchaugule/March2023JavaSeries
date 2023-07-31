
public class stringDemo {

	public static void main(String[] args) {
		// 1.
		String a ="Hello";
        String b = " Naveen K";
        System.out.println(a +b);
        //2.
        byte c=74;
        byte d=36;
        int sum=c+d;
        System.out.println("sum is:"+sum);
       //3. 
        byte s=50;
        byte s1=3;
        System.out.println(s/s1);
        System.out.println(s%s1); 
     //4. int x=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) ;
        float a11=25.5f;
        float a12=3.5f;
        float b13=40.5f;
        float b14=4.5f;
        
        float x=(a11*a12-a12*a12);
        float y=(b13-b14);
        float z=x/y;
        System.out.println(z);
       
        
        //5.concat string hello selenium and char t
        
        String s11="Hello Selenium";
        System.out.println(s11+'t');
        
        //6.Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 

//"Your Total amount is. 3700".
        
        int l=100;
        int m=200;
        int n=3400;
        int Sum =l+m+n;
        System.out.println("Yout Total amount is:"+Sum);
        
        //7.Print the ASCII value of the character 'h'.
        int ch='h';
        System.out.println(ch);
        
        //8.Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
        
        
        int ch1='d';
        System.out.println(ch1);
        int p1=ch1+3;
        System.out.println(p1);
        
        //9.Write a program to find the square of the number 3.9.
        float sn=3.9f;
        System.out.println(sn*sn);
        
        
	}

}
