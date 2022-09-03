package Day16.Java;

public class JavaBreakStatement {
    /*
    When a break statement is
    encountered inside a loop, the loop
    is immediately terminated and the
    program control resumes at the next
    statement following the loop.
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if(i==3){
                break;
            }
        }

    }
}
