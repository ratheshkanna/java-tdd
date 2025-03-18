package main;


/**
 * This program has logic to find prime number based on user input
 */
public class PrimeNumber {

	public boolean findPrimeNumber(int input) {

		if (input < 2) {
			return false;
		}
		
		for (int i = 2; i*i <= input; i++) {
			if (input % i == 0) {
				return false;
			}
		}

		return true;
	}

}
