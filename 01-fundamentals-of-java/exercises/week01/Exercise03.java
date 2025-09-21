package exercises.week01;

import exercises.utils.Input;

public class Exercise03 {
    public static void main(String[] args) {
        int number;

        IO.println("Enter a number: ");
        number = Input.numInteger();

        if (number > 0) {
            IO.println("Number is positive");
        } else if (number < 0) {
            IO.println("Number is negative");
        } else {
            IO.println("Number is zero");
        }

    }
}