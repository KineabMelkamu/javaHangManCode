/**Kineab Melkamu
 * Sep 22, 2022
 *Description:
 *
 *
 *
 *
 */
package src.reportCard;
import java.util.Scanner;

public class reportCardACTUAL {
	Scanner scnr = new Scanner(System.in);
	static int gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven;
	static String name, schoolName, classOne, classTwo, classThree, classFour, classFive, classSix, classSeven;
	public static void GetUserInfo() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is your name?: ");
		name = scnr.nextLine();
		System.out.println("What school are you going to currently?: ");
		schoolName = scnr.nextLine();
		System.out.println("State the 7 classes you are currently taking, press enter after each time.");
		classOne = scnr.nextLine();
		classTwo = scnr.nextLine();
		classThree = scnr.nextLine();
		classFour = scnr.nextLine();
		classFive = scnr.nextLine();
		classSix = scnr.nextLine();
		classSeven = scnr.nextLine();
		System.out.println("What are the current grades for your classes? Put in order of previous inputed classes");
		gradeOne = scnr.nextInt();
		gradeTwo = scnr.nextInt();
		gradeThree = scnr.nextInt();
		gradeFour = scnr.nextInt();
		gradeFive = scnr.nextInt();
		gradeSix = scnr.nextInt();
		gradeSeven = scnr.nextInt();
		
	}
	public static String userInputAnalysis(int grade) {
		String letterGrade = "";
		if (grade >= 90) {
			letterGrade = "A";			
		}
		else if ((grade < 90) && (grade >= 80)) {
			letterGrade = "B";			
		}
		else if ((grade < 80) && (grade >= 70)) {
			letterGrade = "C";
		}
		else if ((grade < 70) && (grade >= 60)) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	public static void run() {
		GetUserInfo();
		userInputAnalysis(gradeOne);
		System.out.println(schoolName);
		System.out.println(name);
		System.out.println("");
		System.out.printf("%-30s %3d %s\n", classOne, gradeOne, userInputAnalysis(gradeOne));
        System.out.printf("%-30s %3d %s\n", classTwo, gradeTwo, userInputAnalysis(gradeTwo));
        System.out.printf("%-30s %3d %s\n", classThree, gradeThree, userInputAnalysis(gradeThree));
        System.out.printf("%-30s %3d %s\n", classFour, gradeFour, userInputAnalysis(gradeFour));
        System.out.printf("%-30s %3d %s\n", classFive, gradeFive, userInputAnalysis(gradeFive));
        System.out.printf("%-30s %3d %s\n", classSix, gradeSix, userInputAnalysis(gradeSix));
        System.out.printf("%-30s %3d %s\n", classSeven, gradeSeven, userInputAnalysis(gradeSeven));
	}
	public static void main(String[] args) {
		run();
	}
	}


