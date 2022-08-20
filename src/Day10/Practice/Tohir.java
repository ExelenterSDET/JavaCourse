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
    
}
