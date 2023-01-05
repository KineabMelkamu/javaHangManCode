/**Kineab Melkamu
 * Oct 13, 2022
 *Description:
 *
 *
 *
 *
 */
package src.numericalStaticMethods;
import java.util.Scanner;


public class funTest {
	
	public static void showDivisors(int param1) {
		String divisors = "";
		divisors = "1";
		if (param1 >  0) {
			for (int i=2; i<param1; ++i) {
				if (param1%i == 0) {
					divisors +=  ", "+ i ;	
					System.out.println(divisors);
				}
			}
	}
		else {
			for (int  j=-2; j>param1; ++j) {
				if (param1%j == 0) {
					j = -j;
					divisors +=  ", "+ j ;	
					System.out.println(divisors);
				}
			}
		}
}
 

	public static void main(String[] args) {
		showDivisors(-6);

	}

}
