package Day39.Practice.Sebahattin.Practice.BankAndBranch;

import java.util.ArrayList;
import java.util.Arrays;

public class City {
    public static void main(String[] args) {
        Bank chase = new Bank();
        System.out.println(chase);

        Bank ABC = new Bank("ABC", "www.abc.com", false);
        System.out.println(ABC);

        Bank BoFa = new Bank("Bank of America", "www.bofa.com");
        System.out.println(BoFa);

        System.out.println("====================================");
        Branch branch1 = new Branch(2000, 20023);
        Branch branch2 = new Branch(155, 15523);
        ArrayList<Branch> branches = new ArrayList<>(Arrays.asList(branch1, branch2));
        Bank city =  new Bank("HSBS", "www.hsbs.com", branches);

        System.out.println(city);
    }
}
