package com.masivian.refactoring;

public class ValidatePrime extends BasePrime {

	public int[] getPrimes() {
		int primes[] = new int[QUANTY_NUMBER_PAGE + 1];
		int number;
		primes[1] = 2;
		int indexPrime = 1;
		number = 2;
		while (indexPrime <= QUANTY_NUMBER_PAGE) {
			if (isPrime(number)) {
				primes[indexPrime] = number;
				indexPrime++;
			}
			number++;

		}
		return primes;
	}

	public static boolean isPrime(int number) {
		int index = 0;
		boolean isPrime;
		for (int i = 1; i < (number + 1); i++) {
			if (number % i == 0) {
				index++;
			}
		}
		if (index != 2) {
			isPrime = false;
		} else {
			isPrime = true;
		}
		
		return isPrime;
	}
}
