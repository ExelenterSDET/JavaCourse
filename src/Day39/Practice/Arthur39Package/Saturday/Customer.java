package Day39.Practice.Arthur39Package.Saturday;

public class Customer {
    String name;
    int age;
    int areazipCode;
    ElectricityAccount ea;

    public Customer(String name, int areazipCode, ElectricityAccount custy ) {
        this.name = name;
        this.areazipCode = areazipCode;
        this.ea = custy;

        if(areazipCode>=1000 && areazipCode<=3000){
            this.ea.rate = 0.9;
        }
        else if(areazipCode>=3000 && areazipCode<=4500){
            this.ea.rate=0.8;
        }
        else if(areazipCode>=4500 && areazipCode<=7500){
            this.ea.rate=0.6;
        } else {
            this.ea.rate = 0.7;
        }


    }

    public Customer(String name, int age, int areazipCode, ElectricityAccount custy) {
        this(name, areazipCode, custy);
        this.name = name;
        this.age = age;
        this.areazipCode = areazipCode;
        this.ea = custy;
    }

    public void consumeElectricity(int wph){
        this.ea.totalWph = this.ea.totalWph + wph;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areazipCode=" + areazipCode +
                ", ea=" + ea.rate +
                ", ea=" + ea.totalWph +
                ", ea=" + ea.bill +
                '}';
    }
}
