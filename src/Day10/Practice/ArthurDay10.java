package Day10.Practice;

public class ArthurDay10 {
    /*
    public static void main(String[] args) {

        System.out.println("please input your age");

        Scanner scan = new Scanner(System.in);
        int age =scan.nextInt();

        if (age<=10){
            System.out.println("You are too young to create a facebook account");
        }
        if (age<=16){
            System.out.println("You are too young to get a drivers licensed");
        }

        if (age<=18){
            System.out.println("You are too young to drink alcohol");
        }

        if (age<=21){
            System.out.println("You are too young to create a facebook account");
        }

        if (age>21){
            System.out.println("Do whatever you like");
        }




    }

 */
/*Given a int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5

 */
/*
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Iout a number");
    int inputNum = scan.nextInt();

    if (inputNum % 2 == 0) {
        System.out.println("true");
    }
    if (inputNum % 2 != 0) {
        System.out.println("false");
    }
}
*/
  /*  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inout a number");
        int inputNum =scan.nextInt();

        if (inputNum%5 == 0){
            System.out.println("fizz");
        }
        if (inputNum%3 == 0){
            System.out.println("buzz");
        }
        if (inputNum%5 == 0  && inputNum%3 == 0){
            System.out.println("fizbuzz");
        }
        if ((inputNum%5) !=0 || (inputNum%3 != 0)){
            System.out.println(inputNum);
        }


    }

   */
/*
    public static void main(String[] args) {
        // output day of week give nthe number of the day or output out of range

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a day number");
        int day =scan.nextInt();
        if (day == 1){
            System.out.println("Monday");
        }
        if (day == 2){
            System.out.println("Tuesday");
        }
        if (day == 3){
            System.out.println("Wednesday");
        }
        if (day == 4){
            System.out.println("Thursday");
        }
        if (day == 5){
            System.out.println("Friday");
        }
        if (day == 6){
            System.out.println("Saturday");
        }
        if (day == 7){
            System.out.println("Sunday");
        }
        if (day > 7 || day<1){
            System.out.println("out of range");
        }





    }
    */
    //task 5
    //Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
//        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
//        remove all the non-numeric characters.
//        parse the Strings to int
//        and print the total
//        Example:
//        String num1 = "$15";
//        String num2 = "$20";
//        String num3 = "$30";
//        output should be ==> 65;
//        NOTE : if the output is less than 0 change the output to -1

    public static void main(String[] args) {
        String inputStr = "$15 $20 $30";
        String stripStr = inputStr.replaceAll("[^0-9\s]","");
//    String firstAmount = stripStr.replaceAll("\\s+\d+\\s+\d+","");
        String firstAmount = stripStr.replaceAll("\s+\\d+\s+\\d+","");
        String secondAmount = stripStr.replaceAll("\\d+\s+\\d+\s","");
        String interAmount = stripStr.replaceAll("[^\s+\\d+\s]","");


        System.out.println(firstAmount);
        System.out.println(secondAmount);
        System.out.println(interAmount);



    }
//Task 6
    /*
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a grade");
    String grade = scan.nextLine();

    boolean isEqualsA = grade.equals("A");
    if ( isEqualsA){
        System.out.println("enter average");
        int average = scan.nextInt();
        if (average>90){
            System.out.println("congrates");
        }
        else {
            System.out.println("invalid average");
        }

    }
    boolean isEqualsB = grade.equals("B");
    if (isEqualsB){
        System.out.println("You are good");

    }

    if (!isEqualsA && !isEqualsB){
        System.out.println("You need to work harder");

    }


}
*/
    // task 7
    /*
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input a string");
    String oddlen = scan.nextLine();

    if (oddlen.length()%2 != 0){
        System.out.println("odd true");
    }
    else {
        System.out.println("false");
    }
}
*/
//task8
    /*
Given two Strings by using scanner class
    add the second string after the first one
                    If the first word ends with the same letter as the second word starts with, then remove it.
    Example: "abc", "cat" --> "abcat"
            "abc", "dog"  -->"abcdog"
*/
/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();
        System.out.println("Input another string");

