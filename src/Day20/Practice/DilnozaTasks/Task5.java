package Day20.Practice.DilnozaTasks;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random random= new Random();
        char chArray[]=new char[random.nextInt(2,22)];
        for (int i = 0; i < chArray.length ; i++) {
            chArray[i]=(char) random.nextInt(65,90);
        }
        System.out.println("chArray = " + Arrays.toString(chArray));




    }

}
