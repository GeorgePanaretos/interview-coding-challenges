package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import primechecker.convert.ConvertToInteger;

public class ConvertToIntTest {
    ConvertToInteger str=new ConvertToInteger();
    public ConvertToIntTest() {
    }
    
    @Test
    public void ConvertIntTest() {
        int[]x = {3,15,31,51};
        assertArrayEquals(x,str.convertToInt("3 15 31 51"));
        System.out.println("The array succefully convert to integer Array");
        System.out.print("\n");
    }
    @Test
    public void ConvertIntTestForEmpty() {
        int[]x = {};
        assertArrayEquals(x,str.convertToInt(" "));
        System.out.println("The Array is empty");
        System.out.print("\n");
    }
}
