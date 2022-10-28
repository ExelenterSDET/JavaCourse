package Day56.Tohir;

import Day56.Tohir.Commercial.Taxi;
import Day56.Tohir.Commercial.Truck;
import Day56.Tohir.NonCommercial.Sedan;
import Day56.Tohir.PublicTransport.Bus;
import Day56.Tohir.PublicTransport.Lane;
import Day56.Tohir.PublicTransport.WorkingShift;

public class City {
   static Taxi taxi;

   static Truck truck;

   static Sedan sedan;
   static Bus bus;


    static {
        taxi = new Taxi("Toyota","Camry",220);
        taxi.setPricePerMile(5);
        taxi.setDriverName("Tju");
        taxi.setGasConsumption(1);
        taxi.setInsurancePrice(300);
        taxi.setMedallionNumber("T1234MM00");
        taxi.setNumberofPassangers(3);
    }

    static {
        truck = new Truck("Tesla", "Ohan",180);
        truck.setCompany("111Comp");
        truck.setGasConsumption(4.2);
        truck.setInsurancePrice(700);
        truck.setNumberofPassangers(5);
        truck.setPricePerMile(12);
        truck.setLicenseID(12233);
    }

    static {
        sedan = new Sedan("BMW","CClass",280,3555,350,"Tjju");
        sedan.setGasConsumption(12);
        sedan.setNumberofPassangers(5);
    }

    static {
        bus = new Bus("Ikarus","Ika22",120, Lane.BRONX, WorkingShift.NIGHT,1.1);
        bus.setGasConsumption(15);
        bus.setNumberofPassangers(35);
    }

    public static void main(String[] args) {
        taxi.print();
        System.out.println("<==============>");
        truck.print();
        System.out.println("<==============>");
        sedan.print();
        System.out.println("<==============>");
        bus.print();
    }
}
