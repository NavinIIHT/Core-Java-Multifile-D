package com.iiht.training.tests;

import static com.iiht.training.testutils.TestUtils.boundaryTestFile;
import static com.iiht.training.testutils.TestUtils.businessTestFile;
import static com.iiht.training.testutils.TestUtils.currentTest;
import static com.iiht.training.testutils.TestUtils.exceptionTestFile;
import static com.iiht.training.testutils.TestUtils.testReport;
import static com.iiht.training.testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.iiht.training.reverse.ReverseVowels;

public class ReverseVowelsJUnitTest {
	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testGetReverseByVowels() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "Hello World";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("Hollo Werld") ? true : false, businessTestFile);
	}
	
	@Test
	public void testGetReverseByVowelsForExtremeMinimal() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "are";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("era") ? true : false, businessTestFile);
	}
	@Test
	public void testGetReverseByVowelsForExtremePositive() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "Welcome To IIHT";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("WIlcImo Te oeHT") ? true : false, businessTestFile);
	}
	
	@Test
	public void testGetReverseByVowelsForInvalidDataInput() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "a";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("a") ? true : false, businessTestFile);
	}
	@Test
	public void testGetReverseByVowelsNoValue() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("") ? true : false, boundaryTestFile);
	}
	
	@Test
	public void testGetReverseByVowelsExceptionalValue() throws Exception {
		ReverseVowels vowels = new ReverseVowels();
		String str = "   hello   ";
		String reverse = vowels.reverseVowels(str);
		yakshaAssert(currentTest(), reverse.contentEquals("   holle   ") ? true : false, exceptionTestFile);
	}

}