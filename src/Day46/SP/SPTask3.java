package Day46.SP;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Task 3
-   create class Numbers
    -- create method named as "checkEvenNumber",which returns true if provided integer is even
    -- create a method "evenNumbers" which will return all even number between 0 and 20

-   create class TestNumbers
    -- create method to check "checkEvenNumber" method
    -- create a method to check if "evenNumbers" method works as expected
    -- add another three methods, to validate any other possible scenarios*/
public class SPTask3 {
    @Test
    public void checkEvenNumber(){
        int x = 10;
        Assert.assertTrue(Number.checkEvenNumber(x));
    }
    @Test
    public void evenNumber(){
        int x = 20;
        int length = Number.evenNumber(x).size();
        Assert.assertEquals(length,Number.evenNumber(x).size());
    }
    @Test
    public void evenNumbersCheck2(){
        List exp = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
        int x = 19;
        List act = Number.evenNumber(20);
        Assert.assertEquals(act,exp);
    }
    //assert if the evenNumber is Notnull
    @Test
    public void evenNumber3(){
        int x = 19;
        Assert.assertNotNull(Number.evenNumber(x));
    }

}
class Number{
    static Boolean checkEvenNumber(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    static ArrayList<Integer> evenNumber(int x){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= x ; i++) {
            if(i % 2 == 0){
                list.add(i);
            }
        }
        return list;
    }

}
