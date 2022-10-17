package Day39.Practice.UfukSPTask1;
/*Task 1
        -   Create a class called ElectricityAccount with following attributes:
            -- totalWph -> watt per hour
            -- rate -> set default value to 0.7
            -- bill
        -	Create a class called Customer with following attributes:
            -- name
            -- age
            -- areaZipCode
            -- ElectricityAccount
        -	Create a constructor in Customer class to initialize name, areaZipCode and ElectricityAccount.
            -- If the areaZipcode is between 1000 (inclusive) and 3000 (exclusive) the Electricity rate should be set to 0.9
            -- If areaZipCode is between 3000 (inclusive) and 4500 (exclusive) the Electricity rate should be set to 0.8
            -- If areaZipCode is between 4500 (inclusive) and 7000 (exclusive) Electricity rate should be set to 0.6
            -- Otherwise it should stay 0.7
        -	Overload constructor where you can initialize all the fields in Customer class.
        -	Create a method in Customer class, named 'consumeElectricity' with a parameter of 'wph'
            Each time customer consumes electricity, it should add to totalWph of the customer
            For example:
            customer.consumeElectricity(100);
            customer.consumeElectricity(200);
            customer.consumeElectricity(50);
            After calling methods above customer.totalWph should be equal to 350.
        -	Create a method in ElectricityAccount class, named 'calculateBill' that calculates bill as bill = rate * totalWph
            and returns bill as a double value.*/
public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    double bill;


    public double calculateBill(Customer customer1){
        bill=rate*totalWph;
        return bill;
    }

    @Override
    public String toString() {
        return "ElectricityAccount{" +
                "totalWph=" + totalWph +
                ", rate=" + rate +
                ", bill=" + bill +
                '}';
    }
}
