/**Kineab Melkamu
 * Sep 22, 2022
 *Description:
 *
 *
 *
 *
 */
package src.introLesson;
import java.util.Scanner;

/**
 * @author studentgvsc
 *
 */

public class FormatExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "hello";
		int testVal = 80;
		
		
		//%#d is going to format an integer to take up # number of spaces if the number has fewer
		//than # digits
		
		//%-#s will left format a string to take up # spaces INCLUDING the characters of the string
		System.out.printf("%-30s Q%4d", test, testVal);
		

	}

}
