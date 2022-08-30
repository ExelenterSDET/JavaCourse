package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
                /*Task4.
Create random number between 1000 and 2000.
Using loop, count total of each number.
Example: randomNumber = 6457; result = 6+4+5+7
*/

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(1000,2000);
        System.out.println("randomNumber = " + randomNumber);
        int total = 0;

        while (randomNumber > 0){
            total += randomNumber%10; // total = total + randomNumber%10 6/10 = 0.6
            randomNumber /=10;
        }
        System.out.println("total = " + total);
    }
}
