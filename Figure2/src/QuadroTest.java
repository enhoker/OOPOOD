import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadroTest {
    @Test
    public void testQuadro() {
        Quadro a = new Quadro(1);
        Quadro b = new Quadro(0.5f);
        Quadro c = new Quadro(100.4f);

        float sa = 1;
        float sb = 0.25f;
        float sc = (100.4f)*(100.4f);


        boolean x = (Math.abs(a.square() - sa) < 0.1) && (Math.abs(b.square() - sb) < 0.1) && (Math.abs(c.square() - sc) < 0.1);
        Assert.assertTrue(x);

    }

}