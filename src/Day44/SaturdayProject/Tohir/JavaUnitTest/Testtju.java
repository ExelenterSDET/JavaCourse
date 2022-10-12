package Day44.SaturdayProject.Tohir.JavaUnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Testtju {
  @Test
  public void testTotal()
  {
    Assert.assertEquals(JavaMath.sumuptointeger(5),15);
  }
  @Test
  public void getstring()
  {
    String str = "s";
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Toefl","more","string","shoe"));
    ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Toefl","more","tstring","tshoe"));
    Assert.assertNotNull(JavaMath.firstletter(arrayList,str));
    Assert.assertNotNull(JavaMath.firstletter(arrayList1,str));
  }





}
