/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 12/12/2022
 * Platform/compiler: Eclipse 
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Kaan Sen________
*/
public class Customer {

	private String name;
	private int age;
	
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c)
	{
		this.name = c.getName();
		this.age = c.getAge();
	}
	
	@Override
	public String toString()
	{
		return name + ", " + age + " years old";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
