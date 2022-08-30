package Day16.Practice;

public class Dilnoza {

    public static void main(String[] args) {

       /* Task6.
                Using scanner create a string.
                Return reverse of a string.
                Example: str = Java, result should be = avaJ
                */

        String str = "Java";
        String newStr ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
}
