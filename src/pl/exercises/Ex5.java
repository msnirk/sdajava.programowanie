package pl.exercises;

public class Ex5 {


    static int findExtremeNumber(int[] array, String directionFlag) {

        int extremeNumber = array[0];
        for (int currentValue : array) {
 //       for (int i = 0; i < array.length; i++) {
 //           int currentValue = array[i];

            if (directionFlag.equals("MAX)") && currentValue > extremeNumber) {
                extremeNumber = currentValue;
            } else if (directionFlag.equals("MIN") && currentValue < extremeNumber) {
                extremeNumber = currentValue;
            }

        }
        return extremeNumber;

    }


    static int max(int[] array) {
        return findExtremeNumber(array, "MAX");
    }


    static int min(int[] array) {
        return findExtremeNumber(array, "MIN");
    }


    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {1, 8, -4, 12, 4, 15, 3, 0};
        System.out.println("max: " + max(testArray1) + ", min: " + min(testArray1));
        System.out.println("max: " + max(testArray2) + ", min: " + min(testArray2));
    }
}
