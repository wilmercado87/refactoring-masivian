/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.masivian.refactoring;

/**
 *
 * @author wmercado
 */
public class ProcessPrinterPrime extends BasePrime {

	public void printPrime(int ... primes) {
		int pageNumber = 1;
		int pageOffSet = 1;
		while (pageOffSet <= QUANTY_NUMBER_PAGE) {
			System.out.println(headerPagePrint(pageNumber));
			for (int rowOffSet = pageOffSet; rowOffSet <= pageOffSet + RR - 1; rowOffSet++) {
				for (int i = 0; i <= COLUMN_QUANTITY - 1; i++) {
					if (rowOffSet + i * RR <= QUANTY_NUMBER_PAGE) {
						System.out.printf("%10d", primes[rowOffSet + i * RR]);
					}
				}
				System.out.println();
			}
			System.out.println("\f");
			pageNumber++;
			pageOffSet += RR * COLUMN_QUANTITY;
		}
	}
	
	public String headerPagePrint(int pageNumber) {
		StringBuilder header = new StringBuilder();
		header.append(MSG_FIRST);
		header.append(QUANTY_NUMBER_PAGE);
		header.append(MSG_PRIME_NUMBERS_PAGE);
		header.append(pageNumber);
		header.append("\n");
		
		return header.toString();
	}
}
