package com.iiht.training.trimwhitespaces;

import java.util.Scanner;

public class TrimWhiteSpaces {

	public static void main(String[] args) {

		TrimWhiteSpaces trimWhiteSpaces = new TrimWhiteSpaces();
		Scanner in = new Scanner(System.in);
		String message = in.nextLine();

		String trimmedMessage = trimWhiteSpaces.trimWhiteSpaces(message);
		System.out.println(trimmedMessage);

	}

	public String trimWhiteSpaces(String message) {
		// Write Code Here
		return "";
	}

}
