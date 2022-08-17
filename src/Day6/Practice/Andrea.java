package Day6.Practice;

public class Andrea {

      public static void main(String[] args) {

            int myAge = 35;
            int myKid = 35;
            boolean notEqual = myAge != myKid;
            System.out.println("notEqual = " + notEqual);

            int num1 = 5;
            int num2 = 7;
            boolean isBigger = num1>num2;
            System.out.println("isBigger = " + isBigger);

            //Strings - an object or reference data type (combination of chars)
            String str =  "ab";
            String name = "Andrea Mikulin";

            //Java Concatenation
            String str1 = "Java ";
            String str2 = "Class";
            System.out.println(str1+str2);
            String str3 = str1.concat(str2);
            System.out.println("str3 = " + str3);

            String a = "I ";
            String b = "love ";
            String c = "Java";
            String d = a.concat(b).concat(c);
            String e = a.concat(b+c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);

            String s1 = "Exelenter ";
            String s2 = "SDET";
            String s3 = s1.concat(s2);
            System.out.println("s3 = " + s3);

            String a1 = "United ";
            String a2 = "States ";
            String a3 = "of ";
            String a4 = "America";
            String b1= a1.concat(a2).concat(a3).concat(a4);
            System.out.println(b1);

            String country = "Balkania"; //alt+enter
            int countryLength = country.length();
            System.out.println("countryLength = " + countryLength);

            String myName = "Andrea Mikulin";
            int length = myName.length();
            System.out.println("length = " + length);

            String city = "Aurora";
            int length1 = city.length();
            System.out.println("length1 = " + length1);



        }
}
