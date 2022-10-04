package Day39.Practice._10_03_2022_Mentoring.Task1;

public class Customer {
    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;

    public Customer(String name, int areaZipCode, ElectricityAccount electricityAccount){
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = electricityAccount;

        if (areaZipCode >= 1000 && areaZipCode < 3000){
            electricityAccount.rate = 0.9;
        } else if (areaZipCode >= 3000 && areaZipCode < 4500){
            electricityAccount.rate = 0.8;
        } else if (areaZipCode >= 4500 && areaZipCode < 7000){
            electricityAccount.rate = 0.6;
        }
    }

    public Customer(String name, int age, int areaZipCode, ElectricityAccount electricityAccount) {
        this(name, areaZipCode, electricityAccount);
        this.age = age;

    }
    public void consumeElectricity(double wph){
        electricityAccount.totalWph += wph;
    }
}