        String secondStr = scan.nextLine();
        String NewString = firstStr.concat(secondStr);

        if(firstStr.charAt(firstStr.length()-1)==secondStr.charAt(0)){
            String NewFirstStr = firstStr.substring(0,firstStr.length()-1);
            System.out.println(NewFirstStr);
            NewString = NewFirstStr.concat(secondStr);

        }
        System.out.println(NewString);
        }
*/

//task9
//    Given a String and a number. Get the character at the given index with the String.
//    If number is greater then the length of the String, return 0
/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();
        System.out.println("Input index of character to find");
        int len = scan.nextInt();


        if (len>firstStr.length()){
            System.out.println('0');
        }  else {
            System.out.println(firstStr.charAt(len));
        }

    }
*/
    //task10
//    Given a String. If a given string contains only digits, return true. Else, return false
  /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();

        boolean onlyDigits = firstStr.matches("[0-9]+");

        if (onlyDigits){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
*/

//    task11

//    Create two Strings.
//    If the first string contains second string, concat second string to the first string. else, concat first string to itself.
/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();
        System.out.println("Input a 2nd string");
        String secondStr = scan.nextLine();

        if(firstStr.contains(secondStr)){
            System.out.println(secondStr.concat(firstStr));
        } else {
            System.out.println(firstStr.concat(firstStr));
        }
    }

 */

//    task12
//    Create two strings. Check if the strings contain any upper case letters.
//If strings contain capital letters, return the total count of capital letters for both strings.
//if, one of the strings only contains capital letters, return the count of all characters for that string.
//if none of the string contain capital letters, return 0
//Example
//Hello and World ==> output should be 2
//Hello and world ==> output should be 5
//hello and world ==> output should be 10

    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();
        System.out.println("Input a 2nd string");
        String secondStr = scan.nextLine();

        String newFirst = firstStr.replaceAll("[a-z]","");
        String newSecond = secondStr.replaceAll("[a-z]","");
        int capsFirst = newFirst.length();
        int capSecond = newSecond.length();

        if (capsFirst>0 && capSecond>0){
            System.out.println(capsFirst+capSecond);
        }
        if (capsFirst>0 && capSecond==0) {
            System.out.println(capsFirst);
        }
        if (capsFirst==0 && capSecond>0) {
            System.out.println(capSecond);
        }
        if (capsFirst==0 && capSecond==0) {
            System.out.println(0);
        }

    }

     */

    //task 13
    //Create a string and a number. Convert number to char.
    //if string contains char, return the character it self.
    //if string doesnt contain char, return "Character doesnt exist in the string"
    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String firstStr = scan.nextLine();
        System.out.println("Input a number");
        int a = scan.nextInt();

        char  c = (char)a;

        //String.contains(Character.toString(c))

        if(firstStr.contains(Character.toString(c))){
            System.out.println(c);
        } else {
            System.out.println("character is not in string");
        }


    }

     */

    //Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
    //if string doesnt have a space, return the string itself.
    //if string has a space, get two words to the left from the space and to the right from the space. validate which word is the longest and print it.
    //if words have equal length, return the whole string.
    //Example:
    //Hello World = Hello = 5, World = 5 Output should be "Hello World"
    //Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"

    /*
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String Str = scan.nextLine();

        if (Str.contains(" ")){
            int spaceIdx = Str.indexOf(" ");
            String firstStr = Str.substring(0,spaceIdx);
            System.out.println(firstStr);
            System.out.println(firstStr.length());
            String secondStr = Str.substring(spaceIdx+1);
            System.out.println(secondStr);
            System.out.println(secondStr.length());
            if (firstStr.length()>secondStr.length()){
                System.out.println(firstStr);
            }
            if (firstStr.length()<secondStr.length()){
                System.out.println(secondStr);
            }
            if (firstStr.length()==secondStr.length()) {
                System.out.println(Str);
            }

        }
    }

     */

}
