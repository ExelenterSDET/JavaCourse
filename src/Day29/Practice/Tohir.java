package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tohir {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(0,3);
        System.out.println("num = " + num);
        for (int i = 0; i < 10; i++) {
            num.add(i,i);
        }
        System.out.println("num = " + num);
        ArrayList<Integer> num_1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(num_1);
        ArrayList<String> str = new ArrayList<>(Arrays.asList("str"));
        System.out.println(str);
        ArrayList<String> str_1;
        str_1 = new ArrayList<String>();
        str_1.add(0,"My");
        String str_10;
        str_10 = str_1.get(0);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        
        int length = arr.length;
        System.out.println(length);

        ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int size = numlist.size();
        boolean cont = numlist.contains(5);
        ArrayList<Integer> numlist_2 = new ArrayList<>();
        numlist_2.addAll(numlist);
        ArrayList<Integer> numlist_3 = new ArrayList<>();
        for (int i = 0; i < numlist_2.size(); i++) {
            numlist_3.add(numlist_2.get(i));
        }
        System.out.println("numlist_3 = " + numlist_3);
        ArrayList<Integer> numlist_4 = new ArrayList<>();
        for(int n:numlist_3){
            numlist_4.add(n);
        }
        System.out.println("numlist_4 = " + numlist_4);
        System.out.println("numlist_4 = " + numlist_4.remove(1)+ " " + numlist_4);
        System.out.println("numlist_2.equals(numlist_3) = " + numlist_2.equals(numlist_3));
        System.out.println("numlist_4.set(1,2) = " + numlist_4.set(1,2));
        System.out.println("numlist_4 = " + numlist_4);
        numlist_4.clear();
        System.out.println("numlist_4 = " + numlist_4);
        for(int n:numlist)
        {
            numlist_4.add(n);
        }
        System.out.println("numlist_4 = " + numlist_4);
        numlist_4.add(0,0);
        System.out.println("numlist_4 = " + numlist_4.indexOf(5));
        numlist_4.add(0,11);
        System.out.println("numlist_4 = " + numlist_4.indexOf(5));
        System.out.println("numlist_4 = " + numlist_4.lastIndexOf(5));
        numlist_4.removeAll(numlist_2);
        System.out.println("numlist_4 = " + numlist_4);
        for(int n:numlist_3)
        {
            numlist_4.add(n);
        }
        System.out.println("numlist_4 = " + numlist_4);
        numlist_4.removeIf((numb) -> numb<5);
        System.out.println("numlist_4 = " + numlist_4);
        Tohir task= new Tohir();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("java", "is", "fun", "i", "love", "java"));
        System.out.println("Tohir.Task(strings) = " + Tohir.Task(strings));

    }
    static ArrayList<String> Task(ArrayList<String> Strlist)
    {
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < Strlist.size(); i++) {
            if(Strlist.get(i).length()<4)
            {
                str.add(Strlist.get(i));

            }
        }
        Strlist.removeAll(str);
        return Strlist;
    }
}
