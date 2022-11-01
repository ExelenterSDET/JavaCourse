package SaturdayUdemyProject.Andrea.Task1.EmailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department; //could make this an enum
    private String password;
    private String email;
    private int mailboxCapacity = 500;
    private String altEmail;
    private String company = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println("Email created for " + firstName + " " + lastName + " in " + department);
        this.password = generatePassword(12);
        System.out.println("Your password is " + this.password);
        this.email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+company;
        System.out.println("Your email address is " + email);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getPassword() {
        return password;
    }

    private String setDepartment() {
        System.out.print("Enter department: ");
        Scanner scan = new Scanner(System.in);
        String dept = scan.nextLine().toLowerCase();
        if(dept.equalsIgnoreCase(String.valueOf(Department.SALES))){
            this.department = "Sales";
        }else if (dept.equalsIgnoreCase(String.valueOf(Department.DEVELOPMENT))){
            this.department = "Dev";
        }else if (dept.equalsIgnoreCase(String.valueOf(Department.ACCOUNTING))){
            this.department = "Acct";
        }
        else{
            return "";
        }
        return department;
    }

    private String generatePassword(int length) {
        String pWord = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$%&";
        char[] pW = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * pWord.length());
            pW[i] = pWord.charAt(rand);
        }
    return new String(pW);
    }

    public void setEmailCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAltEmail ( String altEmail) {
        this.altEmail = altEmail;
    }

    public void setNewPassword (String pWord) {
        this.password = pWord;
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nEmail capacity: " + mailboxCapacity;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", altEmail='" + altEmail + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
