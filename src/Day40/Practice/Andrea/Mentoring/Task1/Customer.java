package Day40.Practice.Andrea.Mentoring.Task1;

public class Customer {

    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;

    public Customer(String name, int zip, ElectricityAccount account){
        this.name = name;
        this.areaZipCode = zip;
        this.electricityAccount = account;
        double rate;
        if (zip >= 1000 & zip < 3000){
            electricityAccount.rate = 0.9;
        }
        else if (zip >= 3000 && zip < 4500){
            electricityAccount.rate = 0.8;
        }
        else if (zip >= 4500 && zip < 7000){
            electricityAccount.rate = 0.6;
        }
    }

    public Customer(String name, int zip, int age, ElectricityAccount account) {
        this(name, zip, account);
        this.age = age;
    }

    public void consumeElectricity(double wph){
       electricityAccount.totalWph += wph;
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
}
