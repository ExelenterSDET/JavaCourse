package Day39.Practice.Sebahattin.Homework.Task1;

public  class Customer {
    String name;
    int age;
    int areaZipCode;
    double electricityAccount;



    public Customer(String name, int age, int areaZipCode){
    this.name = name;
    this.age = age;
    this.areaZipCode = areaZipCode;
}

    @Override
    public String toString() {

        return "Customer{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", areaZipCode = " + areaZipCode +
                ", electricityAccount = $" + electricityAccount +
                '}';
    }
    public double setElectricityRate(int areaZipCode){
        ElectricityAccount account = new ElectricityAccount();
        account.rate = areaZipCode >= 1000 && areaZipCode < 3000 ? 0.9:
                            areaZipCode >= 3000 && areaZipCode < 4500 ? 0.8:
                             areaZipCode >= 4500 && areaZipCode < 7000 ? 0.6:0.7;
        return account.rate;
    }
    public int consumeElectricity(int wph){
        ElectricityAccount account = new ElectricityAccount();
        account.totalWph = account.totalWph + wph;
        return account.totalWph;
    }
}
