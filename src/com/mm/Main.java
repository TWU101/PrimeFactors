package com.mm;

public class Main {

    public static void main(String[] args) {
	    PrimeFactorFinder primer = new PrimeFactorFinder();
        primer.getPrimeFactorsList(10).forEach(System.out::println);
    }
}
