/**Kineab Melkamu
 * Oct 18, 2022
 *Description:
 *
 *
 *This class covers how to write and traverse arrays using for- loops and enhanced for- loops
 *We will aslo make arrays of objects
 */
package src.arrays;
import java.util.Scanner;

public class ArrayLesson {
	

	public static void main(String[] args) {
		/* 
		 * An array is a data structure that builds "values' of the same data type
		 * 
		 * An array is fixed in size when  it is declared and/or initialized
		 * 
		 * Elements of an array are accessed by using arrayName[index] -----> index is from 0 to length - 1
		 * arrayName.length is the number of elements contained in an array
		 * 
		 * If not inititialized all primitive types will default to "0"
		 * 
		 * For arrays of objects the default value is "null"
		 * 
		 * For non-string objects attempt to use methods on null objects will give a NullPointerException
		 */
		
		//dataType[] arrayName = new dataType[arraySize]
		//dataType[] arrayname = { elements that match dataType, separated by commas} ---------> for a small number of elements
		
		int[] numbers = new int[50]; //creates an array of 50 integers, currently each element is 0.
		
//		numbers[0] = 7; //changes the friwst element to 7;
//		
//		numbers[49] = 25; //changes the last element to 25
		
		System.out.println(numbers[49] / numbers[0]);
		
		/*
		 * There are two ways to iterate over an array
		 * 
		 * 1. Traditional for-loop ------> can access and changes the values in the array
		 * 2. Enhanced for-loop -------> can only access (read-only) the vaules of the array; CANNOT change the values of hte array
		 */
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] =( i +1);
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//for{dataType single : collection} ----> loop body
		for (int number : numbers) {
			number = number* number + number;
			System.out.println(number);
		}
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		/*
		 * Parallel arrays keep track of data that has at least two charachteristics
		 */
		
		String[] letters = new String [26];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		//this array kees tracl of the letter values of the alphabet
		int[] letterValues = new int[26];
		
		for(int i = 0; i < letters.length; i++) {
			
		}
				
		for (int i = 0; i < letters.length; i++) {
			letters[i] = alphabet.substring(i, i+1);
		}
	}

}
