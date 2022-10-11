package Day44.UfukSaturdayProject.Task3;

import Day44.UfukSaturdayProject.Task3.Numbers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNumbers {

    @Test
    public void checkevenNumberCheck(){
        int num=6;
        boolean act = Numbers.checkEvenNumber(num);
        Assert.assertTrue(act);
}
    @Test
    public void evenNumbersCheck(){
    List exp = new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,20));
    List act = Numbers.evenNumbers();
    Assert.assertEquals(act,exp);
    }

}
