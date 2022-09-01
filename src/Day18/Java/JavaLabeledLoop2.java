package Day18.Java;

public class JavaLabeledLoop2 {
    public static void main(String[] args) {

        iLoop:
        for (int i = 0; i < 3; i++) {
            jLoop:
            for (int j = 0; j < 3; j++) {
                kLoop:
                for (int k = 0; k < 3; k++) {
                    if(k==2){
                        break jLoop;
                    }
                    System.out.print(" i = " + i);
                    System.out.print(", j = " + j);
                    System.out.print(", k = " + k);
                }
            }
            System.out.println();
        }

    }
}
