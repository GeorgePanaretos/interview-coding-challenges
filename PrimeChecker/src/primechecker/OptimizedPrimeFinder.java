import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OptimizedPrimeFinder {
    public static List<Integer> findPrimes(ArrayList<Integer> numbers) {
        return numbers.parallelStream() // Parallel processing for performance boost
                .filter(OptimizedPrimeFinder::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 5; i <= sqrt; i += 6) { // Check only numbers in form of 6k ± 1
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) { // Example: 1 to 1,000,000
            inputNumbers.add(i);
        }

        long startTime = System.nanoTime();
        List<Integer> primes = findPrimes(inputNumbers);
        long endTime = System.nanoTime();

        System.out.println("Total prime numbers found: " + primes.size());
        System.out.println("Execution time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
