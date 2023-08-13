package Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import primechecker.validate.ValidatePrimes;

@RunWith(Parameterized.class)
public class ValidatePrimeTest {
    private int inputNumber;
    private Boolean expectedResult;
    private ValidatePrimes prime;
    
    public ValidatePrimeTest(Integer inputNumber, Boolean expectedResult) {
        System.out.println("Test Unit-> Input Number: "+inputNumber+" Expected Result: "+expectedResult);
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
     }

     @Parameterized.Parameters
     public static Collection primeNumbers() {
       System.out.println("Parameterized called");
       System.out.println();
        return Arrays.asList(new Object[][] {
           { 3, true },
           { 15, false },
           { 31, true },
           { 51, false }
        });
     }

     @Test
     public  void validatePrimeNumber() {
        assertEquals(expectedResult, prime.validatePrimes(inputNumber));
     }

}
