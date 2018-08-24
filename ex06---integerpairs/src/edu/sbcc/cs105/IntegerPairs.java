/**
 * CS 105 Theory & Practice I
 * CRN: 62498
 * Assignment: IntegerPairs
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */
package edu.sbcc.cs105;

import java.util.Scanner;

public class IntegerPairs {
    public static String countPairs(int i1, int i2, int i3, int i4) {
        // Put code here to count the pairs
    	String str = "";
    	if (i1 == i2 && i3 == i4 || i1 == i3 && i2 == i4 || i1 == i4 && i2 == i3) { // if the memory location values are equal to each other then it is two pairs.
    		str = "two pairs";
    	} else {
    			str =  "not two pairs"; 
    }
    	return str;
   }
    public static void main(String[] args) {
        // Put code here to read integers from user
		System.out.print("Enter the four positive integers: "); // asking the user for the integer
		Scanner in = new Scanner(System.in); //scanning the input
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.print(countPairs(a,b,c,d));
		in.close();
    }

}