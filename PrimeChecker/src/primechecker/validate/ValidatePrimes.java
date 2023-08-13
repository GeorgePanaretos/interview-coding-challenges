package primechecker.validate;

public class ValidatePrimes {
    
    public ValidatePrimes() {}
    
    //Validate the current number if it is Prime
    public static boolean validatePrimes(int number){
       for (int i = 2; i < (number / 2); i++) {
        if (number% i == 0) {
         return false;
        }
       }
       return true;
    }
   
}
