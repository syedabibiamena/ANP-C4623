package corejava1;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// Creating Scanner to take input from user
		Scanner sc = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter a Positive number:");
			n=sc.nextInt();
		}
       while(n<=0);
       
    	   int fact=1;
    	   for(int i=1;i<=n;i++)
    	   {
    		   fact *=i;
    	   }
    
    	  System.out.println(n+"!="+ fact); 
       
	}

}
