package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertNum = 0;
        int temp = 100;
        for (int i = 0; i < 3; i++) {
            revertNum += number % 10 * temp;
            number /= 10;
            temp /= 10;
        }
        System.out.println(revertNum);
    }
}
