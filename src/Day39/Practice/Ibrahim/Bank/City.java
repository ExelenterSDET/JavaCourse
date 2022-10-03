package Day39.Practice.Ibrahim.Bank;

import java.util.ArrayList;

public class City {
    public static void main(String[] args) {
        Branch branch1 = new Branch( "0001", "L3Y 2W6");
//        Branch branch2 = new Branch( "0002", "M9R 3K8");

        ArrayList<Branch> listOfBranches = new ArrayList<>();
        listOfBranches.add(branch1);
//        listOfBranches.add(branch2);

        Bank bank = new Bank("RBC", "www.rbc.com", listOfBranches);
        System.out.println("Bank = " + bank);;
    }
}
