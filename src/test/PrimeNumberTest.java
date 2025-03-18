package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import main.PrimeNumber;

/**
 * The is TDD test class that validates the prime number. 
 */
public class PrimeNumberTest {
	
	PrimeNumber primeNumber = new PrimeNumber();
	
	/**
	 * This test case validates whether the given value is not a prime number.
	 */
	@Test
	void isNotPrimeNumber() {
		assertFalse(primeNumber.findPrimeNumber(9));
	}
	
	/**
	 * This test case validates whether the given value 0 is not a prime number.
	 */
	@Test
	void isNotPrimeNumberForZero() {
		assertFalse(primeNumber.findPrimeNumber(0));
	}
	
	/**
	 * This test case validates whether the given value is prime number.
	 */
	@Test
	void isPrimeNumber() {
		assertTrue(primeNumber.findPrimeNumber(113));
	}
	

}
