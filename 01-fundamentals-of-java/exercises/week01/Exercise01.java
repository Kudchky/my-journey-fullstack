package exercises.week01;

public class Exercise01 {
    public static void main(String[] args) {
        int numberOne = 5;
        int numberTwo = 23;
        String result;

        if (numberOne > numberTwo) {
            result = numberOne + " is greater than " + numberTwo;
        } else if (numberOne < numberTwo) {
            result = numberOne + " is less than " + numberTwo;
        } else {
            result = numberOne + " is equals to " + numberTwo;
        }

        System.out.println(result);
    }
}

