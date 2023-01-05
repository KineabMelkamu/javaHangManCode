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

public class book {
	///A book consists of an author and a title
	String author, title;
	
	//We will create a no-parameter constructor an unknown author and an untitled book
	public book() {
		this.author = "Unknown";
		this.title = "Untitles";
	}
	
	public book(String aut, String title) {
		this.author = aut;
		this .title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "book [author=" + author + ", title=" + title + "]\n";
	}
	
	
	

}
