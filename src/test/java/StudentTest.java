import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void studentConstructorTest() {
        long id = 1234L;
        String name = "test";
        Student student = new Student(id, name);
        Student nonstudent = null;
        Assert.assertNotNull(student);
        Assert.assertNull(nonstudent);
    }

    long testId;
    String testName;
    Student test;
    ArrayList<Integer> testGradesInt;
    ArrayList<Integer> testGradesIntEmpty;
    ArrayList<String> testGradesStr;


    @Before
    public void testStudentBuilder() {
        testId = 123456789L;
        testName = "test student";
        test = new Student(testId, testName);

        testGradesStr = new ArrayList<>();
        testGradesInt = new ArrayList<>();
        testGradesIntEmpty = new ArrayList<>();

        testGradesStr.add("hello");
        testGradesStr.add("i am not an integer");

        testGradesInt.add(92);
        testGradesInt.add(76);
        testGradesInt.add(85);
        testGradesInt.add(79);
        testGradesInt.add(80);
    }

    @Test
    public void studentGetId() {
        Assert.assertNotNull(test.getId());
        Assert.assertEquals(testId, test.getId());
        Assert.assertNotEquals(654L, test.getId());
    }

    @Test
    public void studentGetName() {
        Assert.assertNotNull(test.getName());
        Assert.assertEquals(testName, test.getName());
        Assert.assertNotEquals("bad value", test.getName());
    }

    @Test
    public void studentGetGrades() {
        Assert.assertNotNull(test.getGrades());
        Assert.assertNotSame(testGradesInt, test.getGrades());
    }
}
