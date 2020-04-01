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
public class Execute {

    public static void main(String[] args) {
    	ValidatePrime validatePrime = new ValidatePrime();
    	ProcessPrinterPrime printerPrime = new ProcessPrinterPrime();
    	printerPrime.printPrime(validatePrime.getPrimes());
    }
}
