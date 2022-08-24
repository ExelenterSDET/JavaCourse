package Day10.Practice.Saturday_Project_2_Tasks;

import java.util.Scanner;

public class Mustafa {
    public static void main(String[] args) {

         /*Given an int ,
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

        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Integer ==>");
        int age = scanner.nextInt();
        if (age <= 10){
            System.out.println("too young to create a Facebook account");
        }
        if (age <= 16){
            System.out.println("too young to get a driver's license");
        }
        if (age <= 16) {
            System.out.println("too young to get a tattoo");
        }
        if (age<=21){
        System.out.println("too young to drink alcohol");}
        if (age >21){
            System.out.println("Do whatever you do");
        }*/
        /*Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.*/
       /* System.out.print("check int if even or not ==>");
        int bl1 = scanner.nextInt();



        if (bl1 % 2 == 0){
            System.out.println("True");

        }
        if (bl1 %2 != 0){
            System.out.println("False");*/


        /*Given an int  ,
        if the int is 1 print Monday
        if the int is 2 print Tuesday
        if the int is 3 print Wednesday
        if the int is 4 print Thursday
        if the int is 5 print Friday
        if the int is 6 print Saturday
        if the int is 7 print Sunday
        if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."*/

        /*System.out.print("Enter an integer");
        int week = scanner.nextInt();

        if (week == 1){
            System.out.println("Monday");
        }

        if (week == 2){
            System.out.println("Tuesday");
        }
        if (week == 3){
            System.out.println("Wednesday");
        }
        if (week == 4){
            System.out.println("Thursday");
        }
        if (week == 5){
            System.out.println("Friday");
        }
        if (week == 6){
            System.out.println("Saturday");
        }
        if (week == 7){
            System.out.println("Sunday");
        }
        if (week >=8 || week <1){
            System.out.println("not a valid day");
        }
*/
        /*Given a int number
        -print "fizz" when given number is divisible by 5
                -print "buzz" when given number is divisible by 3
                -print "fizzbuzz" when given number is divisible by both 3 and 5
                -print same number if it is not divisible by 3 or 5
        Examples:
        input1 -> 10 | output1 -> fizz
        input2 -> 9  | output2 -> buzz
        input3 -> 30 | output3 -> fizzbuzz
        input4 -> 7  | output4 -> 7*/

        /*System.out.print("Enter an int");
        int num45 = scanner.nextInt();

        if (num45 % 5 == 0){
            System.out.println("fizz");
        }
        if (num45 % 3 == 0){
            System.out.println("buzz");
        }
        if (num45 % 5 == 0 && num45 % 3 == 0){
            System.out.println("fizzbuzz");
        }
        if (num45 % 5 !=0 || num45 % 3 != 0 ){
            System.out.println(num45);
        }*/
       /* Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
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


        /*        String fee = "$5 $6 $7";
        String fee1 = fee.substring(0 , 3);
        System.out.println("fee1 = " + fee1);
        String fee2 =fee.substring(3 , 6);
        System.out.println("fee2 = " + fee2);
        String fee3 = fee.substring(6);
        System.out.println("fee3 = " + fee3);

        String s = fee1.replaceAll(    "[^0-9]", "");
        String s1 = fee2.replaceAll("[^0-9]", "");
        String s2 = fee3.replaceAll("[^0-9]", "");

        int fnum = Integer.parseInt(s);
        int snum = Integer.parseInt(s1);
        int tnum = Integer.parseInt(s2);

        System.out.println(fnum + snum + tnum);*/

        /*Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"*/

       /* System.out.print("Enter the grade");
        String grade = scanner.nextLine();
        boolean isEqualsA = grade.equals("A");
        if(isEqualsA){
            System.out.print("Print the average");
            int avg = scanner.nextInt();
            if(avg >90){
                System.out.println("Congrats");
            }
            else{
                System.out.println("Invalid average");
            }
        }
        boolean isEqualsB = grade.equals("B");
        if (isEqualsB){
            System.out.println("You are good");
        }
        else {
            System.out.println("You need to work hard");
        }
*/
        /*Given a String ,
        if the number of the characters in the given String is odd then print true else print false*/

     /*   System.out.println("Enter an string" );
        String numofchar = scanner.nextLine();

        int length = numofchar.length();

        if (length %2 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }*/
        /*Given two Strings by using scanner class
        add the second string after the first one
                        If the first word ends with the same letter as the second word starts with, then remove it.
        Example: "abc", "cat" --> "abcat"
        "abc", "dog"  -->"abcdog"*/

       /* System.out.print("Enter first string");
        String word1 = scanner.nextLine();
        System.out.println("Enter second string");
        String word2 = scanner.nextLine();

        if(word1.charAt(word1.length() -1) == word2.charAt(0)){
            System.out.println(word1 + word2.substring(1));
        }*/
/*        Given a String and a number. Get the character at the given index with the String.
If number is greater then the length of the String, return 0*/
       /* System.out.print("enter a string");
        String word45 = scanner.nextLine();
        System.out.print("enter a number");
        int num46 = scanner.nextInt();

        if (word45.length()<num46){
            System.out.println("0");
        }
        else{
            System.out.println(word45.charAt(num46));
        }*/
        /*Given a String. If a given string contains only digits, return true. Else, return false*/

       /* System.out.println("Enter a string");
        String check = scanner.nextLine();

        if (check.matches("[0-9]+")){
            System.out.println("True");
        }
        else{

            System.out.println("false");
        }*/
        /*Create two Strings. If the first string contains second string,
        concat second string to the first string. else, concat first string to itself.*/

        /*System.out.println("first string");
        String firsts = scanner.nextLine();
        System.out.println("second string");
        String seconds = scanner.nextLine();

        if (firsts.contains(seconds)){
            System.out.println(seconds.concat(firsts));

        }
        else{
            System.out.println(firsts.concat(firsts));
        }*/

        /*Create two strings. Check if the strings contain any upper case letters.
                If strings contain capital letters, return the total count of capital letters for both strings.
        if, one of the strings only contains capital letters, return the count of all characters for that string.
        if none of the string contain capital letters, return 0
        Example
        Hello and World ==> output should be 2
        Hello and world ==> output should be 5
        hello and world ==> output should be 10*/

     /*   System.out.println("first string");
        String up1 = scanner.nextLine();
        System.out.println("second string");
        String up2 = scanner.nextLine();

        String s12 = up1.replaceAll("[^A-Z]", "");
        int ln1 = s12.length();
        String s13 = up2.replaceAll("[^A-Z]", "");
        int ln2 = s13.length();

        if(ln1 > 0 && ln2 > 0  ){
            System.out.println(ln1 + ln2);
        }
        if ((ln1 > 0 && ln2 ==0) || (ln1 == 0 && ln2 > 0)){
            System.out.println("" + ln1 + ln2 );
        }
        if(ln1 == 0 && ln2 == 0){
            System.out.println("0");
        }*/
       /* Create a string and a number. Convert number to char.
        if string contains char, return the character it self.
        if string doesnt contain char, return "Character doesnt exist in the string"*/

       /* System.out.println("string");
        String string = scanner.nextLine();
        System.out.println("number");
        int intg = scanner.nextInt();
        char intg1 = (char)intg;
        String c = String.valueOf(intg1);
        boolean contains = string.contains(c);

        if (contains){
            System.out.println(c);
        }
        else{
            System.out.println(*//*character is not in string*//*);
        }*/


    }

}
