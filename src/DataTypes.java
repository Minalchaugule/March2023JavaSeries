
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte- size :1byte =8 bits
		//range= -128 to 127 =-2^7 to 2^7-1
		byte b=20;
		b=34;
		byte b1=-120;
		//byte b3=130;
		System.out.println(b1);
		
		
		//short : Range -32768 to 32767
		//size= 2 bytes=2*8=16 bits
		short s= 23000;
		short s1=-20000;
		System.out.println(s1);
		
		//int:
//		range:
//			size:4*8=32bits
int a=10567;
int a1=0;
int a2=1;
int a3=-867;
System.out.println(a3);

 //long: range=
 //size=8*8=64bits
//eg=population,speed of light ,distance between two poles,no of covid vaccinations etc
long l1=23458790764532l;
long l=1023456789l;
System.out.println(l1);

//float : range=
//size =4 bytes=4*8=32 bits
//range after decimal point,it will take 6 to 7 digits
float f= 34.56f;
float f1=(float)7896.456;
float f2=100;
System.out.println(f);
System.out.println(f1);
System.out.println(f2);

//Double : size=8*8=64 bits
//range:after decimal point,it will take 15 digits
double d=12.456789d;
System.out.println(d);

//char: unicode:ascii char + symbolic char+ chinese+japanese
//size: 2bytes=2*8=16 bits
//range : a to z=97 to 122 , 
          //AtoZ=65 to 90
         //0-9=48 to 57
char c='d';
char c1='a';
char c4='b';
char c2='1';
char c22='2';
char c3='&';
System.out.println(c2);
System.out.println(c1+c4);//97+98=195
System.out.println(c+""+c1);
System.out.println(c2+c22);
System.out.println((int)'@');
System.out.println((byte)'$');
System.out.println((byte)' ');

int go=100;
char hop= 'a';
System.out.println(go+hop);

//boolean : true/false
//size:1bit=appro 1 bit(0.99999)
boolean flag=true;
boolean flag1=false;
System.out.println(flag);
	
	

	}

}