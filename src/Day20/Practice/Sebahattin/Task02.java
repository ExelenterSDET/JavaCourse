package Day20.Practice.Sebahattin;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
/*        Task2:
        Given a string as "Peach Berry Orange WaterMelon Orange"
        1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
        2. Write below logic:
        2.a If this string array contains "Orange" change all "Orange" to "Apple"
        3. Print the Array
        Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
*/
        String str = "Peach Berry Orange WaterMelon Orange";
        String split[] = str.split(" ");
        System.out.println(Arrays.toString(split));

        for (int i = 0 ; i < split.length ; i++){
            if (split[i].contains("Orange")) {
                split[i] = "Apple";
            }
        }
        System.out.println(Arrays.toString(split));
    }
}
