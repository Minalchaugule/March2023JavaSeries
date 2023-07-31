package classAndObjects;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
User u1=new User();
u1.name="Prisha";
u1.age=5;
u1.city="London";

User u2=new User();
u2.name="Theia";
u2.age=6;
u2.city="Bristol";

User u3=new User();
u3.name="Anvi";
u3.age=7;
u3.city="Bath Spa";

User u4=new User();
u4.name="River";
u4.age=4;
u4.city="Cambridge";

System.out.println(u1.name + " "+u1.age +" "+ u1.city );
System.out.println(u2.name + " "+u2.age +" "+ u2.city );
System.out.println(u3.name + " "+u3.age +" "+ u3.city );
System.out.println(u4.name + " "+u4.age +" "+ u4.city );
System.out.println("===========u1=u2=================");

u1=u2;
System.out.println(u1.name + " "+u1.age +" "+ u1.city );
System.out.println(u2.name + " "+u2.age +" "+ u2.city );
System.out.println(u3.name + " "+u3.age +" "+ u3.city );
System.out.println(u4.name + " "+u4.age +" "+ u4.city );
System.out.println("============u2=u3==============");

u2=u3;
System.out.println(u1.name + " "+u1.age +" "+ u1.city );
System.out.println(u2.name + " "+u2.age +" "+ u2.city );
System.out.println(u3.name + " "+u3.age +" "+ u3.city );
System.out.println(u4.name + " "+u4.age +" "+ u4.city );
System.out.println("===========u3=u4================");

u3=u4;
System.out.println(u1.name + " "+u1.age +" "+ u1.city );
System.out.println(u2.name + " "+u2.age +" "+ u2.city );
System.out.println(u3.name + " "+u3.age +" "+ u3.city );
System.out.println(u4.name + " "+u4.age +" "+ u4.city );
System.out.println("============u4=u1================");

u4=u1;
System.out.println(u1.name + " "+u1.age +" "+ u1.city );
System.out.println(u2.name + " "+u2.age +" "+ u2.city );
System.out.println(u3.name + " "+u3.age +" "+ u3.city );
System.out.println(u4.name + " "+u4.age +" "+ u4.city );
System.out.println("============================");
	}

}
