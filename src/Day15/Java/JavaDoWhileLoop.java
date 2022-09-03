package Day15.Java;

public class JavaDoWhileLoop {

    /*
    If the number of iteration is not
    fixed and you must have to execute
    the loop at least once, it is
    recommended to use do-while loop.
     */

    public static void main(String[] args) {
    int num = 0;
        do{
            System.out.print("HELLO ");
            System.out.print("WORLD");
            System.out.print("!!!!!!! ");
            num ++;
            System.out.println("num = " + num);
        }
       while(num < 10);

    }
}
