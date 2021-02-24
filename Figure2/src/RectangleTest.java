import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void testRectangle() {
        Rectangle a = new Rectangle(1, 5.3f);
        Rectangle b = new Rectangle(0.5f, 10);
        Rectangle c = new Rectangle(100.4f, 1);

        float sa = 5.3f;
        float sb = 5;
        float sc = 100.4f;


        boolean x = (Math.abs(a.square() - sa) < 0.1) && (Math.abs(b.square() - sb) < 0.1) && (Math.abs(c.square() - sc) < 0.1);
        Assert.assertTrue(x);

    }

}