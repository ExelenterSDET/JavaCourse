package Day19.Practice.Bakhridin;

public class JavaEnhancedForLoop {

    public static void main(String[] args) {

        String[] strArr = {"$50", "$150", "$5", "$18", "$25"};
        int total = 0;
        double average = 0;
        for (String s : strArr) {
            s = s.replaceAll("[^0-9]", "");
            System.out.println(" " + s);
            total += Integer.parseInt(s);
            average = (double) total / strArr.length;
        }

        System.out.println(total);
        System.out.println(average);


//        int[] num3 = {3, 6, 8};
//        int[] num4 = {10, 20, 30, 40, 50};
//        int num5 = 0;
//        int num6 = 0;
//
//        for (int i = 0; i < num3.length; i++) {
//            num5 = num3[i];
//            System.out.println();
//            for (int i1 = 0; i1 < num4.length; i1++) {
//                num6 = num4[i1];
//
//                System.out.print("" + num6 % num5);
//
//            }
//        }
    }
}