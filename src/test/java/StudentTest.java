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

    @Test
    public void studentSetId() {
        long setIdVal = 92L;
        test.setId(setIdVal);
        Assert.assertNotEquals(testId, test.getId());
        Assert.assertEquals(setIdVal, test.getId());
        test.setId(testId);
        Assert.assertNotEquals(setIdVal, test.getId());
        Assert.assertEquals(testId, test.getId());

    }
    @Test
    public void studentSetName() {
        String setNameVal = "carl";
        test.setName(setNameVal);
        Assert.assertNotEquals(testName, test.getName());
        Assert.assertEquals(setNameVal, test.getName());
        test.setName(testName);
        Assert.assertNotEquals(setNameVal, test.getName());
        Assert.assertEquals(testName, test.getName());

    }
    @Test
    public void studentSetGrades() {
        Assert.assertEquals(testGradesIntEmpty, test.getGrades());
        Assert.assertNotSame(testGradesIntEmpty, test.getGrades());
        Assert.assertNotSame(testGradesInt, test.getGrades());
        test.setGrades(testGradesInt);
        Assert.assertNotEquals(testGradesIntEmpty, test.getGrades());
        Assert.assertEquals(testGradesInt, test.getGrades());
        Assert.assertSame(testGradesInt, test.getGrades());
        test.setGrades(new ArrayList<>());
        Assert.assertEquals(testGradesIntEmpty, test.getGrades());
    }

    @Test
    public void studentAddGrade() {
        test.addGrade(testGradesInt.get(0));
        Assert.assertNotNull(test.getGrades().get(0));
        for (int i = 1; i < testGradesInt.size(); i++) {
            test.addGrade(testGradesInt.get(i));
        }
        Assert.assertNotEquals(testGradesIntEmpty, test.getGrades());
        Assert.assertEquals(testGradesInt, test.getGrades());
        Assert.assertNotSame(testGradesInt, test.getGrades());
    }

    @Test
    public void studentGradeAvg() {
        test.addGrade(100);
        Assert.assertNotEquals(0, test.getGradeAverage(), 0);
        Assert.assertEquals(100, test.getGradeAverage(), 0);
        test.addGrade(50);
        Assert.assertEquals(75, test.getGradeAverage(), 0.01);
        test.addGrade(75);
        Assert.assertEquals(75, test.getGradeAverage(), 0.01);
        test.setGrades(new ArrayList<>());
        Assert.assertEquals(0, test.getGradeAverage(), 0);
    }
}
