package Day39.Practice.SaturdayProject8Andrea.Task1;

public class Customer {

    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;


    public Customer(String name, int zip, ElectricityAccount account){
        this(name, account);
        this.areaZipCode = zip;
        this.electricityAccount = account;
        double rate;
        if (zip >= 1000 & zip < 3000){
            rate = 0.9;
        }
        else if (zip >= 3000 && zip < 4500){
            rate = 0.8;
        }
        else if (zip >= 4500 && zip < 7000){
            rate = 0.9;
        }
        else {
            rate = 0.7;
        }
    }

    public Customer(String name, ElectricityAccount account){
        this.name = name;
        this.electricityAccount = account;
    }

    public Customer(Customer customer, int age){
        this.age = age;
    }

    public double consumeElectricity(double wph){
        wph += wph;
        return wph;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areaZipCode=" + areaZipCode +
                ", electricityAccount=" + electricityAccount +
                '}';
    }

    public static void main(String[] args) {

        ElectricityAccount account = new ElectricityAccount();
        Customer customer = new Customer("Andrea", 3445, account);
        account.calculateBill(customer);
        customer.consumeElectricity(100);
        customer.consumeElectricity(200);
        System.out.println((customer.consumeElectricity(50)));
        System.out.println(customer);
        System.out.println(account);
    }
}


//    -	Create a constructor in Customer class to initialize name, areaZipCode and ElectricityAccount.
//        -- If the areaZipcode is between 1000 (inclusive) and 3000 (exclusive) the Electricity rate should be set to 0.9
//        -- If areaZipCode is between 3000 (inclusive) and 4500 (exclusive) the Electricity rate should be set to 0.8
//        -- If areaZipCode is between 4500 (inclusive) and 7000 (exclusive) Electricity rate should be set to 0.6
//        -- Otherwise it should stay 0.7
//        -	Overload constructor where you can initialize all the fields in Customer class.
//        -	Create a method in Customer class, named 'consumeElectricity' with a parameter of 'wph'
//        Each time customer consumes electricity, it should add to totalWph of the customer
//        For example:
//        customer.consumeElectricity(100);
//        customer.consumeElectricity(200);
//        customer.consumeElectricity(50);
//        After calling methods above customer.totalWph should be equal to 350.