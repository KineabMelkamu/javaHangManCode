/**Kineab Melkamu
 * Dec 7, 2022
 *Description:
 *
 *
 *
 *
 */
package src.johnLennon;
import java.util.Scanner;

/**
 * @author studentgvsc
 *
 */

public class Product {
	private int price;
	   private String name;

	   public void setPriceAndName(int productPrice, String productName) {
	      price = productPrice;
	      name = productName;
	   }

	   public int getPrice() {
	      return price;
	   }

	   public String getName() {
	      return name;
	   }

}
