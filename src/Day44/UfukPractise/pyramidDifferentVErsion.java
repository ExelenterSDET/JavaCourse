package Test1;

public class pyramidDifferentVErsion {
    public static void main(String[] args) {
    pyramid(5);
    }

    public static void pyramid(int n){
        int k=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k-=1;
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
