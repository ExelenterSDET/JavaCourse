package Day26.Java;

public class JavaVoidMethods {
    /*
    isMax
    getData
    getStringData
    getIntValue
     */
    public static void main(String[] args) {
        String str = "Java";
        printString(str);
    }

    public static void printString(String str){
        System.out.println(str);
    }

    public static void printStrings(String str, String str2, int i, byte b){
        System.out.println(str + str2 + i + b);
    }
}
