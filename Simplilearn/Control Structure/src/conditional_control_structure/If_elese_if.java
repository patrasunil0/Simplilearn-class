package conditional_control_structure;

public class If_elese_if 
{

	public static void main(String[] args)
	{
		int x = 98, y = 10, a = 40;
		
		if ((x>90) && (x<100))
		{
			System.out.println("My grade is = A");
		}
		else if ((y>5) && (y<11))
		{
			System.out.println("Received eligible marks in lab");
		}
		else if ((a>=40) && (a>=50))
		{
			System.out.println("I have just passed");
			
		}
		else 
		{
			System.out.println("I got some marks");
		}

	}

}
