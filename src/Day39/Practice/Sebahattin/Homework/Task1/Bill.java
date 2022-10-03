package Day39.Practice.Sebahattin.Homework.Task1;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        ElectricityAccount account = new ElectricityAccount();
        Customer customer = new Customer("Sebahattin Beycur", 42, 3023);
        System.out.println(customer);
        System.out.println("Enter new Wph = ");
        Scanner input = new Scanner(System.in);
        int newWph = input.nextInt();
        account.rate = (customer.setElectricityRate(customer.areaZipCode));

        while (newWph > 0 ){
            account.totalWph += (customer.consumeElectricity(newWph));
            customer.electricityAccount = account.calculateBill(newWph);
            System.out.println(customer);
            System.out.println(account);
            System.out.println("Enter new Wph = ");
            newWph = input.nextInt();
        }
    }
}
