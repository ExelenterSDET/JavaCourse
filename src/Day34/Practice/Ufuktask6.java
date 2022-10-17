package Day34.Practice;

import java.util.*;

import static java.lang.Math.round;

public class Ufuktask6 {
    /*Task 6.
         Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.

         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)*/
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>(Arrays.asList('a','a','a','a','e','f','a','t','d','a','l','m','u','v','x','a','e','b','d'));
        average(ascii(uniqeIt(list)));
    }

    static ArrayList<Character> uniqeIt(ArrayList<Character> charList){
        HashSet<Character> charset=new HashSet<>((charList));
        ArrayList<Character> chlist = new ArrayList<Character>();
        chlist.addAll(charset);
        Collections.reverse(chlist);
        System.out.println(chlist);
        return chlist;
    }

    static HashMap<Character,Integer> ascii(ArrayList<Character> charlist){
        HashMap<Character,Integer> hashChar=new HashMap<>();
        for (int i = 0; i < charlist.size(); i++) {
            hashChar.put(charlist.get(i),(int)(charlist.get(i)));
        }
        System.out.println(hashChar);
        return hashChar;
    }

    static double average(HashMap<Character,Integer> asciVal){
        int sum=0;
        for(Map.Entry<Character, Integer> row: asciVal.entrySet()){
            sum+=row.getValue();}
        System.out.println("sum: "+sum);
        double avg=round(sum*100.00/asciVal.size())/100.00;

        System.out.println("avg: "+avg);
        return avg;
    }
}
