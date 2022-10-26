package Day56.Java.Task;

import Day56.Java.Task.Commercial.Taxi;

public class City {
    static Taxi taxi;

    static{
        taxi = new Taxi("Toyota", "Camry", 240);
        taxi.setPricePerMile(5);
        taxi.setDriverName("Furkat Ali");
        taxi.setGasConsumption(1);
        taxi.setInsurancePrice(300);
        taxi.setMedallionNumber("T1002005");
        taxi.setNumbersOfPassengers(4);
    }


    public static void main(String[] args) {
        taxi.print();
    }
}
