package Day39.Practice.TohirDay39;

import Day38.Practice.Day39.BranchofBank;

import java.util.ArrayList;

public class Bank {

    String Name;
    String Web;
    boolean Trustable;

    ArrayList<Day38.Practice.Day39.BranchofBank> Branchs;

    public Bank()
    {
        this.Trustable = true;
        this.Branchs = new ArrayList<>();
    }
    public Bank(String name, String web) {
        this();
        Name = name;
        Web = web;
    }
/*    public Bank(String name, String web, boolean trustable)
    {
        this.Name = name;
        this.Web = web;
        this.Trustable = trustable;
    }*/

    public Bank(String name, String web, boolean trustable, ArrayList<Day38.Practice.Day39.BranchofBank> branchs) {
        this.Name = name;
        this.Web = web;
        this.Trustable = trustable;
        this.Branchs = branchs;
    }
    public Bank(String name, String web, ArrayList<Day38.Practice.Day39.BranchofBank> branchs) {
        this(name,web);
        this.Branchs = branchs;
    }

    public void print()
    {
        for (BranchofBank branchofBank : this.Branchs) {
            System.out.println(branchofBank);
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "Name='" + Name + '\'' +
                ", Web='" + Web + '\'' +
                ", Trustable=" + Trustable +
                ", Branchs=" + Branchs +
                '}';
    }
}
