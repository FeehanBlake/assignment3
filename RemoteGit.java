package assign3;

import java.util.Scanner;

public class RemoteGit {

	public static void main(String args[]) {

		Scanner scnr = new Scanner(System.in);

		String confirmExamInput;

		double gradeNum;

		char confirmToUpper;
		char gradeLttr = 'F'; // Had to initialize here was throwing errors.

		// Greet user
		System.out.println("Hello! Welcome to the letter grade assignment task!");
		System.out.println("---------------------------------------------------\n");

		// Request user input
		System.out.println("Did you attend the final exam? Yes or No?");
		confirmExamInput = scnr.nextLine();
		confirmToUpper = Character.toUpperCase(confirmExamInput.charAt(0));

		if (confirmToUpper == 'Y') {
			System.out.println("Great! Please enter your numerical grade (0-100).");
			gradeNum = scnr.nextDouble();

			if (gradeNum >= 90) {
				gradeLttr = 'A';
			} else if (gradeNum >= 80) {
				gradeLttr = 'B';
			} else if (gradeNum >= 70) {
				gradeLttr = 'C';
			} else if (gradeNum >= 60) {
				gradeLttr = 'D';
			} else {
				gradeLttr = 'F';
			}

		}

		else if (confirmToUpper == 'N') {
			gradeLttr = 'F';
		}

		System.out.println("Your corrisponding letter grade for this exam is: " + gradeLttr);

		if (gradeLttr == 'A') {
			System.out.println("Wow good job!");
		} else if (gradeLttr == 'B') {
			System.out.println("Good job.");

		} else if (gradeLttr == 'C') {
			System.out.println("Atleast you had passed!");

		} else {
			System.out.println("You Failed!");
		}

		scnr.close();

	}
}


