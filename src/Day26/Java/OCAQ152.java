package Day26.Java;

public class OCAQ152 {

    public static void main(String[] args) {

        int [][] dArr = {{1,3},{2,4}};

        for (int i = dArr.length - 1; i >= 0; i--) {
            for (int i1 : dArr[i]) {
                System.out.print(i1);
            }
        }

        System.out.println();
        for (int[] ints : dArr) {
            for (int i = ints.length - 1; i >= 0; i--) {
                System.out.print(ints[i]);
            }
        }

    }
}
