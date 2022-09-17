package arrays;
import java.util.Scanner;
public class For_Loop 
{

	public static void main(String[] args)
	{
		//Variable declaration
		
		int[] data = new int[6];
		Scanner obj = new Scanner(System.in);
		
		//Read Numbers from users
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter the number =");
			data[i]=obj.nextInt();
		}
		
		//print the number using for loop
		for(int i =0;i<6;i++)
		{
			System.out.println(data[i]);
		}
		//print the number using for each loop

		for (int d:data)
			System.out.println(d);
	}

}
