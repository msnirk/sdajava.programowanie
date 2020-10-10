package pl.exercises;

public class Main {

    public static void main(String[] args) {

        printMultiplyResult(5);
    }
        private static void printMultiplyResult(int multiplierBase)
        {
            for (int x = 1; x <= 5; x++) {
                int result = multiplierBase * x;
                System.out.println(multiplierBase + " x " + x + " = " + result);
            }
        }
    }


