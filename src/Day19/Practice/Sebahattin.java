package Day19.Practice;

import java.util.Arrays;

public class Sebahattin {
    public static void main(String[] args) {
        //Task2 Write a Java program to calculate the average value of array elements.
        /*        int [] numArr = {12, 35, 58, 78, 96, 12};
         */
        int [] numArr = {12,35,58,78,96,12};
        int average =0;
        double average1=0.0;

        for (int i = 0; i < numArr.length; i++) {
            average = (numArr[i]+average);
        }
        average1=(double) average/numArr.length;
        System.out.println("average ==> "+average1);

        //Task4
        System.out.println();
        System.out.println("------------------------");
        String strArr [] = {"$50","$150","$5","$18","$25"};

        for (String s : strArr){
            System.out.print(s.replace("$"," "));
        }
        System.out.println();
        System.out.println(Arrays.toString(strArr));
        System.out.println();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i]= strArr[i].replace("$","");
        }
        System.out.println("strArr = "+ Arrays.toString(strArr));

        //Task5
        System.out.println();
        System.out.println("------------------------");
        String strArr2 [] = {"$50","$150","$5","$18","$25"};
        int total = 0;
        double avg = 0;

        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i]=strArr2[i].replace("$","");
            System.out.print(" " +strArr2[i]);
            total+= Integer.parseInt(strArr2[i]);

        }
        avg = (double)  total/strArr.length;
        System.out.println();
        System.out.println("total = "+total);
        System.out.println("avg = "+avg);
    }
}
