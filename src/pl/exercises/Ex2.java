package pl.exercises;

public class Ex2 {

    static boolean isNumberPrime(int number) {

        boolean isDivisibleBySomething = false;


        for (int x = 2; x < number; x++) {
            if (number % x == 0) isDivisibleBySomething = true;

        }
        return !isDivisibleBySomething && (number > 1);

    }

    public static void main(String[] args) {

        System.out.println(isNumberPrime(3));
        System.out.println(isNumberPrime(5));
        System.out.println(isNumberPrime(7));
        System.out.println(isNumberPrime(8));
        System.out.println(isNumberPrime(15));

    }
}
