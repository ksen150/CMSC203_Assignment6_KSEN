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
import java.util.ArrayList;

public class BevShop implements BevShopInterface{

	 int numOfAlcoholOrder;
	 int currentOrder;
	 ArrayList<Order>orders;
	
	public BevShop()
	{
		orders = new ArrayList<Order>();
	}
	@Override
	public String toString()
	{
		String message = "Monthly Orders\n";
		for(Order o: orders)
		{
			message += "Total Sale: " + totalMonthlySale();
		}
		return message;
	}
	public boolean isValidTime(int time)
	{
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			return true;
		}
		return false;
	}
	public boolean isValidAge(int age)
	{
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}
	public boolean isEligibleForMore()
	{
		if(numOfAlcoholOrder<3)
		{
			return true;
		}
		return false;
	}
	public boolean isMaxFruit(int numOfFruits)
	{
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		return false;
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrder = orders.indexOf(order);
		numOfAlcoholOrder = 0;
	}
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		orders.get(currentOrder).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		orders.get(currentOrder).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	public void processAlcoholOrder(String bevName, Size size)
	{
		orders.get(currentOrder).addNewBeverage(bevName, size);
		numOfAlcoholOrder++;
	}
	public int findOrder(int orderNo)
	{
		for(int i=0; i<orders.size(); i++)
		{
			if(orders.get(i).getOrderNumber() == orderNo)
			{
				return i;
			}
		}
		return -1;
	}
	public double totalOrderPrice(int orderNo)
	{
		double sale = 0;
		for(Order o: orders)
		{
			if(o.getOrderNumber()==orderNo)
			{
				for(Beverage b: o.getBeverages())
				{
					sale += b.calcPrice();
				}
			}
		}
		return sale;
	}
	public double totalMonthlySale()
	{
		double sale = 0;
		for(Order o: orders)
		{
			for(Beverage b: o.getBeverages())
			{
				sale += b.calcPrice();
			}
		}
		return sale;
	}
	public int totalNumOfMonthlyOrders()
	{
		return orders.size();
	}
	
	public void sortOrders()
	{
		for(int i=0; i<orders.size()-1; i++)
		{
			int minOrderNum = i;
			for(int j=i+1; j<orders.size(); j++)
			{
				if(orders.get(j).getOrderNumber() < orders.get(minOrderNum).getOrderNumber())
				{
					minOrderNum = j;
				}
			}
			Order temp = orders.get(minOrderNum);
			orders.set(minOrderNum, orders.get(i));
			orders.set(i, temp);
		}
	}
	public Order getOrderAtIndex(int index)
	{
		return orders.get(index);
	}
	public Order getCurrentOrder()
	{
		return orders.get(currentOrder);
	}
	public int getNumOfAlcoholDrink()
	{
		return numOfAlcoholOrder;
	}
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
}
