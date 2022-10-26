package Day56.Practice.Ibrahim;

import Day56.Practice.Ibrahim.Commercial.Taxi;
import Day56.Practice.Ibrahim.Commercial.Truck;
import Day56.Practice.Ibrahim.Public.Lane;
import Day56.Practice.Ibrahim.Public.Train;
import Day56.Practice.Ibrahim.Public.WorkingShifts;


public class City {

    static Taxi taxi;
    static Truck truck;
    static Train train;

    static {
        taxi = new Taxi("Toyota", "RAV4", 240);
        taxi.setPricePerMile(5);
        taxi.setDriverName("Ibrahim");
        taxi.setGasConsumption(1.2);
        taxi.setInsurancePrice(445);
        taxi.setMedallionNumber("CHTN999");
        taxi.setNumbersOfPassengers(5);
    }

    static {
        truck = new Truck("Tesla", "Truck", 240);
        truck.setPricePerMile(5);
        truck.setCompany("Tesla");
        truck.setGasConsumption(1.2);
        truck.setInsurancePrice(445);
        truck.setLicenceID("CHTN999");
        truck.setNumbersOfPassengers(5);
    }

    static {
        train = new Train("Toyota", "Train", 120);
        train.setWorkingHours(8);
        train.setLane(Lane.MANHATTAN);
        train.setWorkingShifts(WorkingShifts.MORNING);
        train.setPricePerRide(3.5);
        train.setNumbersOfPassengers(150);
        train.setGasConsumption(1.5);


    }

    public static void main(String[] args) {
        taxi.print();
        truck.print();
        train.print();
    }
}
