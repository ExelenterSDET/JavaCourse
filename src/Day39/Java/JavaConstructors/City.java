package Day39.Java.JavaConstructors;

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
        Branch branch1 = new Branch(1000, 10012);
        Branch branch2 = new Branch(200, 75450);
        ArrayList<Branch> branches = new ArrayList<>(Arrays.asList(branch1, branch2));
        Bank city =  new Bank("City", "www.city.com", branches);
        System.out.println(city);



    }
}
