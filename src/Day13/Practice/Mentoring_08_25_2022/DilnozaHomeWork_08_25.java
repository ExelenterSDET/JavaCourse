package Day13.Practice.Mentoring_08_25_2022;

import java.util.Scanner;

public interface DilnozaHomeWork_08_25 {
    /*  Mentoring HomeWork:
     * Write a Java program that takes a single character from the alphabet.
     * Print Vowel or Consonant, depending on the user input. If the user input is not a letter
     * (between a and z or A and Z), or is a string of length > 1, print an error message.
     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please provide a letter from the alphabet==> ");
        String userInput = scan.nextLine().toLowerCase();

        boolean uppercase = userInput.charAt(0) >=65 && userInput.charAt(0)<=90;
        boolean lowercase = userInput.charAt(0) >= 97 && userInput.charAt(0)<=122;
        boolean vowels = userInput.equals("a") || userInput.equals("e") || userInput.equals("i")
                ||userInput.equals("o")|| userInput.equals("u");

        String result = String.valueOf(vowels);

        if(userInput.length()>1 ){
            result="Error: Not a valid entry. Please enter single letter!!! ";

        }else if(!(uppercase || lowercase)){
            result= "Error: Not an upper case or lower case letter. Please provide a letter ";

        }else if (vowels){
            result= userInput;

        }else{
            result="Consonant";

        }
        System.out.println(result);
    }

}
