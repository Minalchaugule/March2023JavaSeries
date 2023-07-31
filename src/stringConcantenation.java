
public class stringConcantenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "Hello";
String s1="Selenium";
int a=100;
int b=200;

System.out.println(s+s1);
System.out.println(a+b);
System.out.println(s+s1+a+b);
System.out.println(a+b+s+s1);
System.out.println(s+s1+(a+b));
System.out.println(10+20);
System.out.println(s+10);
System.out.println("===========================");
double c=12.33;
double c1=13.55;
System.out.println(c+c1);
System.out.println(s+s1+c+c1);
System.out.println(c+c1+s+s1);
System.out.println(s+s1+(c+c1));


System.out.println("===========================");
char d='a';
char d1='b';
System.out.println(d+d1);
System.out.println(a+b+d+d1);
System.out.println(d+d1+a+b);

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);
System.out.println(a*b);
System.out.println("===========================");
System.out.println("this emp is "+true);
System.out.println("Your bank account is:"+false);

System.out.println(9/3);
System.out.println(9/2); //o/p is 4.5 but as both are integer ,it round up and gives integer value 4
System.out.println(9.0/2);
System.out.println(9/2.0);
System.out.println(9.0/2.0);
System.out.println("===========================");
System.out.println(0/1);//0
System.out.println(0/100);//0
//System.out.println(9/0);//arithmatic exception
//System.out.println(2/0);//arithmatic exception
System.out.println("===========================");
System.out.println(9.0/0);//infinity
System.out.println(5.0/0.0);//infinity
System.out.println(4.3/0);//infinity
System.out.println(0.0/0);//NAN- not a number
System.out.println(0/0.0);//NAN- not a number
System.out.println(0.0/0.0);//NAN- not a number
//System.out.println(0/0);//AE

//System.out.println('a'/0);//97/0= AE
System.out.println('a'/'0');//97/48

//-128 to 127
byte b1=10;
byte b2=20;
//byte b3=b1+b2;//it is giving error as b1 and b2 value can be changed in future and sum may be exceed the range,so it is not allowed
int b3=b1+b2;
//short b4=b1+b2;//same as above error
System.out.println(b3);

System.out.println(10%2);

System.out.println(9%2);
System.out.println(50%3);

Byte h=065;//any no starting with zero is called octal number and base is 8
System.out.println(h);//53
//065=(0*8^2)+(6*8^1)+(5*8^0)=0+48+5=53

//byte f1=069;//octal no shouldnot exceed 9 

short f2=4560;
System.out.println(f2);

int f3=067456754;
System.out.println(f3);


byte t=120;
byte t1=125;
byte r=(byte) (t+t1);
System.out.println(r);//-11 : as byte range count is 256 .so 256-245 =-11 which is wrong.as we are providing byte casting it is giving that answer

float ff=12.45678123406789045f;
System.out.println(ff);//12.456781

double ff1=12.45678123406789045d;
System.out.println(ff1);//12.45678123406789045

}

}
