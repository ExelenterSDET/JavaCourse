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

            char randomLowerCase = (char) rnd.nextInt(97, 123);
            randomText += randomLowerCase;
            index++;
        }
        System.out.println("randomText = " + randomText);

        int maxCounter = 0;

        while (randomText.length() > 0){
            int randomTextLen = randomText.length();
            String character = String.valueOf(randomText.charAt(0));
            randomText = randomText.replace(character, "");
            int charCounter = randomTextLen - randomText.length();

            maxCounter = maxCounter > charCounter ? maxCounter : charCounter;
        }
        System.out.println("maxCounter = " + maxCounter);
    }
}
