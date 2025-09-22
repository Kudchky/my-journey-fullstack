package exercises.week01;

import exercises.utils.Input;

public class Exercise06 {
    static void main(String[] args) {
        int num1, num2, num3;

        System.out.println("Enter first number: ");
        num1 = Input.numInteger();
        System.out.println("Enter second number: ");
        num2 = Input.numInteger();
        System.out.println("Enter third: ");
        num3 = Input.numInteger();

        if (num1 > num2 && num2 > num3) {
            System.out.println(num1 + " > " + num2 + " > " + num3);
        } else if (num1 > num2 && num3 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        } else if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + " > " + num2 + " > " + num1);
        } else {
            System.out.println("There are numbers equals....");
        }
    }
}
