package com.mm;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFinder {

    private List primeFactors = new ArrayList<>();

    public List<Integer> getPrimeFactorsList(int number) {
        int checkNumber = number;
        for (int i = 2; i < number; i++) {
            while (checkNumber % i == 0) {
                primeFactors.add(i);
                checkNumber /= i;
            }
        }

        return primeFactors;
    }
}
