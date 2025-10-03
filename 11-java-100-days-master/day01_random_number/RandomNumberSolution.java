package day01_random_number;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberSolution {

    public int generateWithRandom(int min, int max) {
        if (!isValidRange(min, max)) {
            throw new IllegalArgumentException("Invalid range: min must be <= max");
        }
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public int generateWithThreadLocalRandom(int min, int max) {
        if (!isValidRange(min, max)) {
            throw new IllegalArgumentException("Invalid range: min must be <= max");
        }
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int[] generateMultiple(int min, int max, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count must be positive");
        }
        if (!isValidRange(min, max)) {
            throw new IllegalArgumentException("Invalid range");
        }

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = generateWithThreadLocalRandom(min, max);
        }
        return numbers;
    }

    public boolean isValidRange(int min, int max) {
        return min <= max;
    }
}
