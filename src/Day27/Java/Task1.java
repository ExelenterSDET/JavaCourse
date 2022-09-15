package Day27.Java;

public class Task1{
    /*
    1. Create a method, which will have a
    String as parameter and convert it to double. returns double.

    2. Create a method which removes all non-numeric characters from the String.
    Parameter - String, returns String.

    3. Create a method which will check if the String is empty.
     Parameter will be String, return is boolean.

    4. Create a method of String varArgs.
        4.1. Convert all Strings to double and have total of them.
        4.2. If String is empty, subtract from total -10;

        return total. (double)
        "10.5" = 10.5 "" = -10
     */

    public static void main(String[] args) {

        System.out.println(getTotal2("$10.5", "abc", "Euro2.5"));

        String str = "";
        double db = Double.parseDouble(str);
        System.out.println(db);

    }

    static double stringToDouble(String str){
        return Double.parseDouble(str);
    }

    static String removeNonNumericCharacters(String str){
        return str.replaceAll("[^\\d.]", "");
    }

    static boolean stringIsEmpty(String str){
        return str.isEmpty();
    }

    static double getTotal(String... args){
        double total = 0.0;
        for (int i = 0; i < args.length; i++) {
            String str = removeNonNumericCharacters(args[i]);
            total += stringIsEmpty(str) ? -10 : stringToDouble(str);
        }
        return total;
    }

    // option 2
    static double stringToDouble2(String str){
        return stringIsEmpty(str) ? -10.0 : Double.parseDouble(str);
    }

    static double getTotal2(String... args){
        double total = 0.0;
        for (int i = 0; i < args.length; i++) {
            total += stringToDouble2(removeNonNumericCharacters(args[i]));
        }
        return total;
    }
}
