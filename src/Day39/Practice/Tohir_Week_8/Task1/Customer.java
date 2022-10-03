package Day39.Practice.Tohir_Week_8.Task1;

public class Customer {
    String Name;
    int Age;
    int AreaZipCode;

    //int ElectricityAccount;

    ElectricityAccount electricityAccount = new ElectricityAccount();

    public Customer(String name, int age, int areaZipCode) {
        Name = name;
        Age = age;
        AreaZipCode = areaZipCode;
        this.electricityAccount.Rate = (AreaZipCode>=1000 && AreaZipCode<3000) ? 0.9:
                (AreaZipCode>=3000 && AreaZipCode<4500) ? 0.8:
                        (AreaZipCode>=4500 && AreaZipCode<7000) ? 0.6:
                                electricityAccount.Rate;
    }

    public Customer(String name, int age, int areaZipCode, ElectricityAccount electricityAccount) {
        Name = name;
        Age = age;
        AreaZipCode = areaZipCode;
        this.electricityAccount = electricityAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", AreaZipCode=" + AreaZipCode +
                ", electricityAccount=" + electricityAccount +
                '}';
    }
}



