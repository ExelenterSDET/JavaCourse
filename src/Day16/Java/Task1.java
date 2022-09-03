package Day16.Java;

public class Task1 {
    public static void main(String[] args) {

        String str = "Java";
        /*
        return new string which is reversed of str
         */
        String strReversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            strReversed +=  str.charAt(i);
        }
        System.out.println("strReversed = " + strReversed);

    }
}
