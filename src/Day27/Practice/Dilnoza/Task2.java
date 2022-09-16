package Day27.Practice.Dilnoza;

public class Task2 {
    /*
   1. Create a method that will take two String parameters.
   Method will convert both string to lower case and check if two string are equal.
   Return value is boolean.

   2. Create a method which will have two parameters. String, String... args.
   Method will count how many Strings are in the args. Return int
   3. Create a void method which will have one parameter with String... args.
       Count how many times each string repeats.

       aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd
       aba = 5
       bad = 5
       cat = 4
    */
    static boolean equalsToLowerCase(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    static int count(String str1, String... args) {
        int count = 0;

        for (int i = 0; i < args.length; i++) {
            if (equalsToLowerCase(str1, args[i])) count = 1;
            else count = 0;

        }
        return count;
    }

    static void count(String... args) {
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {

            }

        }
        System.out.println("count = " + count);

    }


    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String str1 = "Java";
        String str2 = "JAVA";
        boolean b = task2.equalsToLowerCase(str1, str2);
        System.out.println("b = " + b);
        String str3 = "aba, cat, aba, bad, CAT, CAt, aba, bad, Bad, cat, aba, ABA, bAD, bAd";


    }
}