package Day20.Practice.Mustafa;

import java.util.Arrays;

public class Stask2 {
    public static void main(String[] args) {
/*Given a string as "Peach Berry Orange WaterMelon Orange"
        1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
        2. Write below logic:
        2.a If this string array contains "Orange" change all "Orange" to "Apple"
        3. Print the Array
        Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]*/

        String[] fruits = "Peach Berry Orange WaterMelon Orange".split(" ");
        System.out.println(Arrays.toString(fruits));

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("Orange")){
                fruits[i]= "Apple";

            }

        }
        System.out.println("changed Array =" +Arrays.toString(fruits));
    }
}
