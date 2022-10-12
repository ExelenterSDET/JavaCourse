package Day44.SaturdayProject.Andrea.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Day44.SaturdayProject.Andrea.Task3.Numbers.checkEvenNumber;
import static Day44.SaturdayProject.Andrea.Task3.Numbers.evenNumbers;

public class TestNumbers {

//    -   create class TestNumbers
//    -- create method to check "checkEvenNumber" method
//    -- create a method to check if "evenNumbers" method works as expected
//    -- add another three methods, to validate any other possible scenarios

    @Test
    public void testCheckEvenNumber(){
        boolean testNum = checkEvenNumber(2);
        boolean expected = true;
        Assert.assertEquals(testNum, expected, "Total is not correct");
    }

    @Test
    public void testEvenNumbers() {
        ArrayList<Integer> list = new ArrayList<>(evenNumbers());
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12,14,16,18,20));
        Assert.assertEquals(list, expected);
    }
}
