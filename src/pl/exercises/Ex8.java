package pl.exercises;

import java.util.Arrays;

public class Ex8 {

    static boolean sequenceIsArithmetic(int[] arrayToVerify) {
        int difference = arrayToVerify[1] - arrayToVerify[0];
        if (arrayToVerify.length <= 2) return false;
        for (int i = 2; i < arrayToVerify.length; i++) {
            if ((arrayToVerify[i] - arrayToVerify[i - 1]) != difference) return false;
        }
        return true;
    }

    static boolean sequenceIsArithmetic2(int[] arrayToVerify) {

        int difference = arrayToVerify[1] - arrayToVerify[0];
        int firstElement = arrayToVerify[0];

        int[] newArray = new int[arrayToVerify.length];

        for (int i = 0; i < arrayToVerify.length; i++) {
            newArray[i] = firstElement + difference * i;
        }
        return Arrays.equals(newArray, arrayToVerify);
    }

    static boolean sequenceIsArithmetic3(int[] arrayToVerify) {

        int difference = arrayToVerify[1] - arrayToVerify[0];
        int firstElement = arrayToVerify[0];

        int[] newArray = Ex7.getArithmeticSequence(arrayToVerify.length, firstElement, difference);
        return Arrays.equals(newArray, arrayToVerify);
    }


    public static void main(String[] args) {


        int[] sequence1 = {1, 3, 5, 7, 9, 11};
        int[] sequence2 = {-2, -5, -3, -11, -19, -8};
        boolean sequence1IsArithmetic = sequenceIsArithmetic3(sequence1);
        boolean sequence2IsArithmetic = sequenceIsArithmetic3(sequence2);

        System.out.println(sequence1IsArithmetic);
        System.out.println(sequence2IsArithmetic);
    }

}
