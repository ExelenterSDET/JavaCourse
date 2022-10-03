package Day39.Practice.Ibrahim.Saturday.Task1;

public class Customer {
    String name;
    int age;
    int areaZipCode;
    ElectricityAccount account;

    public Customer(String name, int areaZipCode, ElectricityAccount account) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.account = account;
        if (1000 < areaZipCode && areaZipCode < 3000){
            account.rate = 0.9;
        }else if (3000 < areaZipCode && areaZipCode < 4500){
            account.rate = 0.8;
        }else if (4500 < areaZipCode && areaZipCode < 7000){
            account.rate = 0.6;
        }
    }

    public Customer(String name, int age, int areaZipCode, ElectricityAccount account) {
        this(name, areaZipCode, account);
        this.age = age;
    }

    public void consumeElectricity(double wph){
        account.totalWph += wph;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name = '" + name + '\'' +
                ", Age = " + age +
                ", Zip Code = " + areaZipCode +
                ",\nBill = " + account +
                "}\n==========================================================";
    }
}
