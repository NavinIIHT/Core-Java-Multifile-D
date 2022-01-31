package com.iiht.training.reverse;

import java.util.Scanner;

public class ReverseVowels {

	public String reverseVowels(String str) {
      //Write code here
		return "";
	}

	public static void main(String[] args) {
		ReverseVowels reverseVowels = new ReverseVowels();
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String reverseString = reverseVowels.reverseVowels(str);
		System.out.print(reverseString);

	}
}
