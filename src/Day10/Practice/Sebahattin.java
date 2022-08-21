package Day10.Practice;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Sebahattin {
    public static void main(String[] args) {
/*       Task 1
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
        print "do whatever you want to do"
*/
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Task 1 / Age");
        System.out.print("Enter your age = ");
        int age = scan.nextInt();

        if (age < 10){
            System.out.println("Too young to create a Facebook account");
        }
        if (age < 16) {
            System.out.println("Too young to get a driver's license");
        }
        if (age < 18) {
            System.out.println("Too young to get a tattoo");
        }
        if (age <= 21) {
            System.out.println("Too young to drink alcohol");
        }
        if (age > 21) {
            System.out.println("Do whatever you want to do");
        }
        System.out.println("-------------------------------");
/*      Task 2
        Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
 */
        System.out.println("Task 2 / Check if the number is even or not");
        System.out.print("Enter number = ");
        int num = scan.nextInt();

        if (num%2 == 0){
            System.out.println("True");
        }
        if (num%2 != 0){
            System.out.println("False");
        }
        System.out.println("-------------------------------");
/*      Task 3
        Given an int  ,
        if the int is 1 print Monday
        if the int is 2 print Tuesday
        if the int is 3 print Wednesday
        if the int is 4 print Thursday
        if the int is 5 print Friday
        if the int is 6 print Saturday
        if the int is 7 print Sunday
        if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
*/
        System.out.println("Task 3 / Which day");
        System.out.print("Enter number = ");
        int i = scan.nextInt();

        if (i == 1){
            System.out.println("Monday");
        }
        if (i == 2) {
            System.out.println("Tuesday");
        }
        if (i == 3) {
            System.out.println("Wednesday");
        }
        if (i == 4) {
            System.out.println("Thursday");
        }
        if (i == 5) {
            System.out.println("Friday");
        }
        if (i == 6) {
            System.out.println("Saturday");
        }
        if (i == 7) {
            System.out.println("Sunday");
        }
        if (i<1 || i>=8) {
            System.out.println("This is not a valid day.");
        }
        System.out.println("-------------------------------");
/*      Task 4
            Given a int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5
            Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
 */
        System.out.println("Task 4 / Is it divisible by 3 and by 5.");
        System.out.print("Enter number = ");
        int div = scan.nextInt();

        if (div%3!=0 && div%5==0 && div!=0){
            System.out.println("fizz");
        }
        if (div%3==0 && div%5!=0 && div!=0) {
            System.out.println("buzz");
        }
        if (div%3==0 && div%5==0 && div!=0) {
            System.out.println("fizzbuzz");
        }
        if ((div%3!=0 && div%5!=0) || div==0) {
            System.out.println("Is not divisible "+div);
        }
        System.out.println("-------------------------------");
/*      Task 5
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
        NOTE : if the output is less than 0 change the output to -1
 */
        System.out.println("Task 5");
        System.out.print("Enter three positive numbers as a String with spaces between the numbers = ");
        String entry = input.nextLine();
        String[] s = entry.split(" ");
        String x = s[0];
        String y = s[1];
        String z = s[2];
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int k = Integer.parseInt(x.replaceAll("[^\\d-]", ""));
        int l = Integer.parseInt(y.replaceAll("[^\\d-]", ""));
        int m = Integer.parseInt(z.replaceAll("[^\\d-]", ""));
        int t = k+l+m;
        if (t > 0) {
            System.out.println("Total = " + (k + l + m));
        }
        if (t < 0){
            System.out.println("-1");
        }
        System.out.println("-------------------------------");
/*      Task 6
        Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"
 */
        System.out.println("Task 6 / Grade");
        System.out.print("Enter grade = ");
        char grade = scan.next().charAt(0);
        char A = 'A';
        char B = 'B';

        if (grade == A){
            System.out.print("enter average = ");
            int average = scan.nextInt();

            if (average > 90 ){
                System.out.println("Congrats");
            }
            else{
                System.out.println("Invalid average");
            }
        }
        if (grade == B){
            System.out.println("You're good");
        }
        if (grade != A && grade != B ){
            System.out.println("You need to work hard");
        }
        System.out.println("-------------------------------");
 /*     Task 7
            Given a String ,
            if the number of the characters in the given String is odd then print true else print false
 */
        System.out.println("Task 7 / Is the number of characters in the string odd or even?");
        System.out.print("Enter numbers in the string with spaces = ");
        String number = input.nextLine();
        String[] newStr = number.split(" ");
        int newLength = newStr.length;
        System.out.println("Number of the characters = "+newLength);

        if (newLength%2 != 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("-------------------------------");
/*      Task 8
            Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
 */
        System.out.println("Task 8 / The last letter of the first word, the first letter of the second word");
        System.out.print("Enter string 1 = ");
        String string1 = input.nextLine();
        System.out.print("Enter string 2 = ");
        String string2 = input.nextLine();

        int lengthStr1 = string1.length();
        char ch1 = string1.charAt(lengthStr1-1);
        char ch2 = string2.charAt(0);
        int lengthStr2 = string2.length();

        if (ch1 == ch2){
            System.out.println(string1.concat(string2.substring(1,lengthStr2)));
        }
        if (ch1 != ch2){
            System.out.println(string1.concat(string2));
        }
        System.out.println("-------------------------------");
/*      Task 9 --- ****** I didn't understand ****** ---
        Given a String and a number. Get the character at the given index
        with the String. If number is greater then the length of the String,
        return 0
 */
        System.out.println("Task 9 / Given a String and a number.");
        System.out.print("Enter string = ");
        String indx = input.nextLine();
        System.out.print("Enter number = ");
        int numA = scan.nextInt();
        int inLength = indx.length();

        if (numA < inLength){
            char nexChar = indx.charAt(numA);
            System.out.println("Character = "+ nexChar);
        }
        if (numA >= inLength){
            System.out.println(0);
        }
        System.out.println("-------------------------------");

/*      Task 10
        Given a String.
        If a given string contains only digits, return true. Else, return false
 */
        System.out.println("Task 10 / Is there a digit");
        System.out.print("Enter string = ");
        String contain = input.nextLine();
        String digit = contain.replaceAll("[^\\d]","");

        if (contain.length() == digit.length()){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("-------------------------------");
/*      Task 11
        Create two Strings.
        If the first string contains second string, concat second string to the first string.
        Else, concat first string to itself.
 */
        System.out.println("Task 11 / Is it in the string?");
        System.out.print("Enter string 1= ");
        String firstStr = input.nextLine();
        System.out.print("Enter string 2= ");
        String secondStr = input.nextLine();

        if (secondStr.contains(firstStr)){
            //      System.out.println(firstStr.concat(secondStr));
            System.out.println(secondStr+" "+firstStr);
        }
        else {
            //      System.out.println(firstStr.concat(firstStr));
            System.out.println(firstStr+" "+firstStr);
        }
        System.out.println("-------------------------------");
/*      Task 12
        Create two strings. Check if the strings contain any upper case letters.
        If strings contain capital letters, return the total count of capital letters for both strings.
        if, one of the strings only contains capital letters, return the count of all characters for that string.
        if none of the string contain capital letters, return 0
        Example
        Hello and World ==> output should be 2
        Hello and world ==> output should be 5
        hello and world ==> output should be 10
 */
        System.out.println("Task 12 / Number of capital letters");
        System.out.print("Enter string 1= ");
        String capStr1 = input.nextLine();
        System.out.print("Enter string 2= ");
        String capStr2 = input.nextLine();

        String repcapStr1 = capStr1.replaceAll("[^A-Z]", "");
        int intcapStr1 = repcapStr1.length();
        String repcapStr2 = capStr2.replaceAll("[^A-Z]", "");
        int intcapStr2 = repcapStr2.length();

        if (intcapStr1 > 0 && intcapStr2 > 0){
            System.out.println("Total number of capital letters = "+(intcapStr1+intcapStr2));
        }
        if (intcapStr1 > 0 && intcapStr2 == 0){
            System.out.println("1. String length = "+capStr1.length());
        }
        if (intcapStr2 > 0 && intcapStr1 == 0) {
            System.out.println("2. String length = "+capStr2.length());
        }
        if (intcapStr1 == 0 && intcapStr2 == 0){
            System.out.println("Strings do not contain capital letters = "+"\""+0+"\"");
        }
        System.out.println("-------------------------------");
/*      Task 13
        Create a string and a number. Convert number to char.
        if string contains char, return the character it self.
        if string doesnt contain char, return "Character doesnt exist in the string"
*/
        System.out.println("Task 13 / Searching for characters in a String");
        System.out.print("Enter string = ");
        String word = input.nextLine();
        System.out.print("enter character number = ");
        int nbr = scan.nextInt();
        char ch = (char) nbr;
        String strCh = String.valueOf(ch);
        boolean in = word.contains(strCh);

        if (in){
            System.out.println("There are characters in the string. = "+ch);
        }
        if (!in) {
            System.out.println("There are no characters in the string.");
        }
        System.out.println("-------------------------------");
/*      Task 14
        Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
        if string doesnt have a space, return the string itself.
        if string has a space, get two words to the left from the space and to the right from the space.
            Validate which word is the longest and print it.
        if words have equal length, return the whole string.
        Example:
        Hello World = Hello = 5, World = 5 Output should be "Hello World"
        Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
 */
        System.out.println("Task 14 / Verifies if a string contains spaces and prints the long word");
        System.out.print("Enter string = ");
        String wrd = input.nextLine();

        boolean wrdCont = wrd.contains(" ");

        if (!wrdCont){
            System.out.println(wrd);
        }
        if ( wrdCont){
            String[] wrdStr = wrd.split(" ");
            String oneStr = wrdStr[0];
            String twoStr = wrdStr[1];

            int lengthOneStr = oneStr.length();
            int lengthTwoStr = twoStr.length();

            if (lengthOneStr > lengthTwoStr){
                System.out.println(oneStr);
            }
            if (lengthTwoStr > lengthOneStr){
                System.out.println(twoStr);
            }
            if (lengthOneStr == lengthTwoStr){
                System.out.println(wrd);
            }
        }

    }
}
