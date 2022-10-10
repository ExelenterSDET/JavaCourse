package Day44.Practice.Ibrahim.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_Total {

    @Test
    public void testTotalTrue(){
        int num = 5;
        int expected = (num * (num + 1))/2;
        int actual = JavaMath.getTotal(num);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTotalFalse(){
        int num = 5;
        int expected = 0;
        int actual = JavaMath.getTotal(num);

        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void testTotal(){
        int num = 5;
        int expected = (num * (num + 1))/2;
        int actual = JavaMath.getTotal(num);

        Assert.assertTrue(actual == expected);

    }

    @Test
    public void getStringNotnull(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ibrahim", "zubeyir", "emrah"));
        String str = JavaMath.getFirstString(list,"I");

        Assert.assertNotNull(str);
    }

}
