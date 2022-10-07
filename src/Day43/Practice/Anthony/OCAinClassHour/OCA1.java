package Day43.Practice.Anthony.OCAinClassHour;

public class OCA1 {
    public int amount;
    public OCA1(int amount){
        this.amount  = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount (int amount){
        this.amount = amount;
    }
    public void changeAmount (int x){
        amount += x;
    }

    public static void main(String[] args) {
        OCA1 acct = new OCA1 ((int )(Math.random()*1000));
        //line n1
        acct.amount =0;
        System.out.println(acct.getAmount());


    }
}
