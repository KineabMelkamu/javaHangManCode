/**Kineab Melkamu
 * Oct 20, 2022
 *Description:
 *
 *
 *
 *
 */
package src.newTing;
import java.util.Scanner;


public class library {
	//The library class will function as a database for all of our books\
	//only initialize static varibles and objects outside fo teh tcalss
	
	private static int count = 0;
	
	private book[] library; 
	
	public library() {
		library = new book[1]; //a default library contains 1 book
		
		library[0] = new book(); //remember library[index[ refers to an object of type book
		
		//each time we add a book  to the library we want to increment our count variable
}
	
	//this library contains an administrator defined number of books
	
	public library(int num) {
		library = new book[num];  //it is not necessary for a constructor parameter to be tied to a class variable
		count++;
	}
	
	//We need a method to retrieve a book from the library
	//Methods can return objects (just like they return ints, doubles, Strings, booleans, etc......)
	
	public book getBook(int index) {
		return library[index];
	}
	
	//This method will print the info for every book in our database
	//It will stop at the static variable count
	
	public String toString() {
		String summary = "";
		
		for (int i = 0; i < count; i++) {
			summary += library[i];
		}
		return summary;
	}
	
	//create a method that adds a book to the library
	public void addBook() {
		Scanner scnr = new Scanner(System.in);
		
		String name = scnr.nextLine();
		String title = scnr.nextLine();
		
			
		//add the book at the current value of count
		library[count] = new book(name, title);
	}

}
