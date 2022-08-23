package Day11.Practice;

public class ArthurDay11 {

    public static void main(String[] args) {

        int l = 14;

        if((l%5 == 0) && (l%3 == 0)){
            System.out.println("is divisble by 5 and 3");
        } else if((l%5 == 0) && (l%3 != 0)) {
            System.out.println("is divisible by 5");
        }
        else if((l%5 != 0) && (l%3 == 0)){
            System.out.println("is divisible by 3");
        }
        else {
            System.out.println("nout divisble by 5 or 3");
        }


    }

}
