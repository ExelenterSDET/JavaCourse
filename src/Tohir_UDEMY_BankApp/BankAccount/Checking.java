package BankAccount;

import javax.swing.*;

public class Checking extends Account{
    //list properties specfic to a checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor
    public Checking(String name,String sSN, double deposit){
        super(name,sSN,deposit);
        accountNumber = 2+accountNumber;
        setDebitCard();
       // toPrint();
    }
    @Override
    public void setBase(){
        rate = getBaseRate()*0.15;
        //System.out.println("Implement rate for Checking Account");
    }
    private void setDebitCard(){
        debitCardNumber =(int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));
    }
    public void toPrint(){
        super.toPrint();
        System.out.println("Your Checking Account Features: "+
                '\n'+"Debit Card Number: "+this.debitCardNumber+
                '\n'+"Debit Card Pin: "+this.debitCardPin+
                '\n'+"Rate is: "+this.rate);
        System.out.println("***************");
    }
    //list specific method for the checking method


}
