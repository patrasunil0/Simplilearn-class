package practice;
import java.util.Scanner;

public class User_Input_ConvertNumToWord
{

	public static void main(String[] args)
	{
		int c;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Number = ");
		c = s.nextInt();
		
		//executeed by only if condition
//		if (c==1)
//			System.out.println("One");
//		if (c==2)
//			System.out.println("Two");
//		if (c==3)
//			System.out.println("Three");
//		if (c==4)
//			System.out.println("Four");
//		if (c>4 || c<1)
//			System.out.println("Invalid Number");
			
		//Executed by else if
//		if (c==1)
//			System.out.println("One");
//		else if (c==2)
//			System.out.println("Two");
//		else if (c==3)
//			System.out.println("Three");
//		else if (c==4)
//			System.out.println("Four");
//		else 
//			System.out.println("Invalid Number");
		
		
		//Switch condition 
		
		switch (c) 
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
			

	}

}
