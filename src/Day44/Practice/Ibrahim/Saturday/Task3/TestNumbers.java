package Day44.Practice.Ibrahim.Saturday.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestNumbers {

    @Test
    public void checkCheckEvenNumber(){

        Assert.assertTrue(Numbers.checkEvenNumber(20));
    }

    @Test
    public void checkEvenNumbers(){
        ArrayList<Integer> actual = Numbers.evenNumbers();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,20));
        Assert.assertEquals(actual, expected);
    }
}
