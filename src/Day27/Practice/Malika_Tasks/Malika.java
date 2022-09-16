package Day27.Practice.Malika_Tasks;

public class Malika {
    public static void main(String[] args) {

    }
    static double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    static String removeNonNumericCharacters(String str) {
        return str.replaceAll("[^\\d.]", "");
    }

    static boolean ifStringIsEmpty(String str) {
        return str.isEmpty();
    }

    static double convertToDouble(String... args) {
        double total = 0.0;
        for (int i = 0; i < args.length; i++) {
            String str = removeNonNumericCharacters(args[i]);
            total += ifStringIsEmpty(str) ? -10 : stringToDouble(str);
        }
        return total;
    }
    //option 2
    static double stringToDouble2(String str){
        return ifStringIsEmpty(str) ? -10.0 : Double.parseDouble(str);
    }
    static double getTotal2(String... args){
        double total = 0.0;
        for (int i = 0; i < args.length; i++) {
            total+= stringToDouble2(removeNonNumericCharacters(args[i]));
        }
        return total;
    }
}
