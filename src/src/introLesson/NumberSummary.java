package src.introLesson;
import java.util.Scanner;
import java.util.Random;

public class NumberSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. Input phase
		
		int number1, number2, number3, sum, median, maxValue, minValue;
		double mean;
		
		//To create a random number generator we need a Random object
		
		Random random = new Random(); //This creates a random object named "random"
		
		//Genearate three random intergers between 0 and 50;
		
		number1 = random.nextInt(51);
		number2 = random.nextInt(51);
		number3 = random.nextInt(51);
		
		//use print statment to freq check code to see if code is preforming as EXPECTED;
		
		//2. process Phase
		//process numbers to get mean, median, max value, and min value
		sum = number1 + number2 + number3;
		mean = sum / 3.0; //to get a true dfecimal one part of the opperation must be an actual double.
//		System.out.println(number1 + "-" + number2 + "-" + number3 + "-" + mean );
		
		maxValue = Math.max(Math.max(number1,  number2),number3);
		minValue = Math.min(Math.min(number1,  number2),number3);
		
		median = sum - maxValue - minValue;
		
		System.out.println("Number Summary");
		System.out.println("--------------");
		System.out.println("Mean:     " + mean);
		System.out.println("Median:   " + median);
		System.out.println("Maximum:  " + maxValue);
		System.out.println("Minimum:  " + minValue);
		System.out.println("The numbers in order are " + minValue + ", " + median + ", " + maxValue +".");
		
	
		

	}

}
