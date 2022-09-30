package Day38.Practice.Tohir;

public class Dealership_Tohir {
    public static void main(String[] args) {
        Car_Tohir car_tohir = new Car_Tohir();
        Car_Tohir car_hyundai = car_tohir.SetCarAttributes("Hyundai","Civic",2015,5400);
        Car_Tohir car_tesla = car_tohir.SetCarAttributes("Tesla","TeslaS",2019,15200);
        System.out.println(car_tesla + "\n"+car_hyundai);

    }
}
