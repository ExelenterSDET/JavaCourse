package Day17.Practice;

public class Anthony {
    public static void main(String[] args) {

        /*
        Homework
        int num1 = 358
        int num2 = 1020304050

        take double values
        10 20 30 40 50 60
        3   3   3   3   3 = 12345
        6   6   6   6   6 = 42042
        8   8   8   8   8 = 24602
        return remainder
         */

        String num1 = "358";
        String num2 = "1020304050";

        for (int i = 0; i < num1.length(); i++) {
            char n1 = num1.charAt(i);
            String new1 = String.valueOf(n1);
            int i1 = Integer.parseInt(new1);

            for (int j = 0, l=1 ; j < num2.length(); j += 2,l+=2) {
                char n2 = num2.charAt(j);
                char n3 = num2.charAt(j);
                String new2 = String.valueOf(n2)+String.valueOf(n3);
                int i2 = Integer.parseInt(new2);
                System.out.print(""+i2%i1+"");

            }
            System.out.println();
        }

    }
}
