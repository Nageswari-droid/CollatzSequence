import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzSequenceTest {

    private static CollatzSequence collatzSequence;

    @BeforeAll
    public static void setup() {
        int number = 1;
        collatzSequence = new CollatzSequence(number);
    }

    @Test
    public void checkCollatzSequence() {
        ArrayList<Integer> sequenceList = new ArrayList<>(Arrays.asList(1, 4, 2, 1));
        assertIterableEquals(sequenceList, collatzSequence.generateCollatzSequence());
    }

    @Test
    public void checkEvenNumber() {
        assertEquals(2, collatzSequence.getEvenNumberResult(4));
    }

    @Test
    public void checkOddNumber() {
        assertEquals(4, collatzSequence.getOddNumberResult(1));
    }
}
