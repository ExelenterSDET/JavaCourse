package Day27.Practice;

public class Bakhridin_Task1 {
    public static void main(String[] args) {
        String str = "";

        Bakhridin_Task1 ts = new Bakhridin_Task1();
//        double aDouble = ts.getDouble(str);
//        System.out.println("aDouble = " + aDouble);
//
//        String s = ts.removeNonNumericCharacters(str);
//        System.out.println("s = " + s);

        boolean stringEmpty = ts.isStringEmpty(str);

        System.out.println("stringEmpty = " + stringEmpty);

        double total = ts.getTotal(str);
        System.out.println("total = " + total);

//        double total = ts.getTotal(str);
//        System.out.println("total = " + total);
    }


    double getDouble(String str) {

        return Double.parseDouble(str);
    }

    String removeNonNumericCharacters(String str) {

        return str.replaceAll("[^0-9.]", "");
    }
    boolean isStringEmpty(String str) {
        return str.isEmpty();
    }

//    double getTotal(String...args) {
//        double total=0.0;
//        for (int i = 0; i < args.length; i++) {
//            String str=removeNonNumericCharacters(args[i]);
//            total+=isStringEmpty(str)? -10.0 : getDouble(str);
//
//        }
//        return total;
//
//    }


    double getTotal(String... args) {
        double total = 0.0;
        for (String arg : args) {
            String ss = removeNonNumericCharacters(arg);

            if (isStringEmpty(ss)) {
                total -= 10.0;

            } else {
                total += getDouble(ss);

            }
        }
        return total;


    }
}
