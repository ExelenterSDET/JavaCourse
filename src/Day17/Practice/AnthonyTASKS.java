package Day17.Practice;

public class AnthonyTASKS {

    public static void main(String[] args) {

        System.out.println("TASK 1 ");
        for (int i = 1; i <= 2; i++) { //outer loop => 1 and 2
            for (int j = 1; j < 5; j++) { //inner loop => 1, 2, 3, 4, 5
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("TASK 2 ");

        /*
        create multiplication table for 1 to 10
         */
        for (int i = 1; i <= 10; i++) { //outer loop => 1 and 2
            for (int j = 1; j <= 10; j++) { //inner loop => 1, 2, 3, 4, 5
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("TASK 3 ");

        // utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang
        //print every character and count how many times it apprears in the string

        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";

        String toAvoidDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //store from outer loop

            if (toAvoidDuplicates.contains(String.valueOf(ch))) {
                continue;
            }
            toAvoidDuplicates += ch;
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    counter++;
                }

            }
            System.out.print(" " + ch + " = " + counter);

        }

        System.out.println("\n" + "--------------------------------------------------------------------------------");

        String str2 = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";

        int count = 0;

        for (int i = 0; i <= str2.length() - 1; i++) {
            System.out.println(str2.charAt(i));
            for (int j = 0; j < str2.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    ++count;
                }
            }
            System.out.print("count = " + count);
            System.out.print(" ");
            count = 0;
        }

        System.out.println("\n"+"-------------------------------------------------------------------");
        System.out.println("TASK 4 ");
        // print grid of "#" with 10 rows and 10 columns
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(" # ");
            }
            System.out.println(" # ");
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("TASK 5 ");

        //Write program using nested loops that prints:
        //*
        //**
        //***
        //****
        //*****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("TASK 6 ");

        String str6 = "xyz";
        String str7 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";

        for (int i = 0; i < str6.length(); i++) {
            char ch = str6.charAt(i); //store from outer loop

            int counter = 0;
            for (int j = 0; j < str7.length(); j++) {

                if (ch == str7.charAt(j)) {
                    counter++;
                }
            }
            System.out.print(" " + ch + " = " + counter);


        }
    }
}
