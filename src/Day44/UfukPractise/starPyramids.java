package Day44.UfukPractise;

public class starPyramids {
    public static void main(String[] args) {

        //duz piramit
        int rows=5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");

        }

        //ters piramit
        for (int i = rows-1; i >=1; i--) {
            for (int j = 0; j <= rows-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
