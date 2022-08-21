package Day10.Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Tohir {
    //Task #1
    /*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        if (age<=10){
            System.out.println(" your age is "+age+" and you're too young to Fbook account");
        }
        if (age<=16){
            System.out.print(" your age is "+age+" and you're too young to get a driver's license");
        }
        if (age<=21){
            System.out.print(" your age is "+age+" and you're too young to get a tattoo");
        }
        if (age>21){
            System.out.print(" your age is "+age+" and do whatever you want to do");
        }
    }
    */
    //Task #2
    /*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        if (numb%2 == 0){
            System.out.print("Number you ented is "+ numb + " and it's even");
        }
        if (numb%2 == 1){
            System.out.print("Number you ented is "+ numb + " and it's odd");
        }
    }

     */
    //Task #3
    /*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        if (numb==1){
            System.out.print("Number you ented is "+ numb + " and it's Monday");
        }
        if (numb==2){
            System.out.print("Number you ented is "+ numb + " and it's Tuesday");
        }
        if (numb==3){
            System.out.print("Number you ented is "+ numb + " and it's Wednesday");
        }
        if (numb==4){
            System.out.print("Number you ented is "+ numb + " and it's Thursday");
        }
        if (numb==5){
            System.out.print("Number you ented is "+ numb + " and it's Friday");
        }
        if (numb==6){
            System.out.print("Number you ented is "+ numb + " and it's Saturday");
        }
        if (numb==7){
            System.out.print("Number you ented is "+ numb + " and it's Sunday");
        }
        if (numb!=1 && numb!=2 && numb!=3 && numb!= 4 && numb!=5 && numb!=6 && numb!=7){
            System.out.print("Number you ented is "+ numb + " and it is not a valid day");
        }
    }

     */
    //Task #4
    /*
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numb = scn.nextInt();
        if (numb%5 == 0 && numb%3 == 0){
            System.out.print("fizzbuzz");
        }
        if (numb%5 == 0 && numb%3 != 0){
            System.out.print("fizz");
        }
        if (numb%5 != 0 && numb%3 == 0){
            System.out.print("buzz");
        }
        if (numb%5 != 0 && numb%3 != 0){
            System.out.print(numb);
        }
    }

     */
    //Task 5
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str = Str.nextLine();
        String[] str1 = str.split("$");
        System.out.print(Arrays.toString(str1));


    }

     */
    //Task 6
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String grade = Str.next();
        if( grade.equals("A")){
            System.out.print("What is your average ");
            int average = Str.nextInt();
            if(average>90) {
                System.out.print("CONGRATS");
            }
            if(average<=90) {
                System.out.print("Invalid average");
            }
        }
        if( grade.equals("B")) {
            System.out.print("You're good");
        }
        else
        {
            System.out.print("You need to work hard");
        }

    }

     */
    //Task #7
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String grade = Str.next();
        if (grade.length() % 2 == 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

     */
    //Task #8
   /* public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        String str2 = Str.next();
        String[] split_1 = str1.split("");
        String[] split_2 = str2.split("");
        System.out.print(boolean (split_1[-1]=split_2[0]));



        //if(str1[-1]==str2[1])
    }*/
    //Task #9
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        int num = Str.nextInt();
        String str1 = Str.next();
        if (str1.length()<num) {
            System.out.print("0");
            }

        if (str1.length()>=num){
            String[] str_1 = str1.split("");
            String ch = str_1[num-1];
            System.out.print(ch);
        }


    }

     */
//Task #10
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        if (str1.matches(".*[a-zA-Z].*")) {
            System.out.print("False");
        }
        else {
            System.out.print("True");
        }
    }

     */
    //Task #11
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        String str2 = Str.next();
        if (str1.contains(str2))
        {
            System.out.print(str1.concat(str2));
        }
        else
        {
            System.out.print(str1.concat(str1));
        }
    }

     */
    //Task 12 Create two strings. Check if the strings contain any upper case letters.
    //If strings contain capital letters, return the total count of capital letters for both strings.
    //if, one of the strings only contains capital letters, return the count of all characters for that string.
    //if none of the string contain capital letters, return 0
    //Example
    //Hello and World ==> output should be 2
    //Hello and world ==> output should be 5
    //hello and world ==> output should be 10
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        String str2 = Str.next();
        Boolean case_1 = str1.matches(".*[A-Z].*") && str2.matches(".*[A-Z].*");
        Boolean case_2 = ((str1.matches(".*[A-Z].*") && !str2.matches(".*[A-Z].*"))||(!str1.matches(".*[A-Z].*") && str2.matches(".*[A-Z].*")));
        Boolean case_3 = !(case_1);

        if (case_1) {
            int num = str1.replaceAll("[a-z]", "").length()+str2.replaceAll("[a-z]", "").length();
            System.out.print("Total " + num );
        }
        if (case_2) {
            int num = str1.replaceAll("[a-z]", "").length();//+str2.replaceAll("[a-z]", "").length();
            System.out.print("Total " + num );
        }
        if (case_3) {
            System.out.print("0");
        }
    }

     */

    //Task #13
    //Create a string and a number. Convert number to char.
    //if string contains char, return the character it self.
    //if string doesnt contain char, return "Character doesnt exist in the string"
    /*
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        int str2 = Str.nextInt();
        char c = (char) str2;
        if (str1.contains(String.valueOf(c))){
            System.out.print(str1);
        }
        else {
            System.out.print("Character doesnt exist in the string");
        }
*/

    //Task 14
    //Create a string. Validate if a string has a space. (use maximum 1 spaces in the string)
    //if string doesnt have a space, return the string itself.
    //if string has a space, get two words to the left from the space and to the right from the space. validate which word is the longest and print it.
    //if words have equal length, return the whole string.
    //Example:
    //Hello World = Hello = 5, World = 5 Output should be "Hello World"
    //Exelenter Sdet = Exelenter = 9, Sdet = 4 Ouput should be "Exelenter"
    public static void main(String[] args) {
        Scanner Str = new Scanner(System.in);
        String str1 = Str.next();
        //Boolean bl1 = str1.contains(" ");
        Boolean bl2 = str1.matches(".*\\w.*");
        if(bl2) {
            int n = str1.indexOf(" ");
        }
        if(!bl2){
            System.out.print(str1);
        }

    }

}
