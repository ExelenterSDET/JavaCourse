package Day27.Practice.Ibrahim_HM;

public class Task1 {
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
        System.out.println(getTotal("$100.5", "abc", "Euro2.5"));
    }


    public static double stringToDouble(String str){
        return Double.parseDouble(str);
    }
    public static String removeNonNumeric (String str){
         return str.replaceAll("[^\\d.]", "");
    }
    public static boolean isEmpty(String str){
        return str.isEmpty();
    }
    public static double getTotal(String... args){
        double total = 0.0;
        for (String arg : args) {
            if(isEmpty(removeNonNumeric(arg))){
                total -= 10.0;
            }else{
                total += stringToDouble(removeNonNumeric(arg));
            }
        }
        return total;
    }

}
