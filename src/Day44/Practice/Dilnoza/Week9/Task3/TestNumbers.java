package Day44.Practice.Dilnoza.Week9.Task3;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNumbers {
    public boolean checkEvenNumbers(int num){

        boolean isEven=false;
        if(num%2==0){
            isEven=true;
        }

        return isEven;
    }


    @Test
  public static void validateIfTrue(){
        Numbers nums = new Numbers();
        boolean b = nums.checkEvenNumbers(21);
        Assert.assertEquals(b,false,"Result is false,validation failed");

    }

    @Test
    public void validateEvenNumbers(){
        int number = 20;
        //evenNumbers(number);
        Assert.assertSame(20,number);
    }
}
