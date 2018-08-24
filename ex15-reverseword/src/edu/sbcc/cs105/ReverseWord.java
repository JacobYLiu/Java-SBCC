/**
 * CS 105 Theory & Practice I
 * CRN: 62498
 * Assignment: ReverseWord
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */
package edu.sbcc.cs105;


public class ReverseWord {


	public static String reverseWord(String input1) {
		String fina1 = ""; // initializes the empty for entering the string input.
		for(int i = input1.length() - 1; i >= 0; i--) {
			fina1 += input1.charAt(i);
			
		}
		return fina1; 
	}
}
