package BankAccount;

public abstract class Account implements iBaseRate {
    //list common properties for savings and checkings
    private String name;
    private String sSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int index = 10000;

    //Constructor to set and initialize

    public Account(String name,String sSN,double deposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = deposit;
        //set account number:
        index++;
        this.accountNumber = setAccountNumber();
        setBase();
    }
    public abstract void setBase();

    public void deposit(double amount){
       balance = balance + amount;
        System.out.println("Depositing $"+amount);
        printBalance();
    }

    public void withdraw(double amount){
       balance = balance - amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance -amount;
        System.out.println("Transferring $"+amount+" to "+toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now $"+balance);

    }

    public void compound(){
        double accuredIneest = balance*(rate/100);
        balance = balance + accuredIneest;
        System.out.println("Accrued Interest $"+accuredIneest);
        printBalance();
    }
    public String setAccountNumber() {
        String last2OfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));
        return last2OfSSN+uniqueID+randomNumber;
    }
    public void toPrint() {
        System.out.println(
                "NAME: " + name  +
                //", sSN='" + sSN + '\'' +
                ", ACCOUNT NUMBER: " + accountNumber +
                ", BALANCE: " + balance );
    }
    //list common methods
}
