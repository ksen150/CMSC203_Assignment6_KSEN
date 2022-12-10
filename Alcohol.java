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
public class Alcohol extends Beverage {

	private boolean isWeekend;
	private final double weekendCost = 0.60;
	
	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	@Override
	public String toString()
	{
		String message = getBevName() + ", " + getSize();
		
		if(isWeekend)
		{
			message += " Weekend";
		}
		message += ", $" + calcPrice();
		return message;
	}
	
	public boolean equals(Object anotherBev)
	{
		Alcohol other = (Alcohol) anotherBev;
		if(this.getBevName().equals(other.getBevName()) && this.getType().equals(other.getType()) && this.getSize().equals(other.getSize()) 
				&& Boolean.compare(this.isWeekend, other.isWeekend)==0 && this.getBasePrice()==other.getBasePrice())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isWeekend()
	{
		if(isWeekend)
		{
			return true;
		}
		else 
			return false;
	}
	
	@Override
	public double calcPrice()
	{
		double price = super.getBasePrice();
		if(super.getSize() == Size.MEDIUM)
		{
			price += super.getSizePrice();
		}
		else if (super.getSize() == Size.LARGE)
		{
			price += 2*super.getSizePrice();
		}
		
		if(isWeekend)
		{
			price += weekendCost;
		}
		return price;
	}
	
	public boolean getWeekend()
	{
		return isWeekend;
	}
	public double getWeekendCost()
	{
		return weekendCost;
	}
	
	public void setWeekend(boolean Weekend)
	{
		this.isWeekend = Weekend;
	}
}
