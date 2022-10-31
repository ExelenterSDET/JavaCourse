package UdemySebahattin.EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 250;
    private String alternateEmail;
    private String companySuffix = "bycrcompany.com";

    // Constructor to receive thr first name and last name

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    // Ask for the department

    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();
        if (departmentChoice == 1) { return "sales"; }
        else if (departmentChoice == 2) { return "dev"; }
        else if (departmentChoice == 3) { return "accounting"; }
        else { return ""; }
    }

    // Generate a random password
    private String randomPassword (int length){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXVYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            String passStr = String.valueOf(password);
        }
        return new String(password);
    }
    // Set the mailbox capacity

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    // Set the alternate email

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword (String newPassword){
        this.password = newPassword;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String print(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " MB";
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName = '" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\npassword='" + password + '\'' +
                "\ndefaultPasswordLength=" + defaultPasswordLength +
                "\ndepartment='" + department + '\'' +
                "\nemail='" + email + '\'' +
                "\nmailboxCapacity=" + mailboxCapacity +
                "\nalternateEmail='" + alternateEmail + '\'' +
                "\ncompanySuffix='" + companySuffix + '\'' +
                '}';
    }
}
