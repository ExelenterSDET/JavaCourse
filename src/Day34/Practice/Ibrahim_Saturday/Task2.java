package Day34.Practice.Ibrahim_Saturday;

/*
         Task 2

        Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy

        Result: c
 */
public class Task2 {

    static char nonRepeatingChar(String a){

        char ch = 0;
        
        for (int i = 0; i < a.length(); i++) {
            int counter = 0;
            for (int j = 0; j < a.length(); j++) {
                counter += a.charAt(i) == a.charAt(j) ? 1 : 0;
                if (counter > 1){break;}
            }
            if (counter == 1 ){
                ch = a.charAt(i);break;
            }else{
                ch = '$';
            }
        }
        System.out.println("ch = " + ch);
        return ch;
    }

    public static void main(String[] args) {
        String str = "zxqqvcczbbtmtxyzvy";
//        String str = "zzqqyhhytt";
        nonRepeatingChar(str);
    }
}
