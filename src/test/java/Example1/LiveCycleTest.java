package Example1;

import org.junit.jupiter.api.*;

public class LiveCycleTest {


    @BeforeAll //pries viska
    public static void setupBeforeClass() {
        System.out.println("1. Vykdomas pries visa klase");


    }

    @BeforeEach
    void setUpBeforeEveryTestCase() {
        System.out.println("2. Vykdomas pries kiekviena test case'a");
    }

    @Test
    void testLifeCycle() {

    }

    @Test
    void testLifeCycleAgain() {

    }

    @AfterEach
    void tearDownAfterEveryTestCase() {
        System.out.println("3. Vykdomas po kiekvieno testo");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("4. Vykdomas po visos klases");
    }



}
