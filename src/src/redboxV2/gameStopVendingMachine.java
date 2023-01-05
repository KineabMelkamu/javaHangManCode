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



public class gameStopVendingMachine {
	Scanner scnr = new Scanner(System.in);
	private Items[][] Inventory = new Items[5][3];
	private double totalMoney, userMoney = 0;
	boolean paid = false;

	
	gameStopVendingMachine() {
		Items Item1 = new Items("Metal Gear Solid 2: Sons of Liberty", 1.00);
		Inventory[0][0] = Item1;
		
		Items Item2 = new Items("Ape Escape!", 0.70);
		Inventory[0][1] = Item1;
		
		Items Item3 = new Items("Jet Set Radio", 0.50);
		Inventory[0][2] = Item1;
		
		Items Item4 = new Items("Ridge Racer Type 4", 0.30);
		Inventory[1][0] = Item1;
		
		Items Item5 = new Items("Serial Experiments Lain", 2.30);
		Inventory[1][1] = Item1;
		
		Items Item6 = new Items("Kingdom Hearts", 2.10);
		Inventory[1][2] = Item1;
		
		Items Item7 = new Items("Doom 64", 1.90);
		Inventory[2][0] = Item1;

		Items Item8 = new Items("Cruelty Squad", 0.90);
		Inventory[2][1] = Item1;
		
		Items Item9 = new Items("Worms Armageddon", 0.80);
		Inventory[2][2] = Item1;
		
		Items Item10 = new Items("Demon Souls", 1.40);
		Inventory[3][0] = Item1;
		
		Items Item11 = new Items("Legends of Zelda: Links Awakining", 1.50);
		Inventory[3][1] = Item1;
		
		Items Item12 = new Items("Fallout: A Post Nuclear Role Playing Game", 1.00);
		Inventory[3][2] = Item1;
		
		Items Item13 = new Items("Persona 3", 0.60);
		Inventory[4][0] = Item1;
		
		Items Item14 = new Items("Metal Gear Solid V", 1.60);
		Inventory[4][1] = Item1;
		
		Items Item15 = new Items("Super Mario Sunshine", 1.20);
		Inventory[4][2] = Item1;
		
		}
	public void displayItem() {
		for (int i = 0; i<5;++i) {
			for(int j = 0; j<3; ++j) {
				System.out.printf("%-50s %.2f\t[%d][%d]   ", Inventory[i][j].getName(), Inventory[i][j].getPrice(), i, j);
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
			Inventory[userInputRow][userInputColumn].setName(userNameChoice); 
			Inventory[userInputRow][userInputColumn].setPrice(userPrice);
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
		
		while(totalMoney < Inventory[userInputRow][userInputColumn].getPrice()) {
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
				if (totalMoney < Inventory[userInputRow][userInputColumn].getPrice()) {
					System.out.println("enter more money.");
					userMoney = scnr.nextDouble();
				}
				else {
					System.out.printf("enjoy your new game %s! ", Inventory[userInputRow][userInputColumn].getName());
					System.out.printf("Your change was: $%.2f", (totalMoney-Inventory[userInputRow][userInputColumn].getPrice()));
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

	


