
package src.vendingMachineProj;
import java.util.Scanner;

public class gameStopVendingMachine {
	Scanner scnr = new Scanner(System.in);
	
	private games[][] inventory = new games[5][3];
	private double totalMoney, userMoney = 0;
	boolean paid = false;
	
	public gameStopVendingMachine(){
		for(int i = 0; i<5; ++i) {
			for (int j = 0; j<3; ++j) {
				inventory[i][j] = new games();
			}
		}
	}
	
	public void displayItem() {
		for (int i = 0; i<5;++i) {
			for(int j = 0; j<3; ++j) {
				System.out.printf("%-50s %.2f\t[%d][%d]   ", inventory[i][j].getGames(), inventory[i][j].getPrice(), i, j);
			}
			System.out.println();
		}
	}
	
	public void custodian() {
		System.out.println("Select the row and column you want to change, for example \"3\", \"2\"");
		int userInputRow = scnr.nextInt();
		int userInputColumn = scnr.nextInt();
		String userNameChoice;
		double userPrice;
		
		if((userInputRow <= 5) && (userInputColumn <=3)) {
			System.out.println("what do you want the new name to be?");
			String funky = scnr.nextLine();
			userNameChoice = scnr.nextLine();
			System.out.println("what do you want the new price to be for this product?");
			userPrice = scnr.nextDouble();
			inventory[userInputRow][userInputColumn].setGames(userNameChoice); 
			inventory[userInputRow][userInputColumn].setPrice(userPrice);
			run();
		}
		else {
			System.out.println("input a valid character");
		}
		
		
	}
	
	public void weedDispenser() {
		System.out.println("please input in the row and column you want to buy, then state how much money you have. For example, \"3 2 6\" (note that you cannot put in less than .25 or more than $2.00)");
		int userInputRow= scnr.nextInt();
		int userInputColumn = scnr.nextInt();
		userMoney = scnr.nextDouble();
		
		while(totalMoney < inventory[userInputRow][userInputColumn].getPrice()) {
			if (userMoney < .25) {
				System.out.println("You dont have enough money. Please input more money.");
				userMoney = scnr.nextDouble();
			}
			if (userMoney > 2) {
				System.out.println("You put in to much money. Please input less money.");
				userMoney = scnr.nextDouble();
			}
			else {
				totalMoney += userMoney;
				if (totalMoney < inventory[userInputRow][userInputColumn].getPrice()) {
					System.out.println("enter more money.");
					userMoney = scnr.nextDouble();
				}
				else {
					System.out.printf("enjoy your new game %s! ", inventory[userInputRow][userInputColumn].getGames());
					System.out.printf("Your change was: $%.2f", (totalMoney-inventory[userInputRow][userInputColumn].getPrice()));
					break;
				}
			}
		}
		
	
	}
	
	public void run() {
		String userInput;
		System.out.println("Hello. Choose an option for this Game Stop Vending Machine. If you want to change the items in this Vending Machine please type \"admin\". If you want to buy a product, please type in \"Buy\"");
		System.out.println();
		System.out.println();
		
		displayItem();
		userInput = scnr.next();
		userInput.equalsIgnoreCase(userInput);
		if (userInput.equalsIgnoreCase("admin")){
			custodian();
		}
		else if (userInput.equalsIgnoreCase("buy")) {
			weedDispenser();
		}
		else {
			System.out.println("input a valid option");
			run();
		}
	
	}
	
	

}
