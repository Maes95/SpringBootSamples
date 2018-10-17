package samples.websocket.tomcat.divider;

import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {

    @Test
    public void divide() {
        Divider d = new Divider();
        int result = d.divide(20,4);
        assertEquals(result, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void divideBy0() {
        Divider d = new Divider();
        d.divide(20,0);
    }
}