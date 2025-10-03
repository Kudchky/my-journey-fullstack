package day01_random_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {

    @Test
    void testGenerateWithRandom() {
        RandomNumberExercise generator = new RandomNumberExercise();

        for (int i = 0; i < 100; i++) {
            int result = generator.generateWithRandom(1, 10);
            assertTrue(result >= 1 && result <= 10,
                    "Generated number should be between 1 and 10");
        }
    }

    @Test
    void testInvalidRange() {
        RandomNumberExercise generator = new RandomNumberExercise();

        assertThrows(IllegalArgumentException.class,
                () -> generator.generateWithRandom(10, 1));
    }

    @Test
    void testGenerateMultiple() {
        RandomNumberExercise generator = new RandomNumberExercise();

        int[] numbers = generator.generateMultiple(5, 15, 20);
        assertEquals(20, numbers.length);

        for (int number : numbers) {
            assertTrue(number >= 5 && number <= 15);
        }
    }
}
