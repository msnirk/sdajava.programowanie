package pl.exercises;

public class Ex10 {

    static boolean isRemainderTheSame(int numberToDivide, int divider) {

        int reminderAfterDivisionFromEx9 = Ex9.getReminderAferDivisio(numberToDivide, divider);
        int moduloResult = numberToDivide % divider;
        if (reminderAfterDivisionFromEx9 == moduloResult)
            return true;
        else return false;
    }

    static boolean isRemainderTheSame2(int numberToDivide, int divider) {
       return Ex9.getReminderAferDivisio(numberToDivide, divider) == numberToDivide % divider;
    }

    public static void main(String[] args) {

        System.out.println(isRemainderTheSame(5, 3));
        System.out.println(isRemainderTheSame2(8,5));
    }
}
