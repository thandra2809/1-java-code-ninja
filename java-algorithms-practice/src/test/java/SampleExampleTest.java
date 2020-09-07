import junit.framework.TestCase;
import org.junit.Test;

public class SampleExampleTest extends TestCase {
    protected int value1, value2;


    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }


    @Test
    public void testAdd(){
        double result = value1 + value2;
        assertTrue(result == 6);
    }

}
