package Day6.Practice;

public class Dilnoza {
    public static void main(String[] args) {
        // create 3 strings and using concat print USA
        String str1 = "The ";
        String str2 = "United ";
        String str3 = "States ";
        String str4 = "of ";
        String str5 = "America";

        System.out.println(str1.concat(str2).concat(str3).concat(str4).concat(str5));
        System.out.println(str1 + str2 + str3 + str4 + str5);


        //String.length() print your full name using .length() method


        String fullName = "Dilnoza Khalilova";
        int fullNameLength = fullName.length();
        System.out.println(fullNameLength);

        String practiceSample = "I love practicing Java";
        int sentenceLength = practiceSample.length();
        System.out.println(sentenceLength);


        String practiceAgain = " I am just typing here to check the lengths of my sentence";
        int lengthPracticeAgain = practiceAgain.length();
        System.out.println(lengthPracticeAgain);



    }
}
