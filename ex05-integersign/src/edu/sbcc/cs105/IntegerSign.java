/**
 * CS 105 Theory & Practice I
 * CRN: 62498
 * Assignment: IntegerSign
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class IntegerSign {

    public static String determineSign(int integer) {
        // Put code here to determine sign of value and return string representation
    	String determineSign = ""; //assigning determineSign as a string
    	if (integer < 0) { // if the integer is less than zero, then the output is negative.
    		determineSign = ("negative");
    	}
    	if (integer > 0) { // if the integer is greater than zero, then the output is positive.
    		determineSign = ("positive");
    	}
    	if (integer == 0) { // if the integer is equal to zero, then it is zero
    		determineSign = ("zero");
    	}
    	return determineSign; // return the representation to the function
    }
    
    public static void main(String[] args) {
        // Put code here to get input from user, then call determineSign
    	Scanner in = new Scanner(System.in); //scanning the input
		System.out.print("Enter the integer: "); // asking the user for the integer
		int integer = in.nextInt();
		System.out.println(determineSign(integer)); //printing out the integer into the determine string
    }

}
