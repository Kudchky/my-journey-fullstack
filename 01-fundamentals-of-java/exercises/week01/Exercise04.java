package exercises.week01;

import exercises.utils.Input;

public class Exercise04 {
    void main(String[] args) {
        double radius;
        final double PI = 3.14159;

        IO.println("Input radius of the circle: ");
        radius = Input.numDouble();

        IO.println("The area of circle is: " + PI * radius * radius);
    }
}