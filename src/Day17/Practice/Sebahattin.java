package Day17.Practice;

public class Sebahattin {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" "+'#'+" ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------");
        System.out.println();
        String str = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i)+"="+count + " ");
        }
        System.out.println("-----------------------------");
        System.out.println();
        String str1 = "ABC";
        int number = 5;
        // A1 A2 A3 A4 A5 B1 B2 B3 ......
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(""+str1.charAt(i)+j+" ");
            }
            System.out.println();
        }
    }
}
