package Day6.Java.JStrings;

public class StringConcat {

    public static void main(String[] args) {

        String str1 = "Hello ";
        String str2 = "World";
        String str3 = str1+str2;
        String str4 = str1.concat(str2);
        System.out.println(str3);
        System.out.println(str4);

        String a = "i ";
        String b = "love ";
        String c = "java";
        String d = a.concat(b).concat(c);
        System.out.println("d = " + d);

        // Create 2 strings and concat them to have Exelenter Sdet;
        String a1 = "Exelenter ";
        String b1 = "Sdet";
        System.out.println(a1.concat(b1));

        // Create 4 strings and using concat method print United States of America
        String x = "United ";
        String y = "States ";
        String z = "of ";
        String q = "America";
        String l = x.concat(y).concat(z).concat(q);
        System.out.println(l);

    }
}
