package corejava1;

interface MyInterface 
{
public void doSomething();//Interface method() without body...
}
class MyClass implements MyInterface//Creating class Monkey 
{
	public void doSomething()//Body of interface method 
	{
		System.out.println("Doing something!");
	}
}
class MyMain//Creating class with main method()
{
	public static void main(String[] args)
	{
		MyClass  m= new MyClass ();//Creating object of class 
		m.doSomething();//Calling method() of interface		
	}
}