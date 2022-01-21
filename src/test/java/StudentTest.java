import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void studentConstructor() {
        long id = 1234L;
        String name = "test";
        Student student = new Student(id, name);
        Student nonstudent = null;
        Assert.assertNotNull(student);
        Assert.assertNull(nonstudent);
    }
}
