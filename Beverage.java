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
public abstract class Beverage {

	private String bevName;
	private Type type;
	private Size size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public abstract double calcPrice();

	public String toString()
	{
		return bevName + "," + size;
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		boolean result; 
		if(bevName.equals(anotherBev) && type==((Beverage) anotherBev).getType() && size==((Beverage) anotherBev).getSize())
		{
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
//	public double addSizePrice()
//	{
//		
//	}

	public String getBevName() {
		return bevName;
	}

	public void setBevName(String bevName) {
		this.bevName = bevName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getSizePrice() {
		return sizePrice;
	}	
}
