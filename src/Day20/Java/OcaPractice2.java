package Day20.Java;

public class OcaPractice2 {
    public static void main(String[] args) {

        int[] stack = {10,20,30};
        int size = 3;
        int idx = 0;

        /* line n1 */
        do  {
            idx ++;
        } while (idx >=  size);

        System.out.println("The Top element: " + stack[idx]);
    }
}
