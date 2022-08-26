package Day13.Practice;

import java.util.Scanner;

public class Tohir {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please assign your password: ");
    String  password = scan.next();
    System.out.println((password.length()<7)?"length of your password should be minimum 8 characters":
            (password.matches("[^A-Z]+$"))?"Invalid Password. Password should have minimum 1 Capital letter":
                    (password.matches("[^a-z]+$"))?"Invalid Password.Password should have minimum 1 Lower case letter":
                            (password.matches("[^!@#&()–[{}]:;',?/*~$^+=<>]+$"))?"Invalid Password. Password should have minimum 1 special character":
                                    (password.matches("[^0-9]+$"))?"Invalid Password. Password should have minimum 1 number":"Strong password");

}

}
