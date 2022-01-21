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
        Assert.assertNull(cohort.getStudents());

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
