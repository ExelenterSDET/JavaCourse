package Day32.Practice;

import java.util.*;

public class Anthony {

    public static void main(String[] args) {
        System.out.println("================ COLLECTION FOR EACH LOOP =======================");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,0,9,7,6));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(5,2,1,0,9,7,6));

        list.forEach((number) -> {number = number +100; System.out.print(number + " ");} );

        System.out.print("");
        System.out.println("\n"+"=======================================");

        set.forEach((a) -> {
            if(a>5){
                a += 120;
            }
            else{
                a+=500;
            }
            System.out.print(a + " , ");
        });

        System.out.println("\n"+"=============== COLLECTION WITH ARRAYLIST ========================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 1, 0, 9, 7, 6, 4, 3, -2));

        Collections.sort(list2);
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        int min = Collections.min(list2);
        int max = Collections.max(list2);
        System.out.print(min + " " + max);


        System.out.println("\n"+"======================== LINKED HASHSET  ========================");

        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));
        LinkedHashSet<Integer> ls = new LinkedHashSet<>(Arrays.asList(5,2,1,0,9,7,6,5,4,3,-2));

        System.out.println(hs);
        System.out.println(ls);

        for(Integer l : ls) {
            if(l<5){
                System.out.print(l + " , ");
            }
        }

        System.out.println("\n"+"================================================");

        ls.forEach(num -> {if(num<5){
            System.out.print(num + " , ");
        }});

        System.out.println("\n"+"============================= TREE SET  ========================");
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(5,2,4,5,6));

        TreeSet<Integer> ts = new TreeSet(set3);
        ts.add(-10);
        set3.add(-10);
        ts.add(100);
        set3.add(100);

        System.out.println(set3);
        System.out.println(ts);

    }
}
