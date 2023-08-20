package Test;

import primechecker.PrimeChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    public void testCountPrimes() {
        PrimeChecker primeChecker = new PrimeChecker();

        // Test case 1: Blank input
        System.out.println("Test case 1: Blank input");
        assertEquals(0, primeChecker.countPrimes(""));

        // Test case 2: Null input
        System.out.println("Test case 2: Null input");
        assertEquals(0, primeChecker.countPrimes(null));

        // Test case 3: Valid input with default separator
        System.out.println("Test case 3: Valid input with default separator");
        assertEquals(2, primeChecker.countPrimes("3 15 31 51"));

        // Test case 4: Valid input with custom separator
        primeChecker = new PrimeChecker(",");
        System.out.println("Test case 4: Valid input with custom separator");
        assertEquals(2, primeChecker.countPrimes("3,15,31,51"));

        // Test case 5: Valid input with different separator
        primeChecker = new PrimeChecker("-");
        System.out.println("Test case 5: Valid input with different separator");
        assertEquals(2, primeChecker.countPrimes("3-15-31-51"));

        // Test case 6: Non-numeric input
        System.out.println("Test case 6: Non-numeric input");
        assertEquals(0, primeChecker.countPrimes("3 15 31 a"));

    }
}
