package Day17.Java;

public class Example {

    public static void main(String[] args) {

        for (int i = 1; i <= 2 ; i++) { // outer loop => 1 and 2
            for (int j = 1; j <=5; j++) { // inner loop => 1, 2, 3, 4, 5
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }

    }
}
