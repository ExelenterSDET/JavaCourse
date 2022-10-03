package Day39.Practice.Ibrahim.Bank;

import java.util.ArrayList;

public class Bank {
    String name;
    String web;
    boolean isTrustable;
    ArrayList<Branch> listOfBranches;

    // Constructors
    public Bank(){
        this.isTrustable = true;
    }
    public Bank(String name, String web, boolean isTrustable){
        this(name, web);
        this.isTrustable = isTrustable;
    }
    public Bank(String name, String web) {
        this();
        this.name = name;
        this.web = web;
    }
    public String toString() {
//        printBranches();
        return "Bank{" +
                "name='" + name + '\'' +
                ", web='" + web + '\'' +
                ", isTrustable=" + isTrustable +
                ", branches=" + listOfBranches +
                '}';
    }
    public Bank(String name, String web, ArrayList<Branch> listOfBranches) {
        this(name, web);
        this.listOfBranches = listOfBranches;
    }

//    public void printBranches(){
//        System.out.println("Branches : ");
//        for(Branch branch : this.listOfBranches){
//            System.out.println(branch);
//        }
//    }
}
