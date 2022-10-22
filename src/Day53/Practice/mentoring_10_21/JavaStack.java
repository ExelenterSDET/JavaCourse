package Day53.Practice.mentoring_10_21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.IntStream;


public class JavaStack {

/* Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
        Note that after backspacing an empty text, the text will continue empty.
        Example 1:

        Input: s = "ab#c", t = "ad#c"
        Output: true
        Explanation: Both s and t become "ac".
        Example 2:
                        f           ""
        Input: s = "ffb##", t = "c#d#"
        Output: false
        Explanation: Both s and t become "".
        //
        */

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";
        boolean delete = delete(s, t);
        System.out.println(delete);

    }
    static boolean delete (String s, String t){
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch= s.charAt(i);
            if(ch != '#'){
                sStack.push(ch);
            }else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            char ch= t.charAt(i);
            if(ch != '#'){
                tStack.push(ch);
            }else if(!tStack.isEmpty()){
                tStack.pop();
            }
    }
        if(sStack.equals(tStack)){
        return true;
        }
        return false;
    }
}


