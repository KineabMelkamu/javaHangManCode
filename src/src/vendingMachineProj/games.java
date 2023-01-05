package src.vendingMachineProj;
import java.util.Random;
import java.util.Scanner;

public class games {
	private Random rand = new Random();
	private String games;
	private double price;
	private String [] defaultList = {"Metal Gear Solid 2: Sons of Liberty", "Ape Escape!", "Jet Set Radio", "Ridge Racer Type 4", 
			"Serial Experiments Lain", "Kingdom Hearts", "450 Robux", 
			"Bloodbourne", "Ultra Doom", "Cruelty Squad", 
			"Worms Armageddon", "Demon Souls", "Legends of Zelda: Links Awakining", "Fallout: A Post Nuclear Role Playing Game", "Persona 3", "Metal Gear Solid V", "Super Mario Sunshine",
			"Luigis Mansion", "Neon White", "SoulCaliber 2", "Rythem Heaven", "Sekrio: Shadows Die Twice", "WarioWare", "Silent Hill 2", "Dishonored", "Danganronpa", "Stardew Vally", 
			"Skyrim: The ElderScrolls V", "Oblivion", "Morrowind", "Yakuza 0","Day of Defeat", "left 4 dead 2", "StarWars: The Old Republic", "Tekken 7", "Metal Gear Solid 3", "Dead Rising", "Risk of Rain 2","The Binding of Isaac", "Risk of Rain", "SuperMonkey Ball", "Fate: Stay Night", "Monkey"};
	
	public games() {
		this.games = defaultList[rand.nextInt(defaultList.length)];
		this.price = ((rand.nextInt(16)+5)/10.0);
	}

	public String getGames() {
		return games;
	}

	public void setGames(String games) {
		this.games = games;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
