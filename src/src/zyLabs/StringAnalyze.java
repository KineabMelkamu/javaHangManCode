/*Kineab Melkantnhewmumulet1
 * 10/11/2022
 * 
 * Description:
 * Different test of string analysis.
 */



package src.zyLabs;


public class StringAnalyze {
	//States the common letters  between 2 strings
	public static String commonLetters(String param1, String param2) {
		String chewingGum = "";
		param1 = param1.toLowerCase();
		param2 = param2.toLowerCase();
		
		for (int i = 0; i <= param1.length() - 1; ++i) {
			for (int j = 0; j <= param2.length()-1; ++j) {
				if (param1.charAt(i) == param2.charAt(j)) {
					chewingGum = chewingGum + param1.charAt(i);
				}
			}
		}
		for (int k = 0; k < chewingGum.length()-1; ++k) {
			if (chewingGum.charAt(k) == chewingGum.charAt(k+1)) {
				chewingGum = chewingGum.substring((chewingGum.length()-1)-k);
			}
			}

		if (chewingGum == "") {
			chewingGum = "<none>";
		}
		return chewingGum;
	}
	
	//Swaps the placement between 2 strings
	public static String swapHere(String param2, int param1) {
		String cactusJack = "";
		
		if (param1 > param2.length() || param1 <= 0) {
			cactusJack = param2;
		}
		else {
			cactusJack = param2.substring(param1-1) + param2.substring(0, param1-1);
		}
		return cactusJack;
	}
	
	//adds the letter placement between 2 sums
	public static int letterSum(String param1) {
		int lemonade = 0;
		
		param1 = param1.toLowerCase();
		for (int i = 0; i <= param1.length()-1; ++i) {
			if (Character.isLetter(param1.charAt(i))) {
				lemonade += param1.charAt(i) - 96;
			}
			}
		return lemonade;
		}
	
	public static Boolean isValidPassword(String param1) {
		int numCorrect = 0;
		int capitalLetterCorrect = 0;
		int lowerLetterCorrect = 0;
		boolean isGood = true;
		
		if (param1.length() - 1 >= 8) {
			for (int i = 0; i <= param1.length() - 1; ++i) {
				if (param1.charAt(i) >= 48 && param1.charAt(i) <= 57) {
					numCorrect += 1;
				}
				else if (param1.charAt(i) >= 65 && param1.charAt(i) <=90) {
					capitalLetterCorrect += 1;
				}
				else if (param1.charAt(i) >= 97 && param1.charAt(i) <= 122) {
					lowerLetterCorrect += 1;
				}
				else {
					isGood = false;
				}
			}
			if (numCorrect < 2 || capitalLetterCorrect < 2 || lowerLetterCorrect < 2) {
				isGood = false;
			}
		}
		else {
			isGood = false;
		}
		return isGood;
	}
	

	public static void main(String[] args) {		
		System.out.println(swapHere("123456789", 9));

	}

}



