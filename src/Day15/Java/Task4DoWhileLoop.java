package Day15.Java;

public class Task4DoWhileLoop {

    /*
        create a string which is = Java is Fun;
        print each character of the string.
         */

    public static void main(String[] args) {

        String str = "Java is Fun";
        int index = 0;
        do{
            System.out.print(str.charAt(index++));
        }while(index<str.length());

    }
}
