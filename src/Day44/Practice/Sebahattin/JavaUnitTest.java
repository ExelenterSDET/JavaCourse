package Day44.Practice.Sebahattin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaUnitTest {

    @Test
    public void testTotal(){
        int number1 = 10;
        int number2 = 20;
        int total = number1 + number2;

        Assert.assertEquals(total, 30,"Total does not match expected value");
    }
    @Test
    public void stringIsEmpty(){
        String str ="";
        Assert.assertTrue(str.isEmpty(),"String is not empty");
    }
    @Test
    public void stringIsNotEmpty(){
        String str ="1";
        Assert.assertFalse(str.isEmpty(),"String is empty");
    }
    @Test
    public void arraysAreaEqual(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        Assert.assertEquals(arr1,arr2, "arrays are not equal");
    }

    @Test
    public void equalIsNoOrder(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        Assert.assertEquals(list1,list2);
    }

        ArrayList<Integer> list1;
    @Test
    public void assertIsNull(){

        Assert.assertNull(list1);
    }

    @Test
    public void assertIsNotNull(){
        ArrayList<Integer> list2 = new ArrayList<>();
        Assert.assertNotNull(list2);
    }
}
