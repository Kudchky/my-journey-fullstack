package day01_random_number;

/**
 * Exercise: Random Number Generator
 *
 * Implement methods to generate random numbers within specific ranges.
 * Focus on correctness, performance, and code clarity.
 *
 */
public class RandomNumberExercise {

    /**
     * Generate a random integer between min and max (inclusive)
     * using java.util.Random
     */
    public int generateWithRandom(int min, int max) {
        // TODO: Implement this method
        // Hint: Use Random class and nextInt method
        return 0;
    }

    /**
     * Generate a random integer between min and max (inclusive)
     * using ThreadLocalRandom (better for multi-threaded environments)
     */
    public int generateWithThreadLocalRandom(int min, int max) {
        // TODO: Implement this method
        // Hint: Use ThreadLocalRandom.current().nextInt(min, max + 1)
        return 0;
    }

    /**
     * Generate multiple random numbers
     * @param count how many numbers to generate
     * @return array of random numbers
     */
    public int[] generateMultiple(int min, int max, int count) {
        // TODO: Implement this method
        // Generate 'count' random numbers between min and max
        return new int[0];
    }

    /**
     * Validate if the range is correct
     */
    public boolean isValidRange(int min, int max) {
        // TODO: Implement validation
        return false;
    }
}