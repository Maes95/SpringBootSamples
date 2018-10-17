package samples.websocket.tomcat.divider;

import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {

    @Test
    public void divide() {
        Divider d = new Divider();
        String result = d.divide("20 4");
        assertEquals(result, "Result is: 5");
    }

    @Test
    public void divideBy0() {
        Divider d = new Divider();
        String result = d.divide("20 0");
        assertEquals(result, "Can't divide by 0");

    }
}