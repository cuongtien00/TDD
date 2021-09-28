package fizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Test case 3")
    void  testFizzBuzz(){
        int number = 3;
        String excepted = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("Test case 5")
    void  testFizzBuzz2(){
        int number =5;
        String excepted = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("Test case 15")
    void  testFizzBuzz3(){
        int number = 15;
        String excepted = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(excepted,result);
    }

}