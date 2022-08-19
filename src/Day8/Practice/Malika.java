package Day8.Practice;

public class Malika {
    public static void main(String[] args) {
        // Task1
        String str = "hello world";
        boolean Hello = str.startsWith("Hello");
        System.out.println("Hello = " + Hello);

        boolean ld = str.endsWith("ld");
        System.out.println("ld = " + ld);

        //Task2
        String str1 = "Hello, my name is Malika";
        String toLowerCase = str1.toLowerCase();
        System.out.println("toLowerCase = " + toLowerCase);

        String toUpperCase = str1.toUpperCase();
        System.out.println("toUpperCase = " + toUpperCase);

        //Task3
        String str2 = "       Java is Fun            ";
        int length = str2.length();
        System.out.println("str2 = " + str2);
        System.out.println("length = " + length);

        String trim = str2.trim();
        length = trim.length();
        System.out.println("trim = " + trim);
        System.out.println("length = " + length);

        //Task4
        String str3 = "Java is FUN";
        System.out.println(str3.substring(8).toLowerCase().replace('u', 'a'));

        //Task5
        String adress = "Bilge sokak No:13";
        String replaceadress = adress.replaceAll("[^0-9]", "*");
        System.out.println("replaceadress = " + replaceadress);
    }
}
