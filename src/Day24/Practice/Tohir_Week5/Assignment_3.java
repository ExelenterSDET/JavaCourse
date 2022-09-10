package Day24.Practice.Tohir_Week5;

public class Assignment_3 {
    public static void main(String[] args) {
        Assignment_3 asg = new Assignment_3();
      int num1 = 2;
      int num2 = 3;
      String str1 = "a";
      String str2 = "a";
      String str3[] = {"JaVa", "iS", "FUN","MadamM"};
      int [] num = {1,2,3,4,5,2,2,2,3};
        System.out.println(" = " + asg.isEqual(num1,num2)+" "+asg.isEqual(str1,str2));
        System.out.println("" + asg.numberOfElementsInVarArg(2,num));
        System.out.println("asg = " + asg.numberOfElementsInVarArg( "FUN", str3));
    }
    Boolean isEqual(int a, int b) //1
    {
        return (a == b);
    }
    Boolean isEqual(String a, String b) //2
    {
        return a.equals(b);
    }
    int numberOfElementsInVarArg(int b, int... a)//3
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isEqual(b,a[i])) {
                sum++;
            }
        }

        return sum;
    }
    int numberOfElementsInVarArg(String b, String... a)//4
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isEqual(b,a[i])){
                sum++;
            }
        }
    return sum;
    }
}
//Task3
//
//1. Create a method named as isEqual. Method must have two int parameters. Method should check if both numbers are equal and return boolean.
//2. Create a method named as isEqual. Method must have two String parameters. Method should check if both Strings are equal and return boolean.
//3. Create a method named as numberOfElementsInVarArg. Method has two parameters: int VarArg and int. Count how many int numbers are exist in the given varArg and return qty.
//4. Create a method named as numberOfElementsInVarArg. Method has two parameters: String VarArg and String. Count how many Strings are exist in the given varArg and return qty.