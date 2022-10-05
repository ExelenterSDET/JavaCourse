package Day39.Practice._10_04_2022_Mentoring;

public class Task3 {
    /*Task 3
        Create a method which will take a String as a parameter and return type is char.
        This method should return a character which is mostly consecutively repeated.

        Example:
        String = "aaaabbacccccdddccaaaddddaac"  // ccc
        Output should be c.

        Explanation: c continuously / without breaking is repeated 5 times. more then a, b, or d.

        note: This is a most recent interview question!!!
        */

    static char mostConsecutiveChar(String str){
        if (str.length() == 0) return ' ';
        char [] chars = new char[str.length()+1];  // 6 { , c, b, ,a , }
        char result = 0;
        int index = 1;

        while (index <= str.length()-1){
            if (str.charAt(index) != str.charAt(index-1)){
                if(chars[index] == 0){
                    chars[index] = str.charAt(index-1);
                }
                str = str.substring(index);
                index = 0;
            }
            index++;
        }
        chars[index] = chars[index] == 0 ? str.charAt(index-1) : chars[index];
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != 0){
                result = chars[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ac";
        System.out.println(mostConsecutiveChar(str));
    }
}
