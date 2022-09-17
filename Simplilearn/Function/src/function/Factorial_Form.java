package function;

public class Factorial_Form 
{

	public static void testmethod()
	{
		System.out.println("This is function which can call and execute multiple time");
	}
	
	public static int factorial(int n) 
	{

		int fact=1;
		for(int i=1;i<=n;i++)
			fact = fact*i;
		return fact;
	}
	public static void main(String[] args) 
	{
		
		//traditional way to find factorial form
//		int n=4, fact = 1;
//		int n1 =5, fact1 =1;
//		int n2 =6, fact2 =1;
//		
//		for(int i=1;i<=n;i++)
//			fact = fact*i;
//		for(int i=1;i<=n1;i++)
//			fact1 = fact1*i;
//		for(int i=1;i<=n2;i++)
//			fact2 = fact2*i;
//		
//			System.out.println(fact);
//			System.out.println(fact1);
//			System.out.println(fact2);
		
		testmethod();
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		
		
	}

}
