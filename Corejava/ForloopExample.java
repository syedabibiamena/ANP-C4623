//Q2:Write a Java program that prints the multiplication table of a given 
//number. The program should prompt the user to enter a number, and then 
//print the multiplication table for that number from 1 to 10.
//Write a Java program that prompts the user to enter their age and then 
//determines whether they are eligible to vote or not. The program should
//print a message saying whether the user is eligible to vote or not based 
//on their age.//program for table
package corejava1;

import java.util.Scanner;

public class ForloopExample
{
	public static void main(String[] args)
	{
	//creating a scanner class 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num to print table");
	//creating a variable
	int num=sc.nextInt();
	for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
