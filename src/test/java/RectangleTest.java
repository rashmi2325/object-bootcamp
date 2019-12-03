import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void shouldReturnArea18ForLength6AndBreadth3() {
        assertEquals(18,new Rectangle(6,3).area());
    }

    @Test
    public void shouldReturnArea32ForLength8AndBreadth4() {
        assertEquals(24,new Rectangle(8,4).area());
    }
}