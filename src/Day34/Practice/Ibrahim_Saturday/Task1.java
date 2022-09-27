package Day34.Practice.Ibrahim_Saturday;

import java.util.*;

/*
    Task 1

        1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

        2. Create a method which will return a HashMap.
           Parameter will be int[].

           Return how many times each int of array repeats.

           Example:
           [10,11,12,13,10,11,12,13]

           Result:
           10 = 2; 11=2, 12=2, 13=2
 */
public class Task1 {


    //1. Create a method which will return int[]. Parameter is int (n). The length of array is n.
    //Using Random class, assign to each index of array a random number between 10 and 20.
    static int[] createArray(int n){
        Random random = new Random();
        int[] iArr = new int[n];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = random.nextInt(10, 21);
        }
        System.out.println("Array : " + Arrays.toString(iArr));
        return iArr;
    }


    //2. Create a method which will return a HashMap. Parameter will be int[].
    //Return how many times each int of array repeats.
    //Example:
    //[10,11,12,13,10,11,12,13]
    //Result:
    //10 = 2; 11=2, 12=2, 13=2

    static TreeMap<Integer, Integer> howManyRepeated(int[] a){

        TreeMap<Integer, Integer> hmap = new TreeMap<>();
        TreeSet<Integer> key = new TreeSet<>();


        // Finding keys
        for (int i : a) {
            key.add(i);
        }
        System.out.println("Keys : " + key);

        // Count how many times a key repeated

        for (Integer integer : key) {
            int counter = 0;
            for (int i : a) {
                counter += integer == i ? 1 : 0;
            }
            hmap.put(integer, counter);
        }
        return hmap;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Please enter a number : ");
        int n = scan.nextInt();

        System.out.println("TreeMap : " + howManyRepeated(createArray(n)));
    }
}
