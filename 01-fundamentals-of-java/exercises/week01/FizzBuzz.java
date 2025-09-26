package exercises.week01;

public class FizzBuzz {
    void main() {
        int result = countNumber("Fizz", "Buzz");

        System.out.println(result);
    }

    private static int countNumber(String wordOne, String wordTwo) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder();

            if (i % 3 == 0) output.append(wordOne);
            if (i % 5 == 0) output.append(wordTwo);

            if (!output.isEmpty()) {
                System.out.println(output);
            } else {
                System.out.println(i);
                count++;
            }
        }

        return count;
    }
}
