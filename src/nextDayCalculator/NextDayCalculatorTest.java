package nextDayCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test case 1-1-2018")
    void testNextDayCalculator(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "2/1/2018";

        String result = NextDayCalculator.nextDayCalculator(1,1,2018);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("Test case 29-2-2018")
    void testNextDayCalculator2(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "1/3/2018";

        String result = NextDayCalculator.nextDayCalculator(29,2,2018);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("Test case 31-1-2018")
    void testNextDayCalculator3(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "1/2/2018";

        String result = NextDayCalculator.nextDayCalculator(31,1,2018);
        assertEquals(excepted,result);
    }
    @Test
    @DisplayName("Test case 30-4-2018")
    void testNextDayCalculator4(){
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "1/5/2018";

        String result = NextDayCalculator.nextDayCalculator(30,4,2018);
        assertEquals(excepted,result);
    }

}