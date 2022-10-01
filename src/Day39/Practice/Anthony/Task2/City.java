package Day39.Practice.Anthony.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class City {
    public static void main(String[] args) {
        Bank chase = new Bank();
        System.out.println(chase);

        Bank ABC = new Bank();
        System.out.println(ABC);

        System.out.println("====================================");

        Branch XYZ = new Branch(1234,"LA",92670);
        System.out.println("XYZ = " + XYZ);

        Branch UVW  = new Branch(1499, "BOSTON", 98737);
        System.out.println("UVW = " + UVW);

        ArrayList<Branch> branches = new ArrayList<>(Arrays.asList(XYZ,UVW));
        System.out.println("branches = " + branches);

    }
}
