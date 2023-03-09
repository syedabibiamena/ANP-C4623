package corejava1;

import java.util.Scanner;

public class SwitchCaseEx1
{
	public static void main(String[] args)
	{
		// Creating scanner to take input from user
		Scanner sc = new Scanner(System.in);
		int n;
		
		do
		{
		
            System.out.print("Enter your choice: ");
            n=sc.nextInt();
            switch(n)
            {
            case 1:
                System.out.println("Sunday ");
                break;
            case 2:
                System.out.println("Monday ");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
                
            }
           
		}
		 while(n!=4);

	}

}