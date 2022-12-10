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
public class Coffee extends Beverage {

	private boolean extraShot;
	private boolean extraSyrup;
	private final double shotCost = 0.5;
	private final double syrupCost = 0.5;
	
	public Coffee(String bevName, Size size, boolean shot, boolean syrup)
	{
		super(bevName, Type.COFFEE, size);
		extraShot = shot;
		extraSyrup = syrup;
	}
	
	public String toString()
	{
		String message = getBevName() + ", " + getSize();
		
		if(extraShot) {
			message += " Extra shot";
		}
		if(extraSyrup)
		{
			message += " Extra syrup";
		}
		
		message += ", $" + calcPrice();
		return message;
	}
	
	@Override
	public double calcPrice() 
	{
		double price = super.getBasePrice();
		
		if(super.getSize() == Size.MEDIUM)
		{
			price += super.getSizePrice();
		}
		else if(super.getSize() == Size.LARGE)
		{
			price += 2*super.getSizePrice();
		}
		
		if(extraShot)
		{
			price += shotCost;
		}
		if(extraSyrup)
		{
			price += syrupCost;
		}
		return price;
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		Coffee other = (Coffee) anotherBev;
		if(this.getBevName().equals(other.getBevName()) && this.getType().equals(other.getType()) && this.getSize().equals(other.getSize()) 
				&& Boolean.compare(this.getExtraShot(), other.getExtraShot())==0 && Boolean.compare(this.getExtraSyrup(), other.getExtraSyrup())==0 && this.getBasePrice()==other.getBasePrice())
		{
			return true;
		}
		else {
			return false;
		}
	}

	public boolean getExtraShot()
	{
		return extraShot;
	}
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	public double getShotCost()
	{
		return shotCost;
	}
	public double getSyrupCost()
	{
		return syrupCost;
	}
	
	public void setExtraShot(boolean shot)
	{
		extraShot = shot;
	}
	public void setExtraSyrup(boolean syrup)
	{
		extraSyrup = syrup;
	}	
}
