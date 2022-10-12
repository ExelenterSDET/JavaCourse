package Day44.SaturdayProject.Tohir.JavaUnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaUnitTest {
    @Test
    public void testTotal()
    {
        int num1 = 10;
        int num2 = 20;
        int total = num1 +num2;
        int product = num1*num2;
        Assert.assertEquals(total,30);
        Assert.assertEquals(product,299,"Product is not equal");

    }
    @Test
    public void stringIsEmpty()
    {
        String str = "";
        Assert.assertTrue(str.isEmpty());
        String str1 = "1";
        Assert.assertTrue(str1.isEmpty(),"String is not empty");
    }
    @Test
    public void arraysareequal()
    {
        int[] numarr1 = {1,2,3,4};
        int[] numarr2 = {1,2,3,4};
        Assert.assertEquals(numarr1,numarr2,"is not equal");
        int[] numarr3 = {1,2,3,4};
        int[] numarr4 = {1,2,7,4};
        Assert.assertEquals(numarr3,numarr4,"is not equal");
    }
    @Test
    public void equalsnoorder()
    {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,4,1));
        //Assert.assertEquals(list1,list2,"Lists are not equal");
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,4,1));
        Assert.assertEquals(list3,list2,"Lists are not equal");
    }
    ArrayList<Integer> list1;
    @Test
    public void assertisNull()
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        Assert.assertNull(list1);
        Assert.assertNull(list2,"Error");
    }
    @Test
    public void assertisnotNull()
    {
        ArrayList<Integer> list2 = new ArrayList<>();
        Assert.assertNotNull(list2,"Error");
        Assert.assertNotNull(list1);
    }

}
