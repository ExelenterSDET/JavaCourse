package day17.Practice;

public class arthurd17 {
    public static void main(String[] args) {
        String num1 = "368";
        String num2 = "1020304050";
        int pars1 = 0;
        int pars2 = 0;
        int rem = 0;
        for (int i = 0; i <= num1.length()-1; i++) {
            pars1 =  Integer.parseInt(num1.substring(i,i+1));

            for (int j = 0; j <= num2.length()-1; j=j+2) {
                pars2 =  Integer.parseInt(num2.substring(j,j+2));
                rem = pars2%pars1;
                System.out.print(rem);

            }
            System.out.println();
            rem=0;

        }

    }
}
