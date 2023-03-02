package corejava1;

 class Animal {
//single heritance 
	 //method
	 public void display () {
		 System.out.println("inside parent class");
		 
	 }
	
}
 //child class
 class Dog extends Animal
 {
public void sound()
{
	System.out.println("barks.......");
	}
	 
 }
 class puppy extends Dog
 {
	 public void run()
	 {
		 System.out.println("runs...");
	 }
 }
class Tester
{
	public static void main(String []args)
	{
	Dog a=new Dog()	;//creating object of child class
	a.display();
	a.sound();
			
	}
	}