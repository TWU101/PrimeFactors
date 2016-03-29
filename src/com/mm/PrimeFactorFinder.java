package com.mm;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFinder {

    private int number;
    List<> primeFactors = new ArrayList<>();

    public List<Integer> getPrimeFactorsList(int number) {
        int this.number = number;
        for (int i = 1; i < number; i++) {
            if (this.number % i == 0) {
                primeFactors.add(i);
            }
        }
    }
}
