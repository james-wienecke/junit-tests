import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    List<Student> testStudents;

    @Before
    public void setupCohort() {
        cohort = new Cohort();
        testStudents = new ArrayList<>();
        testStudents.add(new Student(14L, "cooper"));
        testStudents.add(new Student(127L, "leland"));
        testStudents.add(new Student(131L, "sarah"));
    }

    //// A Cohort instance can add a Student to the List of students.
    @Test
    public void addStudentTest() {
        assertEquals(0, cohort.getStudents().size());
        cohort.addStudent(new Student(1234L, "laura"));
        assertEquals(1, cohort.getStudents().size());

    }

    //// A Cohort instance can get the current List of students.
    @Test
    public void getCohortStudentsTest() {

        cohort.addStudent(testStudents.get(0));
        cohort.addStudent(testStudents.get(1));
        cohort.addStudent(testStudents.get(2));
        assertEquals(3, cohort.getStudents().size());
        assertEquals(testStudents, cohort.getStudents());
    }

    //// A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void getCohortAverageTest() {
        testStudents.get(0).addGrade(92);
        testStudents.get(0).addGrade(95);
        testStudents.get(0).addGrade(83);

        testStudents.get(1).addGrade(90);
        testStudents.get(1).addGrade(78);
        testStudents.get(1).addGrade(65);
        testStudents.get(1).addGrade(76);

        testStudents.get(2).addGrade(60);
        testStudents.get(2).addGrade(83);
        testStudents.get(2).addGrade(90);
        testStudents.get(2).addGrade(92);
        testStudents.get(2).addGrade(100);

        for (Student student : testStudents) {
            cohort.addStudent(student);
        }
        assertEquals(84d, cohort.getCohortAverage(), 0.1);

    }
}
