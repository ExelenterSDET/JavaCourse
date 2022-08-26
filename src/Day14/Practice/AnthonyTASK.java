package Day14.Practice;

import java.util.Random;

public class AnthonyTASK {

    public static void main(String[] args) {


        Random random = new Random();
        int i = random.nextInt(5 - 2 + 1) + 2;
        //System.out.println("i = " + i);

        int i2 = random.nextInt(5 - 2 + 1) + 2;
        //System.out.println("i2 = " + i2);

        int i3 = (random.nextInt() * (5 - 2 + 1)) + 2;
        //System.out.println("i3 = " + i3);

        if (i >= 2 && i2 >= 2 && i3 >= 2) {
            System.out.println("You won $20");
        } else if (i >= 3 && i2 >= 3 && i3 >= 3) {
            System.out.println("You won $30");
        } else if (i >= 4 && i2 >= 4 && i3 >= 4) {
            System.out.println("You won $40");
        } else if (i >= 5 && i2 >= 5 && i3 >= 5) {
            System.out.println("You won Jack Pot");
        } else {
            System.out.println("INVALID NUMBER");
        }

        Random random2 = new Random();

        int max = 5;
        int min = 2;
        int rnd = random.nextInt(max - min + 1) + min;
        System.out.println("Random = " + rnd);

        String output = "Jackpot !!!";
        switch (rnd) {
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
