package Day25.Practice._09_13_2022_Mentoring_SP5_Tasks;

public class Task3 {

        /*
    * Task3
1. Create a method named as isEqual. Method must have two int parameters.
*  Method should check if both numbers are equal and return boolean.
2. Create a method named as isEqual. Method must have two String parameters.
*  Method should check if both Strings are equal and return boolean.
3. Create a method named as numberOfElementsInVarArg. Method has two parameters:
* int VarArg and int. Count how many int numbers are exist in the given varArg and return qty.
4. Create a method named as numberOfElementsInVarArg. Method has two parameters:
* String VarArg and String. Count how many Strings are exist in the given varArg and return qty.
    * */

    boolean isEqual(int a, int b){
        return a == b;
    }
    boolean isEqual(String a, String b){
        return a.equals(b);
    }
    int numberOfElementsInVarArg(int n, int...values){
        // n = 2; how many twos we have in values array
        int counter = 0;
        for (int value : values) {
            //1. way
            counter += isEqual(n, value) ? 1 : 0;
            //2. way
//            if (isEqual(n, value)){
//                counter++;
//            }
        }
        return counter;
    }

    int numberOfElementsInVarArg(String str, String...values){
        // n = 2; how many twos we have in values array
        int counter = 0;
        for (String value : values) {
            //1. way
            counter += isEqual(str, value) ? 1 : 0;
            //2. way
//            if (isEqual(str, value)){
//                counter++;
//            }
        }
        return counter;
    }
}
