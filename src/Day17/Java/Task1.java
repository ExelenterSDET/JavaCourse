package Day17.Java;

public class Task1 {

    /*
    create multiplication table from 1 to 10
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }

    }
}
