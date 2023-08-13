/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primechecker.convert;

import primechecker.validate.ValidateString;

/**
 *
 * @author george156200911
 */
public class ConvertToInteger {
        
    public ConvertToInteger(){}
    
    public static ValidateString vs=new ValidateString();
    
    //Convert the String to an Array of Integer and Validate that the String is Non Numeric
    public static int [] convertToInt(String numbers){
        if(vs.validateStr(numbers)){
        String[] str = numbers.split(" ");
        int primes []=new int[str.length];
        
       for(int i = 0; i < str.length; i++) {
        primes[i] = Integer.parseInt(str[i]);
       }
        return primes;
       }
        else{
            return null;
        }
    }
    
}
