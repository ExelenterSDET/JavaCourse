package Day39.Practice.UfukSPTask1;

public class Customer  {
    String name;
    int age;
    int areaZipCode;
    ElectricityAccount account;


    public Customer(String name, int age, int areaZipCode, ElectricityAccount account) {
        this.name = name;
        this.age = age;
        this.areaZipCode = areaZipCode;
        this.account = account;

        if(1000>=areaZipCode && areaZipCode<3000){
            account.rate=0.9;
        } else if (areaZipCode>=3000 && areaZipCode<4500) {
            account.rate=0.8;
        } else if (areaZipCode>=4500 && areaZipCode<7000) {
            account.rate=0.6;
        }else account.rate=0.7;
    }

   public double consumeElectricity(double wph){
       return (account.totalWph +=wph);
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
}
