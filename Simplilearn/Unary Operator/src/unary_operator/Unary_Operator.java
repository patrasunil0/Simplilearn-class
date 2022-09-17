package unary_operator;

public class Unary_Operator 
{

	public static void main(String[] args)
	{
		int a = 5;
//		int b = a++; // b = a which is 5 & a +=1 which is 6
//		int b = ++a;
//		int b =--a;
		int b = a--;
		
		System.out.println("Value of a = "+ a);
		System.out.println("Value of b = " +b);
		

	}

}
