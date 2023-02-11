import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OneAndFourTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][] {
                {true, new int[]{1, 1, 1, 4, 4, 1, 4, 4 }},
                {false, new int[]{1, 1, 1, 1, 1, 1}},
                {true, new int[]{4,1}},
                {false, new int[]{4,4,4,4}},
                {false, new int[]{1, 4, 4, 1, 1, 4, 3}}

        });
    }

    private OneAndFour oaf;
    private int[] arr;
    private boolean bool;

    public OneAndFourTest(boolean bool, int[] arr) {
        this.arr = arr;
        this.bool = bool;
    }

    @Before
    public void init(){
        oaf = new OneAndFour();
    }

    @Test
    public void numberBeforeFour() {
        Assert.assertEquals(bool, oaf.oneFourNumbers(arr));

    }
}
