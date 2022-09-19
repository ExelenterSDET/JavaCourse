package Day29.Practice.SaturdayProject6Andrea;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {

    //<<<<NEEDS WORK>>>>>

    /*Task 6
    Create a void method that has an Arraylists of Integer as a parameter

    Count how many each Integer object repeats. Print the result.

            Example:
            [1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1]

    output should be:
            1 = 3; 2 = 2; 3 = 2, 4 = 2, 5 = 2, 6 = 1;
     */

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 3, 1, 2, 4, 6, 2, 5, 1));
        countInts(intList);
    }

    static void countInts (ArrayList<Integer> list) {
        list.sort(null);
        int counter = 0;

        System.out.println("Sorted list: " + list);
        for (int i = 0; i < list.size(); i++) {
            counter = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            System.out.println(list.get(i) + " = " + counter);
        }
    }
//        list.sort(null);
//        System.out.println("list = " + list);
//        int counter = 0;
//        int index = 0;
//        while (list.size()>1){
//            if (list.get(index).equals(list.get(index+1))) {
//                counter++;
//                list.remove(index);
//                index++;
//            }
//            else {
//                index++;
//                break;
//                }
//        }
//        System.out.println("list(index) = " + list.get(index) + " = " + counter); }

//        for (int i = 0; i <list.size()-1; i++) {
//            int counter = 0;
//                 if (list.get(i).equals(list.get(j))) {
//                    //       System.out.println(list.get(i));
//                    counter++;
//
//                }
//                System.out.println("counter = " + counter);
//            }
//            System.out.println("outer counter = " + counter);
//        }

//            int counter = 0;
//            while (list.get(i).equals(list.get(i+1))){
//                System.out.println(list.get(i));
//                counter++;
//                i++;
//            }
           // System.out.println(list.get(i) + " = " + counter);
        }


