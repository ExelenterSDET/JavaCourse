package Day48.Practice.SP.mentoring_10_14;
//reverse String; Hello -> olleH
public class Task2 {
    static String reverseString(String str){
        String newStr = "";
        for (int i = str.length() - 1; i >=0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    static String[] reverseString2(String arr[]) {
        int j = 0;
        String[] dummy = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            dummy[j] = arr[i];
            j++;
        }
        return dummy;
    }
}
