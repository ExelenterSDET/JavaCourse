package Day44.SaturdayProject.Tohir.TohirTask3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Testtju {
    @Test
    public void testEvenNumbers()
    {
        boolean numb = Number.checkEvenNumber(4);
        Assert.assertTrue(numb);
        boolean numb0 = Number.checkEvenNumber(9);
        Assert.assertTrue(numb0);
    }
    @Test
    public void testlistofevennumbers()
    {
        ArrayList<Integer> list = Number.evenNumbers();
        ArrayList<Integer> list0 = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,5,8,10,12,14,16,18,20));
        Assert.assertEquals(list,list0);
        Assert.assertEquals(list,list1);
    }

    @Test
    public void testsumuptoeven()
    {
        int numb = 10;
        int sum = 30;
        int sumuptoeven = Number.sumuptointeger(numb);
        Assert.assertEquals(sum,sumuptoeven);
        int numb1 = 12;
        int sum1 = 40;
        int sumuptoeven1 = Number.sumuptointeger(numb1);
        Assert.assertEquals(sum1,sumuptoeven1);
    }



}
