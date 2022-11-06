package BankAccount;

public interface iBaseRate {

    //write a method to return base rate
    default double getBaseRate(){
        return 2.5;
    }
}
