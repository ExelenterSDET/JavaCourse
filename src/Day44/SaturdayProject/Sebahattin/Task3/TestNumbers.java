package Day44.SaturdayProject.Sebahattin.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestNumbers {
    @Test
    public void testCheckEvenNumber(){
        Numbers numbers1 = new Numbers();

        Assert.assertEquals(true, numbers1.checkEvenNumber(10));
    }
    @Test
    public void testEvenNumbers(){
        Numbers numbers2 = new Numbers();

        ArrayList<Integer> list = new ArrayList<>(numbers2.evenNumbers());
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,20));

        Assert.assertEquals(numbers2.evenNumbers(), newArr);
    }
}
