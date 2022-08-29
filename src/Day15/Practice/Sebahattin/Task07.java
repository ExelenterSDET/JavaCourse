package Day15.Practice.Sebahattin;

public class Task07 {
    public static void main(String[] args) {
/*      Create random string, which has a length of 30 and all characters are lower case letters.
        return a count of the most repeated character.
        Example: flapoeplksldfalafaaafoiwefafsa === output should be 8, since a is the most repeated.
*/
        //Task7
        int num;
        int total=0;
        int index = 0;
        String str= "flapoeplksldfalafaaafoiwefafsa";
        for (int i = 0; i < str.length(); i++) {
            num=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) num++;
            }
            if(num>total) {
                total = num;
                index = i;
            }
        }
        System.out.println("Most used letter: "+str.charAt(index));
        System.out.println("Number of repetitions of the letter: "+total);
    }
}
