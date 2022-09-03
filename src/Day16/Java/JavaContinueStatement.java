package Day16.Java;

public class JavaContinueStatement {
    /*
    The continue statement is
    used in loop control
    structure when you need to
    jump to the next iteration
    of the loop immediately. It
    can be used with for loop
    or while loop.
     */

    public static void main(String[] args) {

        String str = "Java is fun";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                continue;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
