import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void testCircle() {
        Circle a = new Circle(1);
        Circle b = new Circle(0.5f);
        Circle c = new Circle(100.4f);

        float pi = 31415 / 10000;

        float sa = pi*4;
        float sb = pi*4*0.25f;
        float sc = pi*4*(100.4f)*(100.4f);


        boolean x = (Math.abs(a.square() - sa) < 0.1) && (Math.abs(b.square() - sb) < 0.1) && (Math.abs(c.square() - sc) < 0.1);
        Assert.assertTrue(x);

    }

}