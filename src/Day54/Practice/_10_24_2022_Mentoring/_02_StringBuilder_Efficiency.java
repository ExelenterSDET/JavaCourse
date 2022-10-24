package Day54.Practice._10_24_2022_Mentoring;

import java.util.Random;

public class _02_StringBuilder_Efficiency {

    public static void main(String[] args) {
        String str ="";
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();

        Random rnd = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str = str + (char)('a' + rnd.nextInt(26));
        }
        System.out.println("Time taken by using String: " + (System.currentTimeMillis()-startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sbf.append ((char)('a' + rnd.nextInt(26)));
        }
        System.out.println("Time taken by using StringBuffer: " + (System.currentTimeMillis()-startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append ((char)('a' + rnd.nextInt(26)));
        }
        System.out.println("Time taken by using StringBuilder: " + (System.currentTimeMillis()-startTime) + "ms");
    }


}
