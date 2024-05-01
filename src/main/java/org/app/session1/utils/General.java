package org.app.session1.utils;

public class General {

    public static Integer factorial(int number, int total) {
        if (number == 0) {
            return total;
        } else {
            int nextIterationNumber = number - 1;
            total = number * nextIterationNumber;
            return factorial(nextIterationNumber, total);
        }
    }
}
