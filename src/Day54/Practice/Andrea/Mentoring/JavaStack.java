package Day54.Practice.Andrea.Mentoring;

import java.util.Stack;

public class JavaStack { // stack = "last in, first out"
    public static void main(String[] args){
        Stack<Character> characters = new Stack<>();
        characters.push('a');  //adds the character
        characters.push('b');
        characters.push('c');
        System.out.println(characters);
        System.out.println(characters.pop()); //takes character on "top" and removes
        System.out.println(characters.peek()); //character on "top" which is 'c'

    }

}
