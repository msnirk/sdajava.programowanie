package pl.exercises;

public class Ex9 {

    static int getReminderAferDivisio(int numberToDivide, int divider) {


        int resultOfDivision = numberToDivide / divider;
        int reminderAfterDivision = numberToDivide - (divider * resultOfDivision);

        return reminderAfterDivision;
    }

    public static void main(String[] args) {

        System.out.println(getReminderAferDivisio(6, 3));
        System.out.println(getReminderAferDivisio(5, 3));
        System.out.println(getReminderAferDivisio(-2, -6));
        System.out.println(getReminderAferDivisio(-2, 0));

    }
}
