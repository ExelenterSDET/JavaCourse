package OCA.Q77;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Q77 {

    public void read(int num) throws Exception{
        System.out.println("Read");
    }

    public void check(int num) throws RuntimeException {
        System.out.println("Check");
    }

    public static void main(String[] args) throws Exception{
        Q77 q = new Q77();
        q.read(123);
        q.check(123);

    }
}
