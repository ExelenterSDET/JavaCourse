package Day39.Practice.Sebahattin.Practice.BankAndBranch;

import java.util.ArrayList;

public class Bank {
    String name;
    String web;
    boolean isTrustable;

    ArrayList<Branch> branches;

    // Constructors
    public Bank(){
        this.isTrustable = true;
        this.branches = new ArrayList<>();
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

    public Bank(String name, String web, ArrayList<Branch> branches) {
        this(name,web);
        this.branches = branches;
    }


    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", web='" + web + '\'' +
                ", isTrustable=" + isTrustable +
                ", branches=" + branches +
                '}';
    }
}
