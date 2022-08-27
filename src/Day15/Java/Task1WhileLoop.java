package Day15.Java;

public class Task1WhileLoop {

    public static void main(String[] args) {

        /*
        create a string which is = Java is Fun;
        print each character of the string.
         */

        String str = "Java is Fun";
        int index = 0;
        while(index<str.length()){
            System.out.print(str.charAt(index++));
        }


    }
}
