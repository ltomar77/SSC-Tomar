import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;
//Author Name: Levar Tomar
//Date: 1-27-19
//Program Name: Tomar_Spell_Check
//Purpose: Program to do spell checking

public class Spell_Check {

	private static ArrayList<String> readFile(File file) {
		ArrayList<String> textTemp = new ArrayList<>();// Temp var for Array
														// Files
		Scanner scanner = new Scanner(System.in);

		if (file.exists()) {

			try (Scanner input = new Scanner(
					file)/*
							 * Using scanner to get t1 which is = to new
							 * File(TEST_FILE)
							 */) {
				// read data from file
				while (input.hasNext()) {
					String testWord = input.nextLine();
					textTemp.add(testWord.toLowerCase());// Change of case to
															// avoid
															// capitalization!!!!!
				}
				input.close();

			} catch (Exception e) {
				System.out.println("Failed to read File" + file.getName() + ".");

			}

		} else {
			System.out.println("Test File" + file.getName() + " doesn't exist.");
		} // End of t1 If

		return textTemp;
	}

	private static void findBadWords(ArrayList<String> test, ArrayList<String> dict) {
		for (String tf : test) {
			
			if (!(dict.contains(tf))) {
				System.out.println("This word is unknown! "+tf);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Please enter the file name testStates.txt to check it for spelling errors or press enter.");
		Scanner scanner = new Scanner(System.in);

		String testfile = scanner.nextLine();
		
		System.out.println("Please enter the file name dictionary.txt Which will check your test file for spelling or press enter.");
		String dictfile = scanner.nextLine();
		
		File t1 = new File(testfile);
		File d1 = new File(dictfile);
	
		final String TEST_FILE = "testStates.txt";
		final String DICTO_FILE = "dictionary.txt";
		// Will hold the lists
		ArrayList<String> testList = new ArrayList<>();
		ArrayList<String> dictionaryList = new ArrayList<>();

		//File t1 = new File(TEST_FILE);
		//File d1 = new File(DICTO_FILE);
		if (!(t1.exists())) {
			 t1 = new File(TEST_FILE);
			 System.out.println("You did not enter a test file name: The system will load the defualt ");
		}
		if (!(d1.exists())) {
			 d1 = new File(DICTO_FILE);
			 System.out.println("You did not enter a dictionary file name: The system will load the defualt ");
		}
		// Calls readFile method and then store in ArrayList
		testList = readFile(t1);
		dictionaryList = readFile(d1);

		findBadWords(testList, dictionaryList);

	}// End of Main

}// End of Spell Check class
