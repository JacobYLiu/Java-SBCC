/**
 * CS 105 Theory & Practice I
 * CRN: 62498
 * Assignment: DocStats
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */
package edu.sbcc.cs105;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DocStats {
	
	public static String readFile(String fileName) throws FileNotFoundException {
		//
		// Scanner in = new Scanner(System.in);
		//
		// System.out.println("File to be read: ");
		//
		// fileName = in.next();

		File file = new File(fileName); // making a new file called fileName
		Scanner fileScanner = new Scanner(file); // new Scanner 
		fileScanner.useDelimiter("\\A");
		String contents = fileScanner.next();
		fileScanner.close();
		return contents;
	}

	public static int getNumberCharacters(String fileName) throws FileNotFoundException {
	
		return fileName.length();
	}

	public static int getNumberLines(String fileName) throws FileNotFoundException {
		Scanner in = new Scanner(fileName);
		int lines = 0;
		while (in.hasNext()) {
			in.nextLine();
			lines++;
		}
		in.close();
		return lines;

	}

	public static int getNumberWords(String fileName) throws FileNotFoundException {
		Scanner in = new Scanner(fileName);
		int words = 0;
		while (in.hasNext()) {
			in.next();
			words++;
		}
		in.close();e
		return words;
	}

	public static void main(String[] args) {

	}

	// EX15 - just do return new StringBuilder(hi).reverse().toString();

	// EX16 - if number /2 ==0 then it is even if not then it is odd.

}