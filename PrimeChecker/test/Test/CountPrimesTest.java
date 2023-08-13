package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import primechecker.CountPrime;

public class CountPrimesTest {
    
    public CountPrimesTest() {
    }
    
   
    @Test
    public void CountPrimeNumbers() {
        CountPrime cp=new CountPrime();
        assertEquals(2,cp.countPrimes("3 15 31 51"));
        System.out.print("\n");
        System.out.println("'3 15 31 51' The number of primes is: "+cp.countPrimes("3 15 31 51"));    
        System.out.print("\n");
    }
    
}
