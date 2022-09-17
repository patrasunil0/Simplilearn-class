package practice;
import java.util.Scanner;

public class Multiple_method {
	
	public static String Gm()
	
	{
		return("Good Morning");
	}
	public static String Ga()
	{
	return ("Good Afternoon");
	}
	public static void main(String[] args) {

		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the time = ");
		n = obj.nextInt();
		
		//Single line code Ternery type condition
		
		System.out.println((n>=12)?Ga():Gm());
		
		
//		if (n>=12)
//			System.out.println(Ga());
//		else 
//			System.out.println(Gm());
		
		
		
		
		
	}

}
