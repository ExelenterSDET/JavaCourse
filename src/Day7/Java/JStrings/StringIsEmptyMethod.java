package Day7.Java.JStrings;

public class StringIsEmptyMethod {
/*
Checks whether a string is empty or not
 */
    public static void main(String[] args) {

        String str = "exelenter";
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        // will return false, since str has some characters
        str = "";
        isEmpty = str.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        // will return true, since str doesnt have any characters


    }
}
