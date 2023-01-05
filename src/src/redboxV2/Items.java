/**Kineab Melkamu
 * Dec 8, 2022
 *Description:
 *
 *
 *
 *
 */
package src.redboxV2;
import java.util.Scanner;


public class Items {
	private double price;
	private String name;
	
	Items(String name, double price){
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
