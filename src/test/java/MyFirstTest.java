import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullArgumentTest() {
        Assert.assertNotEquals("Hello, null", HelloWorld.hello(null));
    }
}
