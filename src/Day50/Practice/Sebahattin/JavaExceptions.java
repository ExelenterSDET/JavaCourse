package Day50.Practice.Sebahattin;

import java.util.Scanner;

public class JavaExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();

        try{
            int number1 = Integer.parseInt(str1);
            int number2 = Integer.parseInt(str2);
            int total = number1 + number2;
            System.out.println(total);
            System.out.println("Try Block");
        }catch (Exception ex){
            System.out.println(" Catch Block ");
        }
    }
}
