package Day39.Practice.Dilnoza.Task1;

public class Customer{
    String name;
    int age;
    int areaZipCode;
    ElectricityAccount account;

    public Customer(String name, int areaZipCode, ElectricityAccount account) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.account = account;

        if (areaZipCode >= 1000 && areaZipCode < 3000) {
            account.rate = 0.9;
        } else if (areaZipCode >= 3000 && areaZipCode < 4500) {
            account.rate = 0.8;
        } else if (areaZipCode >= 4500 && areaZipCode < 7000) {
            account.rate = 0.6;
        }

    }
    public Customer(String name, int age, int areaZipCode, ElectricityAccount account) {
        this.name = name;
        this.age = age;
        this.areaZipCode = areaZipCode;
        this.account = account;
    }
        public double electricityUsage(double wph){

            return ElectricityAccount.totalWph+=wph;
}

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areaZipCode=" + areaZipCode +
                ", account=" + account +
                '}';
    }


    public static void main(String[] args) {
        ElectricityAccount account= new ElectricityAccount();
        Customer customer= new Customer("J",1500,account);
        customer.electricityUsage(200);
        customer.electricityUsage(100);
        customer.electricityUsage(50);
        account.calculateBill();
        System.out.println("customer = " + customer);

    }

}