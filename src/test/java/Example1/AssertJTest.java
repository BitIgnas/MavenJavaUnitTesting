package Example1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThatIOException;

public class AssertJTest {

    @Test
    void testAssertJAnnotations(){
        String actualEilute = "Labas";
        String expectedEilute = "Labas";

        assertThat(actualEilute).isEqualTo(expectedEilute).contains("la");
    }

    @Test
    void testJunitAnnotations(){
        String actualEilute = "labas";
        String expectedEilute = "labas";




    }

    @Test
    void testAssertJAnnotations2() {
        String actualEilute = "labas";
        String expectedEilute = "labas";
        assertThat(actualEilute).isEqualTo(expectedEilute)
                .contains("la")
                .contains("s")
                .endsWith("bas");




    }
}
