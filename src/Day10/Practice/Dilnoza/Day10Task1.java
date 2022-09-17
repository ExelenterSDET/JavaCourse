package Day10.Practice.Dilnoza;

import java.util.Random;

public class Day10Task1 {
    public static void main(String[] args) {
        Day10Task1 t1= new Day10Task1();
        Random random= new Random();
        boolean b = t1.returnOddOrEven(random.nextInt());
        System.out.println("b = " + b);

    }
    boolean returnOddOrEven(int num){
        boolean isOdd= true;
        Random random= new Random();
        int number=random.nextInt(53);
        System.out.println("number = " + number);

        if(number%2!=0){
            isOdd=false;
        }return isOdd;
    }


}
