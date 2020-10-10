package pl.exercises;

import java.util.Arrays;

public class Ex7 {


    static int[] getArithmeticSequence(int lengh, int firstElement, int diff) {

        int[] arithmeticSequence = new int[lengh];
        for (int i = 0; i < arithmeticSequence.length; i++)
            arithmeticSequence[i] = firstElement + diff * i;

        return arithmeticSequence;
    }


    public static void main(String[] args) {
        int[] smallArithmeticSequence = getArithmeticSequence(5, 47, 13);
        int[] bigArithmeticSequence = getArithmeticSequence(155, 47, 13);
        System.out.println(Arrays.toString(smallArithmeticSequence));
        System.out.println(Arrays.toString(bigArithmeticSequence));

    }
}


// <static/    > <returnType> <nazwa metody> (argumenty i ich typy po przecinku) {
//      method implementation
//      <return/     >
// }