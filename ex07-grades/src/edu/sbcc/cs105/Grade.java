/**
 * CS 105 Theory & Practice I
 * CRN: 62498
 * Assignment: Grade
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */
package edu.sbcc.cs105;

import java.util.Scanner;

public class Grade {
    public static float computeGradePoint(String letterGrade) {
        // Put code to compute grade points from letter grade.
    String computeGradePoint = "";
    switch(letterGrade) {
    
    }
    return;
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in); //scanning the input
		System.out.print("Enter the letter grade: "); // asking the user for the integer
		String i = in.next();
		System.out.print(computeGradePoint(i));
    }

}