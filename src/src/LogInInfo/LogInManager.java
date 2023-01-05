/**Kineab Melkamu
 * Sep 15, 2022
 *Description:
 *
 *Take a user's first, middle, and last name and create a gov school email address
 *that end in @GSIP.edu and gives a random 9 char password
 *and sends a confimation code to the email adress
 *If the user's last name is more than 7 charchters, only use the first six charchters
 *
 *For Christopher Lawrence Martin, the program should gen
 *martinL
 *
 */
package src.LogInInfo;
import java.util.Scanner;
import java.util.*;

/**
 * @author studentgvsc
 *
 */

public class LogInManager {
	//static ensures the varibles and objects exist for the class and not just the methods
	
	static Scanner scnr = new Scanner(System.in);
		
	//populate the user varible 
	public static void getUserInfo() {
		String first, middle, last;
		System.out.println("what is your first name? ");
		first = scnr.nextLine();
		
		System.out.println("what is your last name? ");
		last = scnr.nextLine();
		
		System.out.println("what is your middle name? ");
		middle = scnr.nextLine();
		
		System.out.println("at the end of this program, you will hae a GSIP email adress: ");		
		
	}
	
	//this method controls the enditre program
	public static void run() {
		getUserInfo();
		
	}
	
	//if the user's last name
	public static String getEmailAdress(String first, String middle, String last) {
		String email = "";
		
		
		// if the user's last name is > 6 charchters
		if(last.length() > 6) {
			email += last.substring(0,6).toLowerCase();//takes the first 6 of a last name
			email += first.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase();
			email += "@GSIP.edu";
		}
		return email;
		
	}
	public static void main(String[] args) {
			

	}

}


