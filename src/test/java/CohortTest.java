import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;


    @Before
    public void setupCohort() {
        cohort = new Cohort();
    }

    //// A Cohort instance can add a Student to the List of students.
    @Test
    public void addStudentTest() {
        Assert.assertEquals(0, cohort.getStudents().size());
        cohort.addStudent(new Student(1234L, "laura"));
        Assert.assertEquals(1, cohort.getStudents().size());

    }
    //// A Cohort instance can get the current List of students.
    @Test
    public void getCohortStudents() {

    }

    //// A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void getCohortAverage() {

    }
}
