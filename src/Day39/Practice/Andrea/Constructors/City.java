package Day39.Practice.Andrea.Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class City {
    public static void main(String[] args) {

        Bank ABC = new Bank("ABC", "abc.com", false);
        System.out.println(ABC);

        Branch branch1 = new Branch(1000, 49932);
        Branch branch2 = new Branch(311, 80015);
        ArrayList<Branch> branches = new ArrayList<>(Arrays.asList(branch1, branch2));
        Bank city = new Bank("city", "www.city.com", true);
        System.out.println(branches);

    }
}
