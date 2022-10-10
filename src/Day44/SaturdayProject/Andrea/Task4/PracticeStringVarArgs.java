package Day44.SaturdayProject.Andrea.Task4;

public class PracticeStringVarArgs {

public void reverseString (String... args){
    int length = args.length;

    String rev = "";
    for(int i = length - 1; i >= 0 ; i--) //
    {
        System.out.println(args[i] + " ");
    }
}

    public static void main(String[] args) {
        PracticeStringVarArgs p1 = new PracticeStringVarArgs();
        p1.reverseString("I wish I could stay home");
    }
}
//  1. Create a method which will print String varargs in the reversed order.
//          compile and run using terminal
//
//          Example:
//          Input: Java is Fun
//          Output: Fun is Java
//
//          2. Create a method which will return boolean
//          If provided String is palindrome, return true. Else, return false.
//          compile and run using terminal
//
//          Example:
//          Input: 123321
//          Output: true
//
//          3. Create a methods which will return total length of all Strings.
//          compile and run using terminal.
//
//          Example:
//          Input: Java is Fun 2005
//          Output:  4 + 2 + 3 + 4 = 13
