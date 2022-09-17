package objects;

public class Setters_Gettes {

	public static void main(String[] args)
	{
		Student stud1 = new Student(); //new student is object & stud1 is reference to the object
		stud1.setAge(10);
		System.out.println(stud1.getAge());
		
		Student stud2 = new Student();
		stud2.setAge(23);
		System.out.println(stud2.getAge());
		
		System.out.println(stud1.getAge());	

	}

}

class Student {
	private int age; //instance variable
	private String name;
	private char gender;
	
	//Setters & getters for above 3 variable by source option
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{
		if(age <= 0 || age >= 140) // control the age from negative value 
		{
			age = 0;	
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}