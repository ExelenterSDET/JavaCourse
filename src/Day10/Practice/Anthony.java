package Day10.Practice;

import java.util.Scanner;

public class Anthony {
    public static void main(String[] args) {


       /* Given an int ,
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

        System.out.println("-------------------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter i => ");
        int i = scan.nextInt();

        if(i<=10){
            System.out.println("TASK 1 = Too young to create a Facebook account");
        }
        if(i<=16){
            System.out.println("TASK 1 = Too young to get a driver's license");
        }
        if(i<=18){
            System.out.println("TASK 1 = Too young to get a tattoo");
        }
        if(i<=21){
            System.out.println("TASK 1 = Too young to drink alcohol");
        }
        if(i>21){
            System.out.println("TASK 1 = Do whatever you want to do");
        }

        System.out.println("-------------------------------------------------------------------------------------");

        //Given an int number. Check if the number is even or not
        //if the number is even print true
        //if the number is odd print false
        //result should be true or false.

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter an integer => ");
        int i1 = scan2.nextInt();
        boolean bl1 = true;

        if(i1 % 2 == 0){
            System.out.println("TASK 2 = Even Number = " +bl1);
        }
        if(i1 % 2 == 1){
            System.out.println("TASK 2 = Odd Number = " + !bl1);
        }

        System.out.println("-------------------------------------------------------------------------------------");

        //Given an int  ,
        //if the int is 1 print Monday
        //if the int is 2 print Tuesday
        // if the int is 3 print Wednesday
        //if the int is 4 print Thursday
        //if the int is 5 print Friday
        // if the int is 6 print Saturday
        // if the int is 7 print Sunday
        // if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter an integer => ");
        int i2 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i3 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i4 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i5 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i6 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i7 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i8 = scan3.nextInt();
        System.out.print("Enter an integer => ");
        int i9 = scan3.nextInt();

        if(i2 == 1 || i4== 1 || i5 == 1 || i6 == 1 || i7== 1 || i8 == 1 || i3 == 1 || i9 == 1){
            System.out.println("TASK 3 = Monday");
        }
        if(i2 == 2 || i4== 2 || i5 == 2 || i6 == 2 || i7== 2 || i8 == 2 || i3 == 2 || i9 == 2){
            System.out.println("TASK 3 = Tuesday");
        }
        if(i2 == 3 || i4== 3 || i5 == 3 || i6 == 3 || i7== 3 || i8 == 3 || i3 == 3 || i9 == 3){
            System.out.println("TASK 3 = Wednesday");
        }
        if(i2 == 4 || i4== 4 || i5 == 4 || i6 == 4 || i7== 4 || i8 == 4 || i3 == 4 || i9 == 4){
            System.out.println("TASK 3 = Thursday");
        }
        if(i2 == 5 || i4== 5 || i5 == 5 || i6 == 5 || i7== 5 || i8 == 5 || i3 == 5 || i9 == 5){
            System.out.println("TASK 3 = Friday");
        }
        if(i2 == 6 || i4== 6 || i5 == 6 || i6 == 6 || i7== 6 || i8 == 6 || i3 == 6 || i9 == 6){
            System.out.println("TASK 3 = Saturday");
        }
        if(i2 == 7 || i4== 7 || i5 == 7 || i6 == 7 || i7== 7 || i8 == 7 || i3 == 7 || i9 == 7){
            System.out.println("TASK 3 = Sunday");
        }
        if(i2 >= 8 || i2 == 0 ||
                i3 >= 8 || i3 == 0 ||
                i4 >= 8 || i4 == 0 ||
                i5 >= 8 || i5 == 0 ||
                i6 >= 8 || i6 == 0 ||
                i7 >= 8 || i7 == 0 ||
                i8 >= 8 || i8 == 0 ||
                i9 >= 8 || i9 == 0 )
        {
            System.out.println("TASK 3 = This not a valid day");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        //Given a int number
        //-print "fizz" when given number is divisible by 5
        // -print "buzz" when given number is divisible by 3
        //  -print "fizzbuzz" when given number is divisible by both 3 and 5
        //  -print same number if it is not divisible by 3 or 5
        // Examples:
        //input1 -> 10 | output1 -> fizz
        //input2 -> 9  | output2 -> buzz
        //input3 -> 30 | output3 -> fizzbuzz
        //input4 -> 7  | output4 -> 7


        Scanner scan4 = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int int1 = scan4.nextInt();

        if (int1%5==0 && int1%3!=0){
            System.out.println("TASK 4 = fizz ");
        }
        if (int1%3==0 && int1%5!=0) {
            System.out.println("TASK 4 = buzz " );
        }
        if (int1%5==0 && int1%3==0) {
            System.out.println("TASK 4 = fizzbuzz");
        }
        if (int1%5!=0 && int1%3!=0) {
            System.out.println("TASK 4 = same number");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        //Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        // i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        //remove all the non-numeric characters.
        //         parse the Strings to int
        // and print the total
        // Example:
        // String num1 = "$15";
        // String num2 = "$20";
        // String num3 = "$30";
        // output should be ==> 65;
        // NOTE : if the output is less than 0 change the output to -1


        Scanner scan5 = new Scanner(System.in);
        System.out.print("String1 => ");
        String String1 = scan5.nextLine();
        System.out.print("String2 => ");
        String String2 = scan5.nextLine();
        System.out.print("String3 => ");
        String String3 = scan5.nextLine();

        String x = "$15";
        String y = "$20";
        String z = "$30";

        String x1 = x.replaceAll("[$]","");
        int a = Integer.parseInt(x1);

        String y1 = y.replaceAll("[$]","");
        int b = Integer.parseInt(y1);

        String z1 = z.replaceAll("[$]","");
        int c = Integer.parseInt(z1);

        int sumOfNumbers = ((a+b+c));

        System.out.println("TASK 5 - SUM OF STRINGS = "+ (sumOfNumbers)+"\n");
        System.out.println("-------------------------------------------------------------------------------------");
       /*
        Task6

        Given a String (grade)
        if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
        if grade is "B" print "You're good"
        else (meaning if not "A" or "B") print "You need to work hard"
            */


        Scanner scan6=new Scanner(System.in);

        System.out.println("Please Print your letter Grade");
        String grade = scan6.nextLine();

        if(grade.equalsIgnoreCase("A")) {
            System.out.println("What is your average");
            int average = scan6.nextInt();
            if (average >= 90) {
                System.out.println("TASK 6 = Congrats");
            } else {
                System.out.println("TASK 6 = Invalid Average");
            }
        }

        else if (grade.equalsIgnoreCase("B")){
            System.out.println("TASK 6 = You're doing good");
        }
        else{
            System.out.println(" TASK 6 = You need to work Harder!");
        }
        /*

        Scanner scan6 = new Scanner(System.in);
        System.out.print("Grade => ");
        String strScan6 = scan6.nextLine();
        System.out.print("Average => ");
        String strScan7 = scan6.nextLine();


        String a = "90%";
        String b = "80%";
        String c = "70%";

        String a1 = a.replaceAll("[%]","");
        int int1 = Integer.parseInt(a1);
        String b1 = b.replaceAll("[%]","");
        int int2 = Integer.parseInt(b1);
        String c1 = c.replaceAll("[%]","");
        int int3 = Integer.parseInt(c1);

        int a8 = ((int1+int2+int3)/3);
        System.out.println("Task 6 = Invalid average = " + (a8 > 100));
        System.out.println("TASK 6 = Congrats = " + (a8 > 90));
        System.out.println("TASK 6 = You're Good = " + (a8 > 80));
        System.out.println("TASK 6 = You need to work Hard = " + (a8 <= 70));

         */
        System.out.println("-------------------------------------------------------------------------------------");
        /*Task7
        Given a String ,
            if the number of the characters in the given String is odd then print true else print false
         */

        Scanner scan7 = new Scanner(System.in);

        System.out.print("String => ");
        String str123 = scan7.nextLine();
        int length = str123.length();

        if (length %2==0){
            System.out.println("TASK 7 - FALSE");
        }
        else{
            System.out.println("TASK 7 - TRUE ");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /*Task8

        Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */

        Scanner scan8 = new Scanner(System.in);
        System.out.print("Please enter first String => ");
        String str456 = scan8.nextLine();
        System.out.print("Please enter second String => ");
        String str789 = scan8.nextLine();

        int new456 = str456.length();
        int new789 = str789.length();


        char first = str456.charAt(new456-1);
        char second =str789.charAt(0);
        char three = str789.charAt(1);
        char four =str789.charAt(2);

        if(first==second){
            System.out.println("TASK 8 = first word ends with the same letter as the second = " +str456+three+four);
        }
        else{
            System.out.println("TASK 8 = " +str456+str789);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /*Task9

        Given a String and a number. Get the character at the given index with the String. If number is greater then the length of the String, return 0

         */

        Scanner scan9 = new Scanner(System.in);
        System.out.println("Please enter String => ");
        String s1000 = scan9.nextLine();
        System.out.println("Enter an integer => ");
        int i1000 = scan9.nextInt();

        if(i1000 < s1000.length()){
            char s1000Num = s1000.charAt(i1000);
            System.out.println("TASK 9 = "+s1000Num);
        }
        else {
            System.out.println("TASK 9 = Zero");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /* Task 10
        Given a String. If a given string contains only digits, return true. Else, return false
         */


        Scanner scan10 = new Scanner(System.in);
        System.out.print("Given a string =");
        String givenAString = scan10.nextLine();

        if (givenAString.matches("[0-9]+")) {
            System.out.println("TASK 10 = TRUE");
        } else {
            System.out.println("TASK 10 = FALSE");
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /*
        Task 11
        Create two Strings. If the first string contains second string, concat second string to the first string. else, concat first string to itself.
         */

        Scanner scan11 = new Scanner(System.in);
        System.out.print("String 1 => ");
        String numberOne1 = scan11.nextLine();
        System.out.print("String 2 => ");
        String numberTwo2 = scan11.nextLine();

        if(numberOne1.contains(numberTwo2)){
            System.out.println("TASK 11 = " +numberTwo2.concat(numberOne1));
        }
        else {
            System.out.println("TASK 11 = " +numberOne1.concat(numberOne1));
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /* Task12

            Create two strings. Check if the strings contain any upper case letters.
                If strings contain capital letters, return the total count of capital letters for both strings.
                 if, one of the strings only contains capital letters, return the count of all characters for that string.
                if none of the string contain capital letters, return 0
            Example
            Hello and World ==> output should be 2
            Hello and world ==> output should be 5
            hello and world ==> output should be 10
         */

        Scanner scan12 = new Scanner(System.in);
        System.out.print("Insert new String 1 =>");
        String string12 = scan12.nextLine();
        System.out.print("Insert new String 2 =>");
        String string13 = scan12.nextLine();

        String upperCase = string12.replaceAll("[^A-Z]","");
        String upperCase2 = string13.replaceAll("[^A-Z]","");


        if (upperCase.length() > 0 && upperCase2.length() > 0){
            System.out.println("TASK 12 = " +upperCase.length() + upperCase2.length());
        }

        if (upperCase.length() == 0 && upperCase2.length() > 0 ) {
            System.out.println("TASK 12 =" + string12.length());
        }


        System.out.println("-------------------------------------------------------------------------------------");
        /*
        Task 13

             Create a string and a number. Convert number to char.
              if string contains char, return the character it self.
               if string doesnt contain char, return "Character doesnt exist in the string"
         */

        Scanner scan13 = new Scanner(System.in);
        System.out.print(" Please enter String => ");
        String str13 = scan13.nextLine();
        System.out.println(" Please enter integer =>");
        int int13 = scan13.nextInt();
        char char13 = Integer.toString(int13).charAt(0);

        System.out.println(char13);

        if(str13.matches("[0-9]+")){
            System.out.println("TASK 13 = Character does not exist in String");
        }
        else{
            System.out.println("TASK 13 = "+ str13);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        /*
        Task 14
            Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
            if string doesnt have a space, return the string itself.
            if string has a space, get two words to the left from the space and to the right from the space. validate which word is the longest and print it.
            if words have equal length, return the whole string.
            Example:
            Hello World = Hello = 5, World = 5 Output should be "Hello World"
            Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
         */
        Scanner scan14 = new Scanner(System.in);
        System.out.println("Create a string => ");
        String str14 = scan14.nextLine();

        if(!str14.contains(" ")){
            System.out.println("TASK 14 = return itself"+str14);
        }
        if(str14.contains(" ")){
            int spaceIndex = str14.indexOf(' ');
            String firstWord = str14.substring(0,spaceIndex);
            String secondWord = str14.substring(++spaceIndex);

            if (firstWord.length()> secondWord.length()){
                int firstWordLength = firstWord.length();
                System.out.println("TASK 14 = "+firstWord+ "=" +firstWordLength);

            }
            if (firstWord.length() < secondWord.length()){
                int secondWordLength = secondWord.length();
                System.out.println("TASK 14 = "+firstWord +secondWordLength);
            }
            if (firstWord.length() == secondWord.length()){

                System.out.println("TASK 14 = " +str14);
            }
        }

    }
}
