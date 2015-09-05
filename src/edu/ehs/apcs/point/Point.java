package edu.ehs.apcs.point;

/**
 * @author German Rivera
 * @date 8/21/2015
 * @hour 3rd
 * This is point class in which two variables 
 * price and quantity are placed in a graph 
 * to make a point. Both have different value
 * price double  and quantity int.
 */
public class Point 
{
	//x coordinate
	private int quantity;
	
	//y coordinate
	private double price;
	
	/**
	 * Instantiates Point object
	 * @param quantity
	 * @param price
	 */
	public Point(int quantity, double price)
	{
		super();                  // calls the Object class constructor
		this.quantity = quantity;
		this.price = price;
	}
	
	/**
	 * @return the quantity integer
	 */
	public int getQuantity() 
	{
		return quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * the equal method checks the points if they are equal
	 * if other points are equal then its true 
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (quantity != other.quantity) {
			return false;
		}
		return true;
	}

	/**
	 * Writes coordinate pair as a string. (#,#)
	 */
	@Override
	public String toString() {
		return "(" + this.quantity + ", " + this.price + ")";
	}
	
}
