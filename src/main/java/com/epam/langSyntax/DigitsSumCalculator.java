package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int revertNum = 0;
        for (int i = 0; i < 4; i++) {
            revertNum += number % 10;
            number /= 10;
        }
        System.out.println(revertNum);
    }
}
