package Day24.Practice.SaturdayTasksWeek5;

public class Task3 {

//      1. Create a method named as isEqual. Method must have two int parameters. Method should check if both numbers are equal and return boolean.
//      2. Create a method named as isEqual. Method must have two String parameters. Method should check if both Strings are equal and return boolean.
//      3. Create a method named as numberOfElementsInVarArg. Method has two parameters: int VarArg and int. Count how many int numbers are exist in the given varArg and return qty.
//      4. Create a method named as numberOfElementsInVarArg. Method has two parameters: String VarArg and String. Count how many Strings are exist in the given varArg and return qty.

    public static void main(String[] args) {

        System.out.println(isEqual(34,34));
        System.out.println(isEqual(459, 499));
        System.out.println(isEqual("mom", "dad"));
        System.out.println(isEqual("happy", "happy"));
        System.out.println(numberOfElementsInVarArg(1232,2));

    }

    static boolean isEqual(int num1, int num2) {
        return (num1==num2);
    }

    static boolean isEqual(String strA, String strB) {
        return (strA.equals(strB));
    }

    public static int numberOfElementsInVarArg(int... varArgs) {
        int total = 0;
        for (int varArg : varArgs) {
            total += varArg;
        }
        System.out.println("Count number of Int existing in VarArgs = " + total);
        return total;
    }

    public static String numberOfElementsInVarArg(String... varArgs) {
        String str = String.valueOf(0);
        for (int i = 0; i < varArgs.length; i++) {
            str += varArgs[i];

        }
        System.out.println("Count number of Int existing in VarArgs = " + str.length());
        return str;
    }


}
