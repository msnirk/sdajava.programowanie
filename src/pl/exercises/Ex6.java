package pl.exercises;

import java.util.Arrays;

public class Ex6 {

    static int[] getNegativeValues(int[] array) {
        int negativeCount = countNegativeValues(array);

        if (negativeCount > 0) {

            int[] negativeValues = new int[negativeCount];
            int indexOfNegativeValues = 0;

            for (int currentValue : array) {
                if (currentValue < 0) {
                    negativeValues[indexOfNegativeValues] = currentValue;
                    indexOfNegativeValues++;
                }
            }
            return negativeValues;
        }
        return null;
    }

    static int countNegativeValues(int[] array) {

        int count = 0;
        for (int i : array) {
            if (i < 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, -4, 3, 4, -55, 5};
        int[] negativeValues = getNegativeValues(testArray1);
        System.out.println("array of negative values = " + Arrays.toString(negativeValues));
    }
}
