package Day56.Practice.Sebahattin;

import Day56.Practice.Sebahattin.Commercial.Taxi;
import Day56.Practice.Sebahattin.Commercial.Truck;

public class Citiy {
    static Taxi taxi;
    static Truck truck;

    static {
        taxi = new Taxi("Opel", "Grandland X", 280);
        taxi.setDriverName("Sebahattin Beycur");
        taxi.setMedallionNumber("T1002323");
        taxi.setPricePerMile(6);
        taxi.setGasConsumption(1.2);
        taxi.setInsurancePrice(250);
        taxi.setNumbersOfPassengers(4);
    }
    static {
        truck = new Truck("Scania","R Highline", 180);
        truck.setCompany("Alp");
        truck.setLicanseId("S230023");
        truck.setPricePerMile(10);
        truck.setGasConsumption(4.5);
        truck.setInsurancePrice(1000);
        truck.setNumbersOfPassengers(2);

    }

    public static void main(String[] args) {
        taxi.print();
        truck.print();
    }
}
