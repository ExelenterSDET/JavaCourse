package Day27.Java;

public class JavaVarargs {

    public static void main(String[] args) {

        String str = "a";
        String str1 = "b";
        String str2 = "c";
        String str3 = "d";

        printString(str, str1, str2, str3);



    }
//    static void printString(String str){
//        System.out.println(str);
//    }
//    static void printString(String str, String str1){
//        System.out.println(str + " " + str1);
//    }
//    static void printString(String str, String str1, String str2){
//        System.out.println(str + " " + str1 + " " + str2);
//    }

    static void printString(String... args){ // String[]
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}
