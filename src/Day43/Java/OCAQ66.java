package Day43.Java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OCAQ66 {
    static int count = 0; // 1 2 3 4 5 // 6 7 8 9 10
    int i = 0; // 1 2 3 4 5 // 1 2 3 4 5
    public void changeCount () {
        while (i<5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        OCAQ66 check1 = new OCAQ66();
        OCAQ66 check2 = new OCAQ66();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.i + " :" + check2.i);
        System.out.println(check1.count + " :" + check2.count);
    }
    @Test
    public void testCount(){
        OCAQ66 check1 = new OCAQ66();
        OCAQ66 check2 = new OCAQ66();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.i + " :" + check2.i);
        System.out.println(check1.count + " :" + check2.count);

        Assert.assertEquals(check1.count, 10, "check1.count failed validation");
        Assert.assertEquals(check2.count, 10, "check2.count failed validation");
        Assert.assertEquals(check1.i,5, "check1.i failed validation");
        Assert.assertEquals(check2.i,5, "check2.i failed validation");
    }
}
