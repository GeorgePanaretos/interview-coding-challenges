/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primechecker;

import primechecker.convert.ConvertToInteger;
import primechecker.validate.ValidatePrimes;
import primechecker.validate.ValidateString;

/**
 *
 * @author george156200911
 */
public class CountPrime {
    
    public static ValidatePrimes vp = new ValidatePrimes();
    public static ConvertToInteger cti= new ConvertToInteger();       
    public CountPrime(){}
    
    //Final Method of calculating the numbers of primes in a String 
    public static int countPrimes(String numbers){
        int x[]=cti.convertToInt(numbers);
        if(!(x==null)){
            int count =0;
            for(int j=0;j<x.length;j++){
             if(vp.validatePrimes(x[j])){
                count++;
             }
            }
        return count;
        }
        else {
            return 0;
        }
    }
}
