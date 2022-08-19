package Day8.Practice;

public class Andrea {
    public static void main(String[] args) {
        System.out.println("Andrea Mikulin");

        //startsWish() and endsWith()

        String str = "Exelenter";
        boolean e = str.startsWith("E");
        System.out.println("e = " + e);
        boolean exel = str.startsWith("Exel");
        System.out.println("exel = " + exel);
        boolean exel2 = str.startsWith("exel");
        System.out.println("exel2 = " + exel2);
        boolean exel3 = str.endsWith("r");
        System.out.println("exel3 = " + exel3);
        boolean exel4 = str.endsWith("ter");
        System.out.println("exel4 = " + exel4);

        String str1 = "hello world";
        boolean h = str1.startsWith("Hello");
        System.out.println("h = " + h);

        boolean w = str1.endsWith("ld");
        System.out.println("w = " + w);

        //toLowerCase toUpperCase
        str = "Hello World";
        String s = str.toLowerCase();
        System.out.println("s = " + s);
        s = str.toUpperCase();
        System.out.println("s = " + s);

        String str2 = "Hello, my name is Andrea Mikulin";
        String f = str2.toLowerCase();
        System.out.println("f = " + f);

        String g = str2.toUpperCase();
        System.out.println("g = " + g);


        //toString method
        String s1 = str.toString();
        System.out.println("s1 = " + s1);

        //trim

        String strJava = "          Java is Fun        ";
        int length = strJava.length();
        System.out.println("strJava = " + strJava);
        System.out.println("length = " + length);
        String str5 = strJava.trim();
        length = str5.length() ;
        System.out.println("str5 = " + str5);
        System.out.println("length = " + length);

        //split
        String email = "andreamikulin@gmail.com";
        String[] split = email.split("@");
        //System.out.println(Arrays.toString(split)); Need to import java.util.Arrays for this to work


        //replace
        String strT = "Txelenter";
        System.out.println(strT.replace('T', 'E'));
        String replace = strT.toLowerCase().replace('e', '@');
        System.out.println("replace = " + replace);

        String sentence = "Java is FUN";
        String sub = sentence.substring(8);
        System.out.println("sub = " + sub);
        System.out.println(sub.toLowerCase().replace('u', 'a'));;

        String s2 = sentence.substring(8).toLowerCase().replace('u', 'a' );
        System.out.println("s2 = " + s2);

        //replaceAll

        String str8 = "Java is Fun. I love java";

        String x = str8.replaceAll("[aelJ]", "x");
        System.out.println("x = " + x);

        String address = "4920 S Bahama Court, Aurora, CO, 80015";
        String replaced = address.replaceAll("[^0-9]", "*");
        System.out.println("replaced = " + replaced);

        System.out.println(address.replaceAll("[^\\d]", "*"));

        //replaceFirst
        String s4  = str8.replaceFirst("[A-Z]", "*");
        System.out.println("s4 = " + s4);


    }
}
