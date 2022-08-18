package Day8.Practice.Mentoring;

public class Tasks_08_18_2022 {

    public static void main(String[] args) {
        //Task1: Write a Java program to get the character at the index 5
        // and last index within the String.

        String text = "Java Exercises for Mentoring Session";
//        char index5 = text.charAt(5);
//        System.out.println(index5);
//        char indexOfLastChar = text.charAt(text.length()-1);
//        System.out.println(indexOfLastChar);
//
//        //Task2: Write a Java program to check if String
//        // contains "mentor" regardless of Case Sensitivity.
//
//        boolean isMentorInTheText= text.toLowerCase().contains("mentor");
//        System.out.println(isMentorInTheText);
//
//        //Task3: Write a Java program to get the index
//        // of third character 'e' within the String.
//        int indexOfe1 = text.indexOf('e',13); //Bakhriddin
//        System.out.println("indexOfe1 = " + indexOfe1);
//
//        int indexOfFirstE = text.indexOf('e');
//        System.out.println(indexOfFirstE);
//
//        int indexOfSecondE = text.indexOf('e', ++indexOfFirstE);
//
//        System.out.println("indexOfSecondE = " + indexOfSecondE);
//
//        System.out.println("Third letter \'e\': " + text.indexOf('e', ++indexOfSecondE));
//
//        //Task4: Write a Java program to get the index
//        // of third last character 'i' within the String.
//
//        int indexOfLastI = text.lastIndexOf('i');
//        System.out.println(indexOfLastI);
//
//        int indexOfSecondIFromTheEnd = text.lastIndexOf('i', --indexOfLastI);
//        System.out.println("indexOfSecondIFromTheEnd = " + indexOfSecondIFromTheEnd);
//
//        int indexOfThirdIFromTheEnd = text.lastIndexOf('i', --indexOfSecondIFromTheEnd);
//        System.out.println("indexOfThirdIFromTheEnd = " + indexOfThirdIFromTheEnd);

        //Task5: Write a Java program to get each word
        // separately from the String in separate lines.
        //String text = "Java Exercises for Mentoring Session";

        String javaTxt = text.substring(0,text.indexOf(' '));
        System.out.println("javaTxt = " + javaTxt);


    }
}
