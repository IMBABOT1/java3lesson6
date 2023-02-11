import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersBeforeFourTest {
    private NumbersBeforeFour nf;

    @Before
    public void init(){
        nf = new NumbersBeforeFour();
    }

    @Test
    public void numberBeforeFour() {
        Assert.assertArrayEquals(new int[]{1, 7}, nf.numbers(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }
    @Test
    public void numberBeforeFour1() {
        NumbersBeforeFour nf = new NumbersBeforeFour();
        Assert.assertArrayEquals(new int[]{2, 3, 1, 7}, nf.numbers(new int[]{1, 2, 4, 4, 2, 3, 1, 7}));
    }

    @Test
    public void numberBeforeFour2() {
        NumbersBeforeFour nf = new NumbersBeforeFour();
        Assert.assertArrayEquals(new int[]{7}, nf.numbers(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 4, 7}));
    }
    @Test
    public void numberBeforeFour3() {
        NumbersBeforeFour nf = new NumbersBeforeFour();
        Assert.assertArrayEquals(new int[]{1, 7}, nf.numbers(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }


    @Test(expected = RuntimeException.class)
    public void numberBeforeFourException() {
        nf.numbers(new int[]{1, 2, 2, 3, 1, 7});
    }
}

