package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
                /*Task3.
Using Random class, create a random number up to 100.
return count of numbers divisible by 8
*/

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(100);
        System.out.println("randomNumber = " + randomNumber);

        int counter = 0;
        int number = 8;

        while (number <= randomNumber){
            counter += number%8 == 0 ? 1 : 0;
            number++;
        }
        System.out.println("counter = " + counter);
    }
}
