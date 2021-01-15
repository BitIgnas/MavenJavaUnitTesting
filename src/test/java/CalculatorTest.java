import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//test suite
class CalculatorTest {


   private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator  = new Calculator();
    }

    //test case
    @Test
    void testAdd() {
        //given
        Calculator calculator = new Calculator();

        //when
        int actualResult = calculator.add(2, 3);

        //then
        assertEquals(5, actualResult);
    }

    @Test
    void testSubtract() {
        //Calculator calculator = new... nereik, nes yra @BeforeAll su.

        int substractResult = calculator.substract(5, 1);
        int aspectedSubstractionResult = 4;

        assertThat(aspectedSubstractionResult).isEqualTo(substractResult);
    }

    @Test
    void testMultiply(){


        int multiplyResult = calculator.multiply(2, 2);
        int aspectedResult = 4;

        assertThat(multiplyResult).isEqualTo(aspectedResult);

        assertTrue(aspectedResult == multiplyResult);
    }

    @Test
    void testDivision(){


        int divisionResult = calculator.division(8,2);
        int aspectedResult = 4;

        assertThat(divisionResult).isEqualTo(aspectedResult);
    }

    @Test
    void shouldThrowArithmeticExceptionWhenDividingByZero(){
        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.division(5,0);
        });

        //them
        //should throw an exception


    }
}