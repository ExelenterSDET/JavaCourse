package Day4.Java;

public class JavaAssignmentOperators {

    public static void main(String[] args) {

        int num = 10;
        System.out.println("num = " + num);
        num = num + 5;
        System.out.println("num = " + num);
        num = num - 7;
        System.out.println("num = " + num);
        num = num * 2;
        System.out.println("num = " + num);
        num = num / 4;
        System.out.println("num = " + num);
        num = num % 3;
        System.out.println("num = " + num);

        int num2 = 10;
        System.out.println("num2 = " + num2);
        num2 += 5; // same as ==> num2 = num2 + 5;
        System.out.println("num2 = " + num2);
        num2 -= 7; // same as ==> num2 = num2 - 7;
        System.out.println("num2 = " + num2);
        num2 *= 2; // same as ==> num2 =  num2 * 2;
        System.out.println("num2 = " + num2);
        num2 /= 4; // same as ==> num2 = num2 / 4;
        System.out.println("num2 = " + num2);
        num2 %= 3; // same as ==> num2 = num2 % 3;

        double db = 27.7;
        System.out.println("db = " + db);
        db %= 3; // same as db = db % 3;
        System.out.println("db = " + db);
        db = 10; // by hardcoding we changed the value of db to 10;
        db *= 100; // same as db = db * 100;
        System.out.println("db = " + db);

        // Task

        /*
        1. create any type variable and assign value as 50
        2. add 70
        3. div 4
        4. remainder 7
        5. multiple 10
        6. sub 49
        */

        float fl = 50.0f;
        fl += 70;
        fl /= 4;
        fl %= 7;
        fl *= 10;
        fl -= 49;
        System.out.println("fl = " + fl);





    }
}
