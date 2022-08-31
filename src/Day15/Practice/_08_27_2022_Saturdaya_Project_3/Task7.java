package Day15.Practice._08_27_2022_Saturdaya_Project_3;

import java.util.Random;

public class Task7 {

            /*Task7.
Create random string, which has a length of 30 and all characters are lower case letters.
return a count of the most repeated character.
Example: flapoeplksldfalafaaafoiwefafsa === output should be 8, since a is the most repeated.
*/

    public static void main(String[] args) {

        String randomText = "";
        Random rnd = new Random();
        int index = 0;

        while (index < 30) {

            char randomLowerCase = (char) rnd.nextInt(97, 123);  // 97 = a
            randomText += randomLowerCase;
            index++;
        }
        System.out.println("randomText = " + randomText);
        System.out.println("length: " + randomText.length());

        int maxCounter = 0;
        String charToDisplay = "";

        while (randomText.length() > 0){
            int randomTextLen = randomText.length();  // 30  25
            char character = randomText.charAt(0); // f
            String charSTR = String.valueOf(character);
            randomText = randomText.replace(charSTR, ""); // was => flapoeplksldfalafaaafoiwefafsa | became=>lapoeplksld...
            int charCounter = randomTextLen - randomText.length();  // 30 - 25 = 5  / 25 - 22 = 3

//            maxCounter = maxCounter > charCounter ? maxCounter : charCounter;// 5

            if (maxCounter < charCounter){
                maxCounter = charCounter;
                charToDisplay = charSTR;
            }
        }


        System.out.println("maxCounter = " + maxCounter);
        System.out.println("charToDisplay = " + charToDisplay);

    }
}
