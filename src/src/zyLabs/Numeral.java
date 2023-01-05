/**Kineab Melkamu
 * Oct 11, 2022
 *Description:
 *
 *
 *
 *
 */
package src.zyLabs;

//divisors test
public class Numeral {
	public static void showDivisors(int param1) {
		param1 = Math.abs(param1);
		String divisors = "";
		divisors = "1";
		for (int i=2; i<param1; ++i) {
			if (param1%i == 0) {
				divisors +=  ", "+ i ;	
			}
		}
		System.out.println(divisors);
	}
	
//prime number test
	public static void isPrime(int param1) {
		int posparam1 = Math.abs(param1);
		String isPrime = "";
		if (posparam1 == 0 || posparam1 == 1) {
			System.out.println(param1 + " is not a prime number");
		}
		else  if (param1 == 2) {
			System.out.println(param1 + " is a prime number");
			
		}
		for (int i = 2; i<posparam1; ++i) {
			if ((posparam1%i == 0) && (posparam1 != i)) {
				isPrime = param1 + " is not a prime number";
				
				break;
			}
			else {
				isPrime = param1 + " is a prime number";
			}
		}
		System.out.println(isPrime);
	}
	
//factorial test
	public static void factorial(int param1) {
		int gloopcast = 1;
		String freddieGibbsClears = param1 + "! = " + param1; 
		if (param1 < 0) {
			gloopcast = -1;
		}
		else if (param1 == 0) {
			gloopcast = 1;
		}
		else if (param1 > 0) {
			for (int i = 1; i<=param1; ++i) {
				gloopcast *= i;
			}			
		}
		for (int j = param1 - 1; j > 0; --j) {
			freddieGibbsClears += " x " + j;
		}
		freddieGibbsClears += " = " + gloopcast;
		System.out.println(freddieGibbsClears);
	}
	
//KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL KILL 	
	public static void contains(int param1, int param2) {
        String strIntSearch = "" + param1;
        char charInt = ("" + param2).charAt(0);
        boolean found = false;
        for (int i = strIntSearch.length() - 1; i > -1; --i) {
            if (strIntSearch.charAt(i) == charInt) {
                System.out.println((int)Math.pow(10, (strIntSearch.length() - 1) - i));
                found = true;
            }
        }
        if (!found) {
            System.out.println(param1 + " does not contain " + param2);
        }
    }
	
	
	public static void main(String[] args) {
		contains (44444444, 4);
	}

}


