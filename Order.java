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
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {

		  int orderNumber;
		  int orderTime;
		  Day orderDay;
		  Customer customer;
		 ArrayList<Beverage> beverages;
		
		public Order(int orderTime, Day orderDay, Customer cust)
		{
			orderNumber = generateOrder();
			this.orderTime = orderTime;
			this.orderDay = orderDay;
			this.customer = cust;
			beverages = new ArrayList<Beverage>();
		}
		
		public int generateOrder()
		{
			Random rand = new Random();
			int randInt = rand.nextInt(90_000-10_000) + 10_000;
			return randInt;
		}
		
		@Override
		public String toString()
		{
			String message = orderDay.toString() + ", " + orderTime + "\n" + customer.toString() + " Order Number: " + orderNumber;
			
			for(Beverage b: beverages)
			{
				message += "\n" + b.toString();
			}
			
			message += "\n Order Total:" + calcOrderTotal();
			
			return message;
		}
		
		public boolean isWeekend()
		{
			if(orderDay==Day.SATURDAY || orderDay==Day.SUNDAY) 
			{
				return true;
			}
			else {
				return false;
			}
		}
		
		public Beverage getBeverage(int itemNo)
		{
			Beverage bev;
			bev = this.beverages.get(itemNo);
			return bev;
		}
		

		@Override
		public int compareTo(Order anotherOrder)
		{
			if(orderNumber == anotherOrder.getOrderNumber())
			{
				return 0;
			}
			else if(orderNumber>anotherOrder.getOrderNumber())
			{
				return 1;
			}
			else {
				return -1;
			}
		}
		
		public double calcOrderTotal()
		{
			double orderTotal = 0;
			
			for(Beverage b: beverages)
			{
				orderTotal += b.calcPrice();
			}
			return orderTotal;
		}

		public int findNumOfBeveType(Type type)
		{
			int count = 0;
			
			for(Beverage b: beverages)
			{
				if(b.getType() == type)
				{
					count++;
				}
			}
			return count;
		}
		
		public int getTotalItems()
		{
			return beverages.size();
		}
		
		public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
		{
			Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
			beverages.add(c);
		}
		public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean proteinPowder)
		{
			Smoothie s = new Smoothie(bevName, size, numOfFruits, proteinPowder);
			beverages.add(s);
		}
		public void addNewBeverage(String bevName, Size size)
		{
			boolean isWeekend = false;
			if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
			{
				isWeekend = true;
			}
			Alcohol a = new Alcohol(bevName, size, isWeekend);
			beverages.add(a);
		}
		
		public int getOrderNumber() {
			return orderNumber;
		}
		public int getOrderTime()
		{
			return orderTime;
		}
		public Day getOrderDay()
		{
			return orderDay;
		}
		public Customer getCustomer()
		{
			return new Customer(customer);
		}
		public ArrayList<Beverage>getBeverages()
		{
			return beverages;
		}
		public void setOrderNum(int orderNum)
		{
			orderNumber = orderNum;
		}
		public void setOrderDay(Day orderDay)
		{
			this.orderDay = orderDay;
		}
		public void setOrderTime(int orderTime)
		{
			this.orderTime = orderTime;
		}
		public void setCustomer(Customer customer)
		{
			this.customer = customer;
		}	
}
