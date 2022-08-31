package Day17.Java;

public class Task5 {

    // Write program using nested loops that prints:
    // *
    // **
    // ***
    // ****
    // *****
    public static void main(String[] args) {

        for (int row = 1; row <=5 ; row++) {
            for (int column = 1; column <=5; column++) {
                if(column <= row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
