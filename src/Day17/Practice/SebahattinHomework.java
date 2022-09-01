package Day17.Practice;

public class SebahattinHomework {
    public static void main(String[] args) {
       /*
    Homework
    String num1 = "368"
    String num2 = "102030405060"

    10 20 30 40 50 60
     3  3  3  3  3  3 = 12012
     6  6  6  6  6  6 = 42042
     8  8  8  8  8  8 = 24602
*/
        String num1 = "368";
        String num2 = "102030405060";
        for (int k = 0; k < num1.length(); k++) {
            char ch1 = num1.charAt(k);
            String s1 = String.valueOf(ch1);
            int numStr1 = Integer.parseInt(s1);

            for (int i =0, j=1 ; i < num2.length(); i+=2, j+=2) {
                char ch2 = num2.charAt(i);
                char ch3 = num2.charAt(j);
                String s2 = String.valueOf(ch2)+String.valueOf(ch3);
                int numStr2 = Integer.parseInt(s2);
                System.out.print(""+numStr2%numStr1+" ");
            }
            System.out.println();
        }
    }
}
