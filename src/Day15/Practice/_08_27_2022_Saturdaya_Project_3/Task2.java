package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        /*Task2
        *Create a random password generator.
1. Password should be minimum 16 characters
2. Password should have 4 Capital letter.
3. Password should have 4 lower case letter.
4. Password should have 4 numbers.
5. Password should have 4 special character.

Example: Qe4$Os5!De1$Oe3&
        * */

        //"!#$%&()*+,-.:;<=>?@[]^_{|}~"
        //"ABCDEFGHIJKLMNOPRSTUWXYZ"
        //"abcdefghijklmnoprstuwxyz"

        String pwd = "";
        String capitals = "ABCDEFGHIJKLMNOPRSTUWXYZ";
        String lowerCase = "abcdefghijklmnoprstuwxyz";
        String specialChars = "!#$%&()*+,-.:;<=>?@[]^_{|}~";
        Random rnd = new Random();

        while ( pwd.length() < 16){

            pwd += capitals.charAt(rnd.nextInt(capitals.length())); //pwd = Ad1%
            pwd += lowerCase.charAt(rnd.nextInt(lowerCase.length())); //pwd = Ad1%
            pwd += rnd.nextInt(10);
            pwd += specialChars.charAt(rnd.nextInt(specialChars.length())); //pwd = Ad1%
        }
        System.out.println("pwd = " + pwd);
    }
}
