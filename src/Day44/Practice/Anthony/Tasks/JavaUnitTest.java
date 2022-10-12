package Day44.Practice.Anthony.Tasks;



import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaUnitTest {
    @Test
    public void testTotal () {
        //@alpha --> see in override

        int number1 = 10;
        int number2 = 20;
        int total = number1 + number2;
        Assert.assertEquals(total, 30, "Total does not match expected value");

    }
    @Test
    public void stringIsEmpty(){
        String str = "";
        Assert.assertTrue(str.isEmpty(), "String is not empty");

    }

    @Test
    public void arraysAreEqual(){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        Assert.assertEquals(arr1,arr2,"Arrays are not equal");

    }
    //class attribute is placed here "Global variable"
    @Test
    public void equalsNoOrder(){
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1,2,3,4)); //list is local to equalsNoOrder
        ArrayList<Integer> list2 = new ArrayList(Arrays.asList(1,2,3,4));
        Assert.assertEquals(list1,list2);
    }

}
