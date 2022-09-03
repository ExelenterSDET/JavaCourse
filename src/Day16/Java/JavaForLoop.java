package Day16.Java;

public class JavaForLoop {
/*
Initialization: It is the initial condition which
is executed once when the loop starts. Here, we
can initialize the variable, or we can use an
already initialized variable. It is an optional
condition.
Condition: It is the second condition which is
executed each time to test the condition of the
loop. It continues execution until the condition
is false. It must return boolean value either
true or false. It is an optional condition.
Increment/Decrement: It increments or decrements
the variable value. It is an optional condition
 */

    public static void main(String[] args) {
        int index = 0;
        while(index < 10 ){
            System.out.println(index);
            index++;
        }

        for(int i = 0; i<10; i++){
            System.out.println(i);
        }

        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }


        System.out.println("-----");
        for (int i = 0; i < 100 ; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("-----");

        for (int i = 0; i < 100 ; i++) {
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        for (int i = 0, j = 10; i <=10; i += 2, j -=3) {
            System.out.println("i " + i);
            System.out.println("j " + j);
        }

        for (int i = 1, j = 10; i <= 10 && j<=50 ; i++, j+=10) {
            System.out.println("i " + i);
            System.out.println("j " + j);
        }


    }

}
