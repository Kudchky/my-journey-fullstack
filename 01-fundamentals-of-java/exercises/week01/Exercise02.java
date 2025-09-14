package exercises.week01;

public class Exercise02 {
    public static void main(String[] args) {
        String stringOne = "Hello";
        String stringTwo = "HELLO";
        String result;

        if (stringOne.equals(stringTwo)) {
            result = stringOne + " is equal to " + stringTwo;
        } else {
            result = stringOne + " is different to " + stringTwo;
        }

        System.out.println(result);
    }
}
