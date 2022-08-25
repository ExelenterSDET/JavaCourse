package Day13.Practice;

import java.util.Scanner;

public class Anthony {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Create a password => ");
        String input = scan.nextLine();

        int capitalLettersCount = input.replaceAll("[A-Z]", "").length();
        int lowerLettersCount = input.replaceAll("[^a-z]","").length();
        int symbolsCount = input.replaceAll("[A-z0-9]", "").length();

        String message = input.length() >=8 &&
                capitalLettersCount >=1 &&
                lowerLettersCount >=1 &&
                symbolsCount >=1? "Strong Password" : "Invalid Password";

        System.out.println("TASK = "+message);
    }
}
