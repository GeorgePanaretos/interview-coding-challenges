package Test;
import org.junit.Test;
import static org.junit.Assert.*;
import primechecker.validate.ValidateString;

public class ValidateStringTest {
    ValidateString str;
    
    public ValidateStringTest() {
    }
    
    @Test
    public void TestValidateStringIsFalse() {
        boolean x=str.validateStr("");
        assertEquals(false,x);
        System.out.println("The given is string is null");
        System.out.print("\n");
    }
    @Test
    public void TestValidateStringIsTrue() {
        boolean x=str.validateStr("3 15 31 51");
        assertEquals(true,x);
        System.out.println("The given is string numeric");
        System.out.print("\n");
    }
    
    @Test
    public void TestValidateStringIsNonNumeric() {
        boolean x=str.validateStr("3 a 31 c");
        assertEquals(false,x);
        System.out.println("The given is string non numeric");
        System.out.print("\n");
    }
}