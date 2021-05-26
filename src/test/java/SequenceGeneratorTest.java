import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceGeneratorTest {
    private static SequenceGenerator sequenceGenerator;

    @BeforeAll
    public static void setup() {
        sequenceGenerator = new SequenceGenerator();
    }

    @Test
    public void checkTheNumberIsPositive() {
        assertEquals(true, sequenceGenerator.validateNumber(3));
    }

    @Test
    public void checkTheNumberIsNegative() {
        assertEquals(false, sequenceGenerator.validateNumber(-2));
    }

}
