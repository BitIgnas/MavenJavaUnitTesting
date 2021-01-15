package Example2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HobbitTest {


    @Test
    void testList() {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(listOfIntegers).isNotEmpty();
        assertThat(listOfIntegers).isNotEmpty()
                .startsWith(1)
                .contains(3)
                .doesNotContain(7)
                .doesNotContainNull()
                .containsSequence(3, 4, 5);


    }

    @Test
    void testStringArray() {
        String text = "abc";
        String[] stringArray = {"abs", "cde", "efg"};

        assertThat(text).isEqualTo("abc");
        assertThat(stringArray).hasSize(3).contains("cde").doesNotContain("bce");
    }

    @Test
    void testHobbit() {
        Hobbit frodo = new Hobbit();
        Hobbit sam = new Hobbit();
        sam.setName("Sam");
        Villain sauron = new Villain();
        List<Object> fellowshipOfTheRing = Arrays.asList(frodo, sam);


        assertThat(frodo).isNotEqualTo(sauron).isIn(fellowshipOfTheRing);
        assertThat(sauron).isNotIn(fellowshipOfTheRing);
        assertThat(sam).isNotEqualTo(sauron).isIn(fellowshipOfTheRing);

        assertThat(frodo.getName()).startsWith("Fro").endsWith("do").isEqualToIgnoringCase("frodo");

        assertThat(fellowshipOfTheRing).hasSize(2).contains(sam, frodo).doesNotContain(sauron);
    }
}

