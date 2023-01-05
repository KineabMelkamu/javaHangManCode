/**Kineab Melkamu
 * Sep 15, 2022
 *Description:
 *Learn to write static methods for a rectangle
 *We will calculate the area, perimiter, length of diagonal
 *We will write a single method that summarizes that info
 *
 */
package src.RectangleCalculator;
import java.util.Scanner;

/**
 * @author studentgvsc
 *
 */
public class rectCalc {
	
/*
 * When writing a method, the method must have:
 * 
 * 1) scope level(generally public)
 * 2) static if class is calling the method
 * 3) return type (int, double, Strings, boolean) and void (returns nothing)
 * 4) method must have a name (must be descriptive) if the method returns a value, it should start with "get"
 * 5) if the method contains parameters, call s to the method must use the same types of parameters in the same order
 * 			methodName(int len, double wid, String str)
 * 			
 *			The type of the parameter must be declared in the method header's parameter list 
 * 
 * 			!in the main method
 * 			
 * 			methodName(2.7, 1, gabe) <-------- does NOT work b/c in wrong order
 */
	//This method returns the are of a rectangle with integers sides(implies are is also an int)
	public static int getArea(int length, int width) {//this is a method header
		return length * width; //all methods with return types must have a return statment 


	}
	
	public static int getPerimeter(int length, int width) {
		return (2*length) + (2*width);
	}
	
	public static double getDiagonalLength(int length, int width) {
		return Math.sqrt(length *length + width * width);
	}
	
	//this method allows access to the other RectCalc methods
	//and prints a nice summary of a rectangle
	
	//void methods are "do this" methods 
	//void methods cannot be stored in variables or used in print methods
	
	public static void getSummary(int length, int width) {
		System.out.printf("The dimensions of the recangle are %d x %d.\n", length, width);
		System.out.printf("The perameter of the rectangle is %d.\n", getPerimeter(length, width));
		System.out.printf("The area of the rectangle is %d.\n", getArea(length, width));
		System.out.printf("The length of the diagonal is %.1f.\n", getDiagonalLength(length, width));
	}
	
	public static void main(String[] args) {
		//In the class of the static method, you can just call the method name
		
		rectCalc.getSummary(4,5);
		System.out.println("KILL yourself");
		;
	}

}

