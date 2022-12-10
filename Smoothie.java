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
public class Smoothie extends Beverage {

	private int numOfFruits;
	private boolean addProtein;
	private final double fruitCost = 0.5;
	private final double proteinCost = 1.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	@Override
	public String toString()
	{
		String message = getBevName() + ", " + getSize() + " " + numOfFruits + " Fruits";
		
		if(addProtein)
		{
			message += " Protein poweder";
		}
		
		message += ", $" + calcPrice();
		return message;
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		Smoothie other = (Smoothie) anotherBev;
		if(this.getBevName().equals(other.getBevName()) && this.getType().equals(other.getType()) && this.getSize().equals(other.getSize()) 
				&& this.numOfFruits == other.getNumOfFruits() && Boolean.compare(this.getAddProtein(), other.getAddProtein())==0 && this.getBasePrice()==other.getBasePrice())
		{
			return true;
		}
		else {
			return false;
		}
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
		
		price += numOfFruits * fruitCost;
		if(addProtein)
		{
			price += proteinCost;
		}
		return price;
	}
	
	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	public boolean getAddProtein()
	{
		return addProtein;
	}
	public double getProteinCost()
	{
		return proteinCost;
	}
	public double getFruitCost()
	{
		return fruitCost;
	}
	
	public void setNumOfFruits(int numOfFruits)
	{
		this.numOfFruits = numOfFruits;
	}
	public void setProteinPowder(boolean addProtein)
	{
		this.addProtein = addProtein;
	}
		
}
