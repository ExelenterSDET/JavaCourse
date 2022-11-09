package BankAccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        //read a csv file
        String file = "C:\\Users\\Nju\\Desktop\\SD\\OwnRepo\\BankAccountApp\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountholder:newAccountHolders){
            String name = accountholder[0];
            String sSN = accountholder[1];
            String accountType = accountholder[2];
            double initDeposit = Double.parseDouble(accountholder[3]);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name,sSN,initDeposit));
            }else if((accountType.equals("Checking"))) {
                accounts.add((new Checking(name,sSN,initDeposit)));
            }else {
                System.out.println("Error Reading Account");
            }
        }
        accounts.get(5).toPrint();

        for (Account acc:accounts){
            acc.toPrint();
        }

    }
}
