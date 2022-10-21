package Day51.Tohir.Tasks;

public class Travel {

    public String Weather;

    public static void main(String[] args) {
        try {
            traveltoOcean(Day51.Tohir.Tasks.Weather.COLD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            traveltoMountain(Day51.Tohir.Tasks.Weather.COLD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // traveltoOcean("COLD");
    }


    public static void traveltoOcean(Weather weather){
        /*if (weather == Day51.Tohir.Tasks.Weather.HOT){
            System.out.println("You may travel to Ocean");
        }else {
            throw new StringIndexOutOfBoundsException("Weather is cold, sit at home");
        }*/
        switch (weather){
            case COLD:
                throw new RuntimeException("Weaher is cold, stay at home");
            case HOT:
                System.out.println("Best weather to travel to ocean");
            case WARM:
                throw new RuntimeException("Not best weather to travel to ocean");
        }
    }

    public static void traveltoMountain(Weather weather) throws NoSuchMethodException {
        switch (weather){
            case COLD:
                throw new NoSuchMethodException("Weaher is cold, stay at home");
            case HOT:
                throw new NoSuchMethodException("Not best weather to travel to mountains");
            case WARM:
                System.out.println("Best weather to travel to mountains");
        }
    }
}
