package NormalVsParallelStram;

import java.util.Arrays;
import java.util.List;

public class NormalStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfSquares = numbers.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .mapToInt(n -> n * n)      // Map to their squares
                .sum();                    // Sum the squares

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}

