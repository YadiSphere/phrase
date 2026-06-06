

import org.junit.jupiter.api.Test;
import phrase.Shout;

import static org.junit.jupiter.api.Assertions.*;

    class ShoutTest {

        @Test
        void testEndsWithExclamation() {
            Shout sh = new Shout("What a beautiful day");
            assertTrue(sh.get().endsWith("!"));
        }

        @Test
        void testLength() {
            Shout sh = new Shout("What a beautiful day");
            assertEquals("What a beautiful day!".length(), sh.get().length());
        }
    }

