package practice;

import java.util.Scanner;

public class Prime_Number 
{

	public static void main(String[] args)
	{
		int p;
		Scanner num = new Scanner (System.in);
		System.out.println("Enter the Number = ");
		p = num.nextInt();
		
	
		if (p==2 || p==3)
		{
			System.out.println("this is a prime number");
		}
		else if(p%2!=0 && p%3!=0) 
		{
			
			System.out.println("this is a prime number");
		}
			
		else 
		{
			System.out.println("this is not a Prime Number");
		}

	}

}
