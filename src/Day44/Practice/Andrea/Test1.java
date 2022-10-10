package Day44.Practice.Andrea;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

   @Test
   public void testTotalTrue(){
      int num = 5;
      int correctAnswer = (num * (num + 1))/2;
      int otherAnswer = JavaMath.getTotal(num);
      Assert.assertEquals(correctAnswer, otherAnswer, "Total is not correct");

   }

   @Test
   public void testTotalFalse(){
      int num = 5;
      int correctAnswer = 0;
      int otherAnswer = JavaMath.getTotal(num);
      Assert.assertNotEquals(correctAnswer, otherAnswer, "Totals do match");
   }

   @Test
   public void testTotalTrue2() {
      int num = 5;
      int correctAnswer =  (num * (num + 1))/2;
      int otherAnswer = JavaMath.getTotal(num);
      Assert.assertTrue(correctAnswer == otherAnswer, "Total is not equal");
   }

   @Test
   public void testStringNotNull(){
      ArrayList<String> list = new ArrayList<>(Arrays.asList("dog", "cat", "cow"));
      String str = JavaMath.getString(list,"c");
      Assert.assertNotNull(str);

   }
}


