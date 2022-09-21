package Day30.Practice.Tohir;

import java.util.ArrayList;
import java.util.Arrays;

public class Listoflists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listoflist= new ArrayList<>();
        ArrayList<String> list0 = new ArrayList<>(Arrays.asList("HomeMS","CounSJStry","foDFot"));
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("ChiSFna","baloon","India","BrDasil","baloon"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("mmTicket","FBoot","rreak"));
        list1.remove("baloon");
        list1.add("my");
        list1.add(5,"muy");
        System.out.println(list1);
        listoflist.add(list0);
        listoflist.add(list1);
        listoflist.add(list2);
        for (int i = 0; i < listoflist.size(); i++) {
            for (int i1 = 0; i1 < listoflist.get(i).size(); i1++) {
                System.out.println(" = " + listoflist.get(i).get(i1));
            }
        }
        for(ArrayList<String> list:listoflist){
            list.forEach(str -> System.out.println(str+" "));
            System.out.println(" = ");
        }
        Listoflists asg = new Listoflists();
        System.out.println(asg.listoflist(listoflist));
        System.out.println(asg.Camekcase(listoflist));

    }

    static ArrayList<ArrayList<String>> listoflist(ArrayList<ArrayList<String>> strlist)
    {
        ArrayList<ArrayList<String>> listoflist0 = new ArrayList<>();
        ArrayList<String> listoflist1 = new ArrayList<>();
        for (int i = 0; i < strlist.size(); i++) {
            for (int i1 = 0; i1 < strlist.get(i).size(); i1++) {
                listoflist1.add(strlist.get(i).get(i1).toUpperCase());
            }
            listoflist0.add(listoflist1);
        }
        return listoflist0;
    }

    static ArrayList<ArrayList<String>> Camekcase(ArrayList<ArrayList<String>> strlist)
    {
        ArrayList<ArrayList<String>> listoflist0 = new ArrayList<>();
        ArrayList<String> listoflist1 = new ArrayList<>();
        for (int i = 0; i < strlist.size(); i++) {
            for (int i1 = 0; i1 < strlist.get(i).size(); i1++) {
                listoflist1.add(strlist.get(i).get(i1).substring(0,1).toUpperCase()+strlist.get(i).get(i1).substring(1).toLowerCase());
            }
            listoflist0.add(listoflist1);
        }
        return listoflist0;
    }
}
