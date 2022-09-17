package type_casting;

public class Type_Casting 
{

	public static void main(String[] args) 
	{
		//Widening type casting.
		
		int Box_version = 200;
		
//		long intermidiate_box_version = Box_version;
		
		float New_box_version = Box_version;
		
		System.out.println("Before Type casting value is "+ Box_version);
		
//		System.out.println("1st  level version conversion "+ intermidiate_box_version);
		
		System.out.println("after Type casting = " + New_box_version);
		
		//Narrowing Type casting
		
		double value = 200.147;
		
		int value1 = (int) value;
		System.out.println("Number double before conversion = "+value);
		System.out.println("Number int after conversion = " +value1);
		
		
		
	}

}
