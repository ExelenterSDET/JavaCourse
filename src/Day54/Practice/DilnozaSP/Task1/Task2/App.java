package Day54.Practice.DilnozaSP.Task1.Task2;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
      Car car1 = new Car("Dodge","Caravan",2020,1500,Condition.RESTORABLE);
      Car car2=new Car("Toyota","Rav",2018,25000,Condition.PARTS_CAR);

        ArrayList <Car> newCarList= new ArrayList<>();
        newCarList.add(car1);
        newCarList.add(car2);

        Driver driver = new Driver(Weather.SNOW,newCarList);
        try{
            driver.drive(Weather.FOG);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


   }


}
