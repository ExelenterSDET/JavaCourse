package Day7.Practice;

public class AnthonyH {

    public static void main(String[] args) {


        // Task1
        // Create 3 strings as "JAVA ", " IS ", "FUN". and assign to the new string all of them.
        // Concat method assign to the new string all of them
        // last string should be "JAVA IS FUN"

        String str1 = "JAVA";
        String str2 = " IS ";
        String str3 = "FUN";

        String str4 = str1.concat(str2).concat(str3);
        String str5 = str1.concat(str2+str3);
        System.out.println("TASK 1 V1 = "+ str4);
        System.out.println("TASK 1 V2 (More Practice) = "+ str5);

        //Task 2
        // Get of the length of the last string

        String str6 = "JAVA IS FUN";
        int str6Length = str6.length();
        System.out.println("TASK 2 = " + str6Length);

        //Task 3 : Get the index of the first "I" character
        System.out.println("TASK 3 = "+str6.indexOf("IS"));

        //Task 4 : Get the character of the last index (charAt method)
        // System.out.println("TASK 4 = " +(str6.length()-1));
        //int lastIndex = str6.lastIndexOf("N");
        //System.out.println("TASK 4 = " + lastIndex);
        //int lastIndex2 = str6.lastIndexOf('N');
        //System.out.println("TASK 4 = " + lastIndex2);
        int str6Length1 = str6.length();
        System.out.println("TASK 4: " +"Last index:" + str6.charAt(str6.length()-1));

        //Task 5: Validate that the string has "JAVA"
        boolean str7 = str6.contains("JAVA ");
        System.out.println("TASK 5 = "+str7);

        // Task 6: Validate that the string isEmpty
        boolean isEmpty = str6.isEmpty();
        String str10 = "";
        boolean isEmpty2 = str10.isEmpty();
        System.out.println("TASK 6 = isEmpty (More Practice) = " + isEmpty);
        System.out.println("TASK 6 = isEmpty  = " + isEmpty2);


        // Task 7: substring "JAVA" from the string
        System.out.println("TASK 7 = " +str6.substring(0,4));


        // Task 8: create a new string which is "java." and using equals and equalsIgnoreCase methods.
        //Validate that they are equal.
        String str8 = "java";
        String str9 = "JAVA";
        System.out.println("TASK 8 needs to equal (More Practice) = " +str8.equals(str9));
        System.out.println("TASK 8 needs to equal = " +str8.equalsIgnoreCase(str9));

    }
}
