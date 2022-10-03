package Day39.Practice.Anthony.GroupProject8.Task1;

public class Customer {

    String name;
    int age;
    int areaZipCode;
    double electricityAccount;

    public Customer(String name, int age, int areaZipCode, double electricity) {
        this.name = name;
        this.age = age;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = electricity;
        if (1000 <= areaZipCode && areaZipCode < 3000) {
            ElectricityAccount.rate = 0.9;
        } else if (3000 <= areaZipCode && areaZipCode < 4500) {
            ElectricityAccount.rate = 0.8;
        } else if (4500 <= areaZipCode && areaZipCode < 7000) {
            ElectricityAccount.rate = 0.6;
        }
    }

    public Customer() {

    }

    public void consumeElectricity (double wph) {
        ElectricityAccount.totalWph += wph;
    }

    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", areaZipCode=" + areaZipCode +
                ", electricityAccount= $" + electricityAccount +
                '}';
    }
}

//    }
//
//    public double getZipSpread () {
//        double rate = 0;
//        if (this.areaZipCode == 1000 || this.areaZipCode > 3000) {
//            return 0.9;
//        }
//
//        return rate;
//    }
//    public double getZipSpread2 () {
//        double rate = 0;
//        if (this.areaZipCode == 3000 || this.areaZipCode > 4500) {
//            return 0.8;
//        }
//
//        return rate;
//    }
//    public double getZipSpread3() {
//        double rate = 0;
//        if (this.areaZipCode == 4500 || this.areaZipCode > 7500) {
//            return 0.6;
//        }
//
//        return rate;
//    }
//
//    public Customer() {
//
//    }
//
//    public double consumeElectricity (double wph) {
//
//
//        return wph;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", areaZipCode=" + areaZipCode +
//                ", electricityAccount=" + electricityAccount +
//                '}';
//    }
//}
