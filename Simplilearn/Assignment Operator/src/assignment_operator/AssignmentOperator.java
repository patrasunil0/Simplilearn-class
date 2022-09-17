package assignment_operator;

public class AssignmentOperator 
{

	public static void main(String[] args) 
	{
		int a = 40, b = 20;
		System.out.println("1st number is = " + a);
		System.out.println("2nd Number is = " + b);

		// use compound addition assignment operator a += b
		
		a += b; //a = a + b
		System.out.println("value is = " + a); // new value is a  = 60
		
		// use compound subtraction assignment operator a -= b
		
		a -= b; //a = a-b\
		System.out.println("Value of subtraction is = " +a);
		
		// use compound multiplication assignment operator a *= b 
		
		a *= b; // a = a*b
		
		System.out.println("value of multiplication is = " + a);
	}

}
