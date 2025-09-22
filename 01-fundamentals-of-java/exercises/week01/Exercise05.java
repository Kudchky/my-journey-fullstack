package exercises.week01;

import exercises.utils.Input;

public class Exercise05 {
    static void main(String[] args) {
        int numOne, numTwo;

        IO.println("Enter a number: ");
        numOne = Input.numInteger();

        IO.println("Enter second number: ");
        numTwo = Input.numInteger();

        if (numOne % numTwo == 0) {
            IO.println("Numbers are multiple");
        } else {
            IO.println("No multiples");
        }
    }
}
