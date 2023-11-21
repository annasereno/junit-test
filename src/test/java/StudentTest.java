import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    //reusable instance variable
    private Student mickey = null;

    @Before//resets student before every single test
    public void setup() {
        mickey = new Student(1, "Mickey");

        mickey.addGrade(80);
        mickey.addGrade(89);
        mickey.addGrade(90);
        mickey.addGrade(78);
    }

    @Test
    public void testId(){
        Student mickey = new Student(1, "Mickey");
        assertEquals(1, mickey.getId());
    }

    @Test
    public void testName(){
        Student mickey = new Student(1, "Mickey");
        assertEquals("Mickey", mickey.getName());
    }

    @Test
    public void testEquals(){
        Student otherMickey = new Student(1, "Mickey");
        assertEquals(mickey, otherMickey);
    }

    @Test
    public void testGradeAverage(){
        assertEquals(84.25, mickey.getGradeAverage(), 0.01);
    }

    @Test
    public void testAddGrade(){
        //add a single grade to see if added to arrayList
        mickey.getGrades().clear();
        mickey.addGrade(78);
        assertEquals(1, mickey.getGrades().size());
        assertEquals(78, mickey.getGrades().get(0).intValue());
    }

}
