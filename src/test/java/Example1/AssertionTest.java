package Example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssertionTest {

    @Test
    void testAssertEquals(){
        int expectedResult = 64;

        int actualResult = 2 * 32;

        assertEquals(expectedResult, actualResult);
        actualResult = 1 * 64;
        //tvirtinu, kad yra lygu - tiketina ir tikrasis rezultatas
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testAssertTrueFalse(){
        assertTrue(3 == 3);
        boolean endsWithA = "Hello".endsWith("a");
        assertFalse(endsWithA);


    }

    @Test
    void testAssertNull(){
        String eilute = null;
        assertNull(eilute);
    }

    @Test

    void testAssertArrayEquals() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        assertArrayEquals(firstArray, secondArray);
    }
}
