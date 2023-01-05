package src.monkey;
import java.util.Scanner;

public class KILLJOHNLENNON {
    public static int [] getPower(int userInputOne, int userPowerTwo) {
        int[] powerArray = new int[userPowerTwo];
        
        for (int i = 0; i < powerArray.length; i++) {
            powerArray[i] = (int) Math.pow(userInputOne, i);
        }
        return powerArray;
    }
    
    public static void printCock(int[] megGriffin) {
        System.out.print("[ ");
        for (int i = 0; i < megGriffin.length;++i) {
            System.out.print(megGriffin[i]+ " ");            
        }
        System.out.print("]");        
    }
    public static void main(String[] args) {
          Scanner scnr = new Scanner(System.in);
          int numElements;
          int someBase;
          
          numElements = scnr.nextInt();
          someBase = scnr.nextInt();
          
          //DO NOT CHANGE THE BELOW METHOD CALL
          printCock(getPower(numElements, someBase));
       }
}