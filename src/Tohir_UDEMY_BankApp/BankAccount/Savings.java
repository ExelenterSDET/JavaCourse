package BankAccount;

public class Savings extends Account{
   private int safetyDepositBoxID;
   private int safetyDepositBoxKey;
    public Savings(String name,String sSN, double deposit) {
        super(name,sSN,deposit);
        accountNumber = 1+accountNumber;
        setSafetyDepositBox();
       // toPrint();
    }

    @Override
    public void setBase() {
        rate = getBaseRate()-.25;
    }
    private void setSafetyDepositBox(){
        this.safetyDepositBoxID =(int) (Math.random()*Math.pow(10,3));
        this.safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
        //System.out.println(this.safetyDepositBoxID);
    }
    public void toPrint(){
        super.toPrint();
        System.out.println("Your Savings Account Features: ");
        System.out.println("Safeety Deposit ID: "+safetyDepositBoxID+
                '\n'+"Safety Deposit ID Key: "+safetyDepositBoxKey+
                '\n'+"Rate is: "+this.rate);
        System.out.println("***************");
    }

}
