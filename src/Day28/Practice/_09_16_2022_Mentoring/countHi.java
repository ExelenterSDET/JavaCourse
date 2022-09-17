package Day28.Practice._09_16_2022_Mentoring;

public class countHi {

    public static int countHi(String str){
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            counter += str.substring(i, i+2).equals("hi") ? 1 : 0;  // klsdjfk hi ksljf;klAhi
        }
        return counter;
    }
}
