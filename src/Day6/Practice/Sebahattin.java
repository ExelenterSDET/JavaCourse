package Day6.Practice;

public class Sebahattin {
    public static void main(String[] args) {

        // Task 1 - Java Comparison Operators
        char y = 121;
        char z = 'z';
        boolean isBigger = y>z;
        System.out.println("isBigger = "+isBigger);
        System.out.println("--------------------");

        // Task 2 - String Length
        String name = "Sebahattin Beycur";
        int nameLength = name.length();
        System.out.println(name);
        System.out.println("NameLength = "+nameLength);
        System.out.println("--------------------");

        String cityname = "Elazig";
        int cityLength = cityname.length();
        System.out.println("CityLength = " + cityLength);
        System.out.println("--------------------");

        // Task 3 - String Concat
        String a = "United ";
        String b= "States ";
        String c= "of ";
        String d= "America";
        String e= a.concat(b+c+d);
        System.out.println("e = "+e);
        System.out.println("--------------------");

    }
}
