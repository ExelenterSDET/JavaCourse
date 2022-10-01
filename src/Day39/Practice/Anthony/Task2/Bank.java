package Day39.Practice.Anthony.Task2;

import java.util.ArrayList;

public class Bank {

    String name;
    String web;
    boolean trustable;

    ArrayList <Branch> branches;

    //Constructors


    public Bank(){
        this.name = "Chase";
        this.web = "www.chase.com";
        this.trustable = true;
    }
    public Bank(String name, String web, boolean isTrustable){
        this.name = name;
        this.web = web;
        this.trustable = isTrustable;
    }

    public Bank(String name) {
        this.name = name;
    }

    public Bank(String name, String web) {
        this.name = name;
        this.web = web;
    }

    public Bank(boolean trustable) {
        this.trustable = trustable;
    }

    public Bank(String name, String web, boolean trustable, ArrayList<Branch> branches) {
        this(name, web, trustable);
        this.branches = branches;
    }

//    public void print (){
//        System.out.println("Branch list");
//        for(Branch branches : this.branches);
//        System.out.println(branches);
//    }

//    public String toString() {
//        return "Bank{" +
//                "name='" + name + '\'' +
//               ", web='" + web + '\'' +
//                ", trustable=" + trustable +
//             '}';
//
//
//
//    }


    @Override
    public String toString() {
        return "Bank{" +
              "name='" + name + '\'' +
              ", web='" + web + '\'' +
               ", trustable=" + trustable +
               ", branches=" + branches +
               '}';
    }
}
