package Day58.Practice.Dilnoza.SaturdayProject;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternativeEmail;
    private String companySuffix="aeycompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.department=setDepartment();
        System.out.println("Department: "+this.department);

        this.password=randomPassword(defaultPasswordLength);
        System.out.println("your password is = " + this.password);

//        String password1 = randomPassword(13);
//        System.out.println("password1 = " + password1);

        email=firstName.toLowerCase() + "."+ lastName.toLowerCase() +"@"+department+ "." +companySuffix;
        System.out.println("Your email is: " + email);


    }


    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \n4 for none\n Enter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 1) {
            return "Development";
        } else if (depChoice == 2) {
            return "Accounting";
        } else {
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char []password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }


    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void changePassword(String password){
        this.password=password;
    }


}