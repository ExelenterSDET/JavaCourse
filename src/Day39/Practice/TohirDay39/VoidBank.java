package Day39.Practice.TohirDay39;

import java.util.ArrayList;
import java.util.Arrays;

public class VoidBank {
    public static void main(String[] args) {
        Bank chase = new Bank();
        /*System.out.println(chase);
        Bank Sber = new Bank("Sberbank","sber.ru",false);
        System.out.println(Sber);*/
        BranchofBank Laleli = new BranchofBank(23,14);
        //System.out.println(Laleli);
        BranchofBank Laleli1 = new BranchofBank(234,12);
        //System.out.println(Laleli1);
        ArrayList<BranchofBank> laleli = new ArrayList<>(Arrays.asList(Laleli,Laleli1));
        Bank Tinkoff = new Bank("Tinkoff","tinkoff.ru",laleli);
        System.out.println(Tinkoff);
    }
}
