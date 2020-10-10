package pl.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex4 {

    static int[] switchStuff(int[] array1) {

        int a = array1[0];
        int b = array1[2];

        int[] array2 = {b, array1[1], a};
        return array2;
    }


    public static void main(String[] args) {
        int[] testArrey1 = {1, 2, 3};
        System.out.println(Arrays.toString(switchStuff(testArrey1)));
        System.out.println("oryginalna tablica: " + Arrays.toString(testArrey1));

    }
}
