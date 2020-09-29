package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first result", result);
		result = validator.checkISBN("0140177396");
		assertTrue("second result", result);
	}
	

	@Test
	public void checkAnInvalidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
//	@Test(expected = NumberFormatException.class)
//	public void nineDigitISBNsAreNotAllowed() {
//		ValidateISBN validator = new ValidateISBN();
//		validator.checkISBN("123456789");
//	}
	
	@Test 
	public void nonNumericISBNsAreNotAllowed() {
		fail();
//		ValidateISBN validator = new ValidateISBN();
//		Assertions.assertThrows(NumberFormatException.class, () -> validator.checkISBN("helloworld"));
	}


}
