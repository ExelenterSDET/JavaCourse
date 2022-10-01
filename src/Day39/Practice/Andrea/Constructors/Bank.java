package Day39.Practice.Andrea.Constructors;

import java.util.ArrayList;

public class Bank {
    String name;
    String web;
    boolean isTrustable;

    ArrayList<Branch> branches;


    public Bank(String name, String web, boolean isTrustable, ArrayList<Branch> branches) {
        this(name, web);
        this.branches = new ArrayList<>();
    }

    public Bank(){
        this.isTrustable = true;
    }
    public Bank(String name, String web, boolean isTrustable){
        //this is a constructor
        this(name, web);
    }

    public Bank(String name, String web) {
        this();
        this.name = name;
        this.web = web;
    }

    public Bank(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", web='" + web + '\'' +
                ", isTrustable=" + isTrustable +
                ", branches=" + branches +
                '}';
    }
}
