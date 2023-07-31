package classAndObjects;

public class Student {

	String name;
	int marks;
	char grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student();
      s1.name="Tanish";
      s1.marks=90;
      s1.grade='A';
      
      Student s2=new Student();
      s2.name="Anish";
      s2.marks=80;
      s2.grade='B';
      
      Student s3=new Student();
      s3.name="Ranish";
      s3.marks=60;
      s3.grade='C';
      
      System.out.println(s1.name +" "+ s1.marks +" "+ s1.grade);
      System.out.println(s2.name +" "+ s2.marks +" "+ s2.grade);
      System.out.println(s3.name +" "+ s3.marks +" "+ s3.grade);
      System.out.println(s1);
      
      //object created but no reference -no reference object
      new Student().name="Minal";//for each time ,it will create a new object
      new Student().marks=90;
      new Student().grade='A';
      
      //create reference 
      Student s4;
      s4=new Student();
      s4.name="Anvi";
      s4.marks=88;
      s4.grade='A';
      System.out.println(s4.name +" "+ s4.marks +" "+ s4.grade);
      
      //null reference
      Student s5=new Student();
      s5=null;
      
      s5.name="Peter";
      System.out.println(s5.name);//null pointer exception as object is null
      
      
      System.gc();
      
	}

}
