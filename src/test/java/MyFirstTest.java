import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        assertNotEquals(correct, commonly);
    }
}
