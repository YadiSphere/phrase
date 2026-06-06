import org.junit.jupiter.api.Test;
import phrase.Statement;

import static org.junit.jupiter.api.Assertions.*;

class StatementTest {

    @Test
    void testEndsWithDot() {
        Statement s = new Statement("The sky is blue");
        assertTrue(s.get().endsWith("."));
    }

    @Test
    void testLength() {
        Statement s = new Statement("The sky is blue");
        assertEquals("The sky is blue.".length(), s.get().length());
    }
}