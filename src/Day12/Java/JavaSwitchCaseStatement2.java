package Day12.Java;

import java.util.Scanner;

public class JavaSwitchCaseStatement2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number => ");
        int num = scan.nextInt();
        String str = scan.nextLine();

        switch(str){
            case "1":
                System.out.println("Number 1");
                break;
            case "2":
                System.out.println("Number2");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
