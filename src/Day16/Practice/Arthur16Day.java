package Day16.Practice;

public class Arthur16Day {
    public static void main(String[] args) {
        int ctr =0;
        for (int i = 0; i <= 100; i++) {
         if (i%8==0){
             ++ctr;
         }
        }
        System.out.println("ctr = " + ctr);
    }

}


