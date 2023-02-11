import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class NumbersBeforeFourTestParametrized {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][] {
                {new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}},
                {new int[]{2, 3, 1, 7}, new int[]{1, 2, 4, 4, 2, 3, 1, 7}},
                {new int[]{7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4, 7}},
                {new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}}
        });
    }

    private NumbersBeforeFour nf;
    private int[] actual;
    private int[] expected;

    public NumbersBeforeFourTestParametrized(int[] expected, int[] actual) {
        this.actual = actual;
        this.expected = expected;
    }

    @Before
    public void init(){
        nf = new NumbersBeforeFour();
    }

    @Test
    public void numberBeforeFour() {
        Assert.assertArrayEquals(expected, nf.numbers(actual));

    }
}
