package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private int defaultPasswordLength=8;
    private String email;
    private String companySuffix = "company.com";

    //Constructor to receive first and last names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created:  " + this.firstName+ " "+this.lastName);

        // call the method asking for department
        this.department=setDepartment();
       // System.out.println("Department  = " + this.department );

        //call a method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        //System.out.println("Password: "+this.password);

        //Combine elements to generate email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Email is: "+email);
    }

    //ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department: ");
        Scanner scan =new Scanner(System.in);
        int depChoice = scan.nextInt();
        if (depChoice==1){return  "Sales";}
        else if (depChoice==2) {return  "Development";}
        else if (depChoice==3) {return  "Accounting";}
        else {return "";}
    }

    //generate a random password
    private String randomPassword(int lenght){
        String passwordSet="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$%&*_=+";
        char[] password=new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand= (int )(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    //set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change the password

    public void changePassword(String password) {
        this.password = password;
    }


    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return ""+
                 firstName + " " + lastName +
                "\n password='" + password + '\'' +
                "\n department='" + department + '\'' +
                "\n mailBoxCapacity=" + mailBoxCapacity +
                "\n alternateEmail='" + alternateEmail + '\'' +
                "\n defaultPasswordLength=" + defaultPasswordLength +
                "\n email='" + email + '\''
                ;
    }
}
