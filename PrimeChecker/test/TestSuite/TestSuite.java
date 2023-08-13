/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuite;

import Test.ConvertToIntTest;
import Test.CountPrimesTest;
import Test.ValidatePrimeTest;
import Test.ValidateStringTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
  ValidateStringTest.class,
  ConvertToIntTest.class,
  ValidatePrimeTest.class,
  CountPrimesTest.class
})

public class TestSuite {   
}  
