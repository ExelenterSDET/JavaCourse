package Day43.Java;

public class CheckingAccount {
    public int amount;
    public CheckingAccount (int amount){
        this.amount = amount;
    }
    public int getAmount() { return amount;}
    public void setAmount(int amount) { this.amount = amount;}
    public void changeAmount(int x){
        amount += x;
    }
}

class Test{
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // line n1
        acct.changeAmount(-acct.getAmount());
        System.out.println(acct.getAmount());
    }


}
