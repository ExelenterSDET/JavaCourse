package Day16.Java;

public class Task6 {
    /*
    String str = "Java is Fun";
    print all characters. if character is F, break the loop. don print F
     */

    public static void main(String[] args) {
        String str = "Java is Fun";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'F'){
                break;
            }
            System.out.println(str.charAt(i));
        }
    }
}
