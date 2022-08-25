package Day13.Practice;

import java.util.Scanner;

public class Andrea {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a password: ");
            String password = scan.nextLine();

            String output = "";

            output = password.length() >= 8 && password.replaceAll("[^A-Z]","").length() > 0
                    && password.replaceAll("[^a-z]","").length() > 0
                    && password.replaceAll("[^A-Za-z0-9]", "").length() > 0 ? "Strong password" : "Invalid password";

            System.out.println(output);

        }

    }



