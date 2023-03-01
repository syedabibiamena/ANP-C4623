package corejava1;

public class Student_Record
{

	public static void main(String[] args)
	{
		//creating object of class EncapsulationExample
		 Student a=new Student();
		 //object is used access the methods of a class 
		 a.setId(1);
		 a.setStudent_name("Aamena");
		 a.setAge(10);
		 System.out.println("Student Data");
		 System.out.println("Id:"+a.getId()+"\n"+"Student Name:" +a.getStudent_name()+"\n"+"Student Age:"+a.getAge());
		 
}
	}
