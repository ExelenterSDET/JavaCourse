package Day22.Java;

public class JavaMethods3 {

    public static void main(String[] args) {

        /*
        Create a method, which will have two int parameters.
        and print total of two int`s.
         */

        JavaMethods3 jm = new JavaMethods3();
        int x = 10;
        int y = 50;
        jm.getTotal(x,y);

    }

    void getTotal(int a, int b){
        int total = a+b;
        System.out.println(total);
    }
}
