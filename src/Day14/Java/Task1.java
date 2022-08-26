package Day14.Java;

import java.util.Random;

public class Task1 {

    // Task
    // create a random int number between 2 and 5 included
    // if you hit 2 ==> return you won 20 $
    // if you hit 3 ==> return you won 30 $
    // if you hit 4 ==> return you won 40 $
    // if you hit 5 ==> return Jack Pot

    public static void main(String[] args) {
        Random random  = new Random();
        int max = 5;
        int min = 2;
        int rnd = random.nextInt(max-min+1)+min;
        System.out.println("rnd = " + rnd);

        String output = "Jackpot!!!";
        switch(rnd){
            case 2:
                output = "You won $20";
                break;
            case 3:
                output = "You won $30";
                break;
            case 4:
                output = "You won $40";
                break;
        }

        System.out.println("output = " + output);
    }
}
