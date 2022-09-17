package conditional_control_structure;

public class While_Loop 
{

	public static void main(String[] args) 
	{
		//int i = 1;
		
//		for (i=1;i<5;i++)
//		{
//			System.out.println(i);
//		}
		
//		while (i<5)
//		{
//			System.out.println(i);
//			i = i+1;
//		}

		
		int n = 1000;
		
		while (true)
		{
			if (n%123 == 0)
			{
				System.out.println(n);
				break;
			}
			n=n+1;
		}
		
		
	}

}
