package Day18.Practice;

public class Arthur18Day {
    public static void main(String[] args) {
        String str = "ABCDE";

        outerloop:
        for (int i = 1; i <= 5; i++) {

            innerloop:
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'D' || str.charAt(j)== 'B'){
                    continue outerloop;
                }
                System.out.println("" + i + str.charAt(j) + " ");

            }

        }



    }
}
