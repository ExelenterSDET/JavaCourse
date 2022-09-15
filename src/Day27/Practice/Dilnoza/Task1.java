package Day27.Practice.Dilnoza;

public class Task1 {
  /*
    method overloading practice
    1. Create a method that will have a string as parameter and convert it to double
     2. create a method that removes all non-numeric char from string
     Parameter is DString return String
     3. create a method that will check if the string is empty. Parameter String return boolean

     4. Create a method of String varargs.
     4.1 Convert Strings to double and have total of them.
     4.2 If Str is empty, subtract from total-10; Return total

     */

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        String str = "10.5";
        double v = strToDouble(str);
        System.out.println("v = " + v);
        boolean empty = isEmpty(str);
        System.out.println("empty = " + empty);
        String[] str2= {"$10.5", "abc", "Euro2.5"};
        double v1 = strToDoubleGetTotal(str2);
        System.out.println("v1 = " + v1);


    }

    static double strToDouble(String str){
        return Double.parseDouble(str);
    }

    static   String removeNonNum(String str){
        return str.replaceAll("[^0-9.]","");// or "\\^d
    }
    static boolean isEmpty(String empty){
        return empty.isEmpty();
    }

    static  double strToDoubleGetTotal(String ... stringArgs){
        double total =0.0;
        for (int i = 0; i < stringArgs.length; i++) {
            String str = removeNonNum(stringArgs[i]);
            total +=isEmpty(str)?-10:strToDouble(str);
        }return total;

    }


}
