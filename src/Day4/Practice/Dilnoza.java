package Day4.Practice;

public class Dilnoza {

    public static void main(String[] args) {
        System.out.println(1);
        int  number = 50;
        number+=70;
        System.out.println("number = " + number);
        number /=4;
        System.out.println("number = " + number);
        number %= 7;
        System.out.println("number = " + number);
        number *=10;
        System.out.println("number = " + number);
        number -=49;
        System.out.println("number = " + number);

        System.out.println("Byte data type_________________");

        byte bt1= 10;
        System.out.println("bt1 = " + bt1);
        bt1 += 10;
        System.out.println("plus 10 = " + bt1);
        bt1 /= 6;
        System.out.println("sev by 6 = " + bt1);
        bt1 %= 2;
        System.out.println("remainder 2 = " + bt1);
        bt1 *=20;
        System.out.println("multiply by 20 =" + bt1);
        bt1 -=25;
        System.out.println("subtract 25 = " + bt1);

        System.out.println("Double data type__________________");

        double db1 = 100.0;
        db1 += 20;
        System.out.println("plus 20 = " + db1);
        db1 -= 15;
        System.out.println("subtract 15  = " + db1);
        db1 *=25;
        System.out.println("multiply by 25 =" + db1);
        db1 %=2;
        System.out.println("remainder 2 = " + db1);
        db1 /=10;
        System.out.println("div by 10 = " + db1);

        System.out.println("float data type___________________");

        float fl = 25.10f;
        fl +=15.50;
        fl -=10.10;
        fl /=1.2;
        fl *=10.0;
        fl %=4;
        System.out.println("Result = " + fl);
    }
}
