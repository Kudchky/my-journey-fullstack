package exercises.week01;

import exercises.utils.Input;

public class Exercise07 {
    void main() {
        int num = -1;

        while (num < 0 || num > 99999) {
            System.out.println("Enter a number between 0 and 99999: ");

            try {
                num = Input.numInteger();
            } catch (NumberFormatException e) {
                System.out.println("Error: You must enter only numbers. \n");
                num = -1;
            }
        }
        String numText = String.valueOf(num);
        int size = numText.length();

        System.out.println("The number has " + size + " " + "figures");
    }
}
