import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    //reusable instance variable
    private Student mickey = null;

    @Before//resets student before every single test
    public void setup(){
        mickey = new Student(1, "Mickey");
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



}
