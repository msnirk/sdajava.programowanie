package pl.exercises;

public class Ex3 {

    static int sum(int a, int b) {
        int sum = 0;
        for (int counter = a; counter <= b; counter++) {
            sum += counter;

        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(sum(5,7));
        System.out.println(sum(1,128));
        System.out.println(sum(1,4));
    }

}