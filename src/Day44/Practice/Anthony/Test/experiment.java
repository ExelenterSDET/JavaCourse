package Day44.Practice.Anthony.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class experiment {
    @Test
    public void testTotal() {//parameter is always empty
        int num = 5;
        int expected = (num * (num + 1)) / 2;
        int actual = JavaMath.getTotal(num);
        Assert.assertEquals(actual, expected, " Totals do not match");

    }

    @Test
    public void testTotalFalse() {
        int num = 4;
        int expected = 0;
        int actual = JavaMath.getTotal(num);
        Assert.assertNotEquals(actual, expected, "Totals should not match");

    }

    @Test
    public void testTotalNotEquals() {
        int num = 5;
        int expected = 0;
        int actual = JavaMath.getTotal(num);
        Assert.assertNotEquals(actual, expected, "Totals should not match");

    }

    @Test
    public void testTotalTrue() {
        int num = 5;
        int expected = (num * (num + 1)) / 2;
        int actual = JavaMath.getTotal(num);
        boolean isTrue = expected == actual;
        Assert.assertTrue(isTrue,"Totals is not equal");

    }
    @Test
    public void testGetStringNotNull(){
        ArrayList<String> list = new ArrayList(Arrays.asList("Bakhridin","Arthur", "Anthony", "Seb"));
        String str = JavaMath.getString(list, "B");
        Assert.assertNotNull(str);
    }

}
