package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Malika_SaturdayProject2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*Task1
        Given an int ,
        if the age is less than or equal 10
        print "too young to create a Facebook account"
        if the age is less than or equal 16
        print "too young to get a driver's license"
        if the age is less than or equal 18
        print "too young to get a tattoo"
        if the age is less than or equal 21
        print "too young to drink alcohol"
        if the age bigger than 21
        print "do whatever you want to do"*/

        System.out.println("***** Task1 *****");
        System.out.print("- Enter your age: ");

        int Facebook = scan.nextInt();
        scan.nextLine();
        if (Facebook<=10){
            System.out.println("===>>> Too young to create a Facebook account");
        }
        System.out.print("- Enter your age: ");
        int DLicense = scan.nextInt();
        scan.nextLine();
        if (DLicense<=16){
            System.out.println("===>>> Too young to get a driver's license");
        }
        System.out.print("- Enter your age: ");
        int Tattoo = scan.nextInt();
        scan.nextLine();
        if (Tattoo<18 || Tattoo==18){
            System.out.println("===>>> Too young to get a tattoo");
        }
        System.out.print("- Enter your age: ");
        int Alcohol = scan.nextInt();
        scan.nextLine();
        if (Alcohol<=21){
            System.out.println("===>>> Too young to drink alcohol");
        }
        System.out.print("- Enter your age: ");
        int DoWhateverYouWant = scan.nextInt();
        scan.nextLine();
        if (DoWhateverYouWant>21){
            System.out.println("===>>> Do whatever you want to do");
        }

        /*Task2
        Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.*/

        System.out.println(" ");
        System.out.println("***** Task2 *****");

        System.out.print("Enter number: ");
        int i = scan.nextInt();
        scan.nextLine();
        if (i %2 == 0){
            System.out.println("True");
        }
        if (i %2!=0){
            System.out.println("False");
        }

        /*Task3
        Given an int  ,
        if the int is 1 print Monday
        if the int is 2 print Tuesday
        if the int is 3 print Wednesday
        if the int is 4 print Thursday
        if the int is 5 print Friday
        if the int is 6 print Saturday
        if the int is 7 print Sunday
        if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."*/

        System.out.println(" ");
        System.out.println("***** Task3 *****");

        System.out.print("Enter number from 1 to 7: ");
        int number = scan.nextInt();
        if (number==1){
            System.out.println("===>>> Monday");
        }
        if (number==2){
            System.out.println("===>>> Tuesday");
        }
        if (number==3){
            System.out.println("===>>> Wednesday");
        }
        if (number==4){
            System.out.println("===>>> Thursday");
        }
        if (number==5){
            System.out.println("===>>> Friday");
        }
        if (number==6){
            System.out.println("===>>> Saturday");
        }
        if (number==7){
            System.out.println("===>>> Sunday");
        }
        if (number>=8 || number<1){
            System.out.println("===>>> This is not a valid day.");
        }

        /*Task4
        Given an int number
        -print "fizz" when given number is divisible by 5
        -print "buzz" when given number is divisible by 3
        -print "fizzbuzz" when given number is divisible by both 3 and 5
        -print same number if it is not divisible by 3 or 5
        Examples:
        input1 -> 10 | output1 -> fizz
        input2 -> 9  | output2 -> buzz
        input3 -> 30 | output3 -> fizzbuzz
        input4 -> 7  | output4 -> 7*/
        System.out.println(" ");
        System.out.println("***** Task4 *****");

        System.out.print("Enter any number: ");
        int num = scan.nextInt();
        scan.nextLine();
        if (num%5==0 && num%3!=0){
            System.out.println("fizz");
        }
        if (num%3==0 && num%5!=0){
            System.out.println("buzz");
        }
        if (num%3==0 && num%5==0){
            System.out.println("fizzbuzz");
        }
        if (num%3!=0 && num%5!=0){
            System.out.println("===>>>" + num);
        }

        /*Task5
        Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        remove all the non-numeric characters.
                parse the Strings to int
        and print the total
        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;
        NOTE : if the output is less than 0 change the output to -1*/

        System.out.println(" ");
        System.out.println("***** Task5 *****");

        System.out.print("Enter three positive numbers as a String\n with a space between numbers beginning with a symbol or a letter ");
        String str5 = scan.nextLine();

        int total = 0, space1 = 0, space2 = 0;

        String num1 = str5.replaceAll("[^\\d- ]", "");
        System.out.println(num1);

        space1 = num1.indexOf(" ");
        space2 = num1.lastIndexOf(" ");

        String n1Substring = num1.substring(0,space1);
        System.out.println(n1Substring);

        String n2Substring = num1.substring(++space1, space2);
        System.out.println(n2Substring);

        String n3Substring = num1.substring(++space2);
        System.out.println(n3Substring);

        total = Integer.parseInt(n1Substring) + Integer.parseInt(n2Substring) + Integer.parseInt(n3Substring);

        if (total<0){
            System.out.println(-1);
        } else {
            System.out.println(total);
        }


        /*Task6
        Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"*/
        System.out.println(" ");
        System.out.println("***** Task6 *****");

        System.out.print("Your grade: ");
        String Grade = scan.nextLine();
        if (Grade.contains("A")) {
            System.out.print("Enter your average: ");
        }
        int Average = scan.nextInt();
        scan.nextLine();
        if (Average>90){
            System.out.println("Congrats");
        }

        if (Average<=90){
            System.out.println("Invalid average");
        }
        if (Grade.contains("B")){
            System.out.println("You're good");
        }
        if (!Grade.contains("A") && !Grade.contains("B")){
            System.out.println("You need to work hard");
        }


        /*Task7
        Given a String ,
        if the number of the characters in the given String is odd then print true else print false*/
        System.out.println(" ");
        System.out.println("***** Task7 *****");

        System.out.print("Type something: ");
        String x = scan.nextLine();
        int length = x.length();
        if (length%2!=0){
            System.out.println("True");
        }
        else System.out.println("False");

        /*Task8
        Given two Strings by using scanner class
        add the second string after the first one
                        If the first word ends with the same letter as the second word starts with, then remove it.
        Example: "abc", "cat" --> "abcat"
        "abc", "dog"  -->"abcdog"*/
        System.out.println(" ");
        System.out.println("***** Task8 *****");

        System.out.print("Text A: ");
        String TextA = scan.nextLine();
        System.out.print("Text B: ");
        String TextB = scan.nextLine();

        char charAt = TextA.charAt(TextA.length() - 1);

        if (TextB.charAt(0)==TextA.charAt(TextA.length()-1)){
            System.out.println(TextA.substring(0,TextA.length()-1).concat(TextB));
        }
        if (TextB.charAt(0)!=TextA.charAt(TextA.length()-1)){
            System.out.println(TextA.concat(TextB));
        }

        /*Task9
        Given a String and a number. Get the character at the given index with the String.
        If number is greater than the length of the String, return 0*/

        System.out.println(" ");
        System.out.println("***** Task9 *****");

        System.out.print("String: ");
        String String9 = scan.nextLine();
        System.out.print("Number: ");
        int Number9 = scan.nextInt();
        scan.nextLine();

        if (Number9 > String9.length()){
            System.out.println("0");
        }
        if (Number9<=String9.length() && Number9>0){
            System.out.println(String9.charAt(Number9-1));
        }

        /*Task10
        Given a String. If a given string contains only digits, return true. Else, return false*/

        System.out.println(" ");
        System.out.println("***** Task10 *****");

        System.out.print("Enter Text1: "); //===>>> This approach is from Google
        char value1 = scan.nextLine().toCharArray()[0];
        boolean check1 = Character.isDigit(value1);
        if(check1){
            System.out.print("True\n");
        }
        else{
            System.out.print("False\n");
        }

        System.out.print("Enter Text2:");
        Scanner s10 = new Scanner(System.in);
        char value2 = s10.nextLine().toCharArray()[0];
        boolean check2 = Character.isDigit(value2);
        if(check2){
            System.out.print("True\n");
        }
        else{
            System.out.print("False\n");
        }
        System.out.println("===>>> Second Approach by AbduHamid: ");

        System.out.print("Enter text: ");
        String str11 = scan.nextLine();

        String onlyDigits = str11.replaceAll("[^\\d]", "");

        if (str11.equals(onlyDigits)){
            System.out.println(true);
        }
        if (!str11.equals(onlyDigits)){
            System.out.println(false);
        }


        /*Task11
        Create two Strings. If the first string contains second string, concat second string to the first string.
        Else, concat first string to itself.*/

        System.out.println(" ");
        System.out.println("***** Task11 *****");

        System.out.print("Enter 1st Text: ");
        String Str1 = scan.nextLine();
        System.out.print("Enter 2nd Text: ");
        String Str2 = scan.nextLine();

        if (Str1.contains(Str2)) {
            System.out.println(Str1.concat(Str2));

        } else{

            System.out.println(Str1.concat(Str1));
        }

        /*Task12
        Create two strings. Check if the strings contain any upper case letters.
                If strings contain capital letters, return the total count of capital letters for both strings.
        if, one of the strings only contains capital letters, return the count of all characters for that string.
        if none of the string contain capital letters, return 0
        Example
        Hello and World ==> output should be 2
        Hello and world ==> output should be 5
        hello and world ==> output should be 10*/

        System.out.println(" ");
        System.out.println("***** Task12 *****");

        System.out.print("Enter Text1: ");
        String FirstString = scan.nextLine();
        System.out.print("Enter Text2:");
        String SecondString = scan.nextLine();

        String str1Capitals = FirstString.replaceAll("[^A-Z]", "");
        String str2Capitals = SecondString.replaceAll("[^A-Z]", "");

        if (str1Capitals.length() > 0 && str2Capitals.length() > 0) {
            System.out.println(str1Capitals.length() + str2Capitals.length());
        }
        if (str1Capitals.length() > 0 && str2Capitals.length() == 0) {
            System.out.println(FirstString.length());
        }
        if (str1Capitals.length() == 0 && str2Capitals.length() > 0) {
            System.out.println(SecondString.length());
        }
        if (str1Capitals.length() == 0 && str2Capitals.length() == 0) {
            System.out.println(0);
        }

        /*Task13
        Create a string and a number. Convert number to char.
        if string contains char, return the character itself.
        if string doesn't contain char, return "Character doesn't exist in the string"*/

        System.out.println(" ");
        System.out.println("***** Task13 *****");

        System.out.print("Enter any text: ");
        String str13 = scan.nextLine();

        System.out.print("Enter any positive number: ");
        int anynumber = scan.nextInt();
        scan.nextLine();

        char numberToChar13 = (char) anynumber;
        String charToString13 = String.valueOf(numberToChar13);

        if (str13.contains(charToString13)) {
            System.out.println(numberToChar13);
        }

        if (!str13.contains(String.valueOf(numberToChar13))) {
            System.out.println("Character doesn't exist in the string");
        }

        /*Task14
        Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
        if string doesn't have a space, return the string itself.
        if string has a space, get two words to the left from the space and to the right from the space.
         validate which word is the longest and print it.
        if words have equal length, return the whole string.
        Example:
        Hello World = Hello = 5, World = 5 Output should be "Hello World"
        Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"*/

        System.out.println(" ");
        System.out.println("***** Task14 *****");

        System.out.print("Enter your text: ");
        String str14 = scan.nextLine();

        if (!str14.contains(" ")) {
            System.out.println(str14);
        }
        if (str14.contains(" ")) {

            int spaceIndex = str14.indexOf(' ');
            String firstText = str14.substring(0, spaceIndex);
            String secondText = str14.substring(++spaceIndex);

            if (firstText.length() > secondText.length()) {
                System.out.println(firstText);
            }
            if (firstText.length() < secondText.length()) {
                System.out.println(secondText);
            }
            if (firstText.length() == secondText.length()) {
                System.out.println(str14);
            }

        }
}
    }
