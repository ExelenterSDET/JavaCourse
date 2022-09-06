package Day20.Practice.DilnozaTasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
          /*
Task2:
    Given a string as "Peach Berry Orange WaterMelon Orange"
            1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
            2. Write below logic:
            2.a If this string array contains "Orange" change all "Orange" to "Apple"
            3. Print the Array
    Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
     */


            String[] fruitList = "Peach Berry Orange WaterMelon Orange".split(" ");
            for (int i = 0; i < fruitList.length; i++) {
                if(fruitList[i].equals("Orange")){
                    fruitList[i]= "Apple";
                }

            }

            System.out.println("Arrays.toString(fruitList) = " + Arrays.toString(fruitList));
        }
    }


