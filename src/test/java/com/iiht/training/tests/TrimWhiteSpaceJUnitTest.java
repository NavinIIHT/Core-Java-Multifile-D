package com.iiht.training.tests;

import static com.iiht.training.testutils.TestUtils.boundaryTestFile;
import static com.iiht.training.testutils.TestUtils.businessTestFile;
import static com.iiht.training.testutils.TestUtils.currentTest;
import static com.iiht.training.testutils.TestUtils.exceptionTestFile;
import static com.iiht.training.testutils.TestUtils.testReport;
import static com.iiht.training.testutils.TestUtils.yakshaAssert;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.iiht.training.reverse.ReverseVowels;
import com.iiht.training.trimwhitespaces.TrimWhiteSpaces;

public class TrimWhiteSpaceJUnitTest {

	public static TrimWhiteSpaces trimWhiteSpaces = null;

	@BeforeAll
	public static void beforeAll() {
		trimWhiteSpaces = new TrimWhiteSpaces();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testTrimExtraWhiteSpaces() throws Exception {
		String str = "how            are      you      ?";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("how are you ?") ? true : false, businessTestFile);
	}

	@Test
	public void testTrimExtraWhiteSpacesForExtremeMinimal() throws Exception {
		String str = "Hi      All";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("Hi All") ? true : false, businessTestFile);
	}

	@Test
	public void testTrimeExtraWhiteSpacesForExtremePositive() throws Exception {
		String str = "Welcome     To    IIHT      Learning     Portal";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("Welcome To IIHT Learning Portal") ? true : false, businessTestFile);
	}

	@Test
	public void testTrimExtraWhiteSpacesForInvalidDataInput() throws Exception {
		String str = "IIHT";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("IIHT") ? true : false, businessTestFile);
	}

	@Test
	public void testTrimExtraWhiteSpacesForNoValue() throws Exception {
		String str = "";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("") ? true : false, boundaryTestFile);
	}

	@Test
	public void testTrimExtraWhiteSpacesExceptionalValue() throws Exception {
		String str = "     Hi    All   ";
		String trim = trimWhiteSpaces.trimWhiteSpaces(str);
		yakshaAssert(currentTest(), trim.contentEquals("Hi All") ? true : false, exceptionTestFile);
	}

}