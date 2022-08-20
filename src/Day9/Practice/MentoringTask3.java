package Day9.Practice;

import java.util.Scanner;

public class MentoringTask3 {

    /*
    Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string,
    e.g. "<<word>>".


    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
    {{}}
    (())
    {[]}
     */
    public static void main(String[] args) {

        //Hint
        // 1. use substring
        // 2. use concat
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string 1 => ");
        String brackets = scan.nextLine();
        System.out.print("Enter strgin 2 => ");
        String text = scan.nextLine();

        //solution1
        String bracketsBegin = brackets.substring(0,2);
        String bracketsEnd = brackets.substring(2);

        System.out.println(bracketsBegin.concat(text).concat(bracketsEnd));

        // not the best solution. just as an option
//        String bracket1 = String.valueOf(brackets.charAt(1));
//        String bracket2 = String.valueOf(brackets.charAt(2));
//
//
//        String s = brackets.replaceAll(bracket1.concat(bracket2), bracket1 + text + bracket2);
//        System.out.println("ouput = " + s);
    }
}
