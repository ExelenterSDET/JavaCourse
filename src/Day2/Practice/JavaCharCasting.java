package Day2.Practice;

public class JavaCharCasting {
    public static void main(String[] args) {
        byte bt1=119;
        short sh1=111;
        int in1=114;
        double db1=108;
        long lo1=100;

        char ch1=(char) bt1;
        char ch2=(char)sh1;
        char ch3=(char)in1;
        char ch4=(char) db1;
        char ch5=(char)lo1;

        System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4+" "+ch5);
        System.out.println("----------");

    }
}
