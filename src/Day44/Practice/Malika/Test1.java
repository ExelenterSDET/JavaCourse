package Day44.Practice.Malika;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

    @Test
    public void testTotalEquals(){
        int num = 5;
        int expected = (num*(num+1))/2;
        int actual = JavaMath.getTotal(num);
        Assert.assertEquals(actual,expected, "Totals do not match");
    }

    @Test
    public void testTotalNotEquals(){
        int num = 5;
        int expected = 0;
        int actual = JavaMath.getTotal(num);
        Assert.assertNotEquals(actual, expected, "Totals do match");
    }

    @Test
    public void testTotalTrue(){
        int num = 5;
        int expected = (num*(num+1))/2;;
        int actual = JavaMath.getTotal(num);
        Assert.assertTrue(expected==actual, "Total is not equal");
    }

    @Test
    public void testGetStringNotNull(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Alihan", "Imran", "Mavlyuda", "Malika"));
        String str = JavaMath.returnFirstString(list, "A");
        Assert.assertNotNull(str);

    }
}
