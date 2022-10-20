package Day51.Practice.Malika;

import static Day51.Practice.Malika.Weather.HOT;
import static Day51.Practice.Malika.Weather.WARM;

public class Travel {

    public static void main(String[] args) {

        try { travelToOcean(HOT);

        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }


        try{ travelToMountain(Weather.COLD);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void travelToOcean (Weather weather){
        if (weather == HOT) {
            System.out.println("You may travel to the ocean");
        } else {
            throw new RuntimeException("You many not travel to the ocean");
        }
    }

    public static void travelToMountain (Weather weather) throws InterruptedException {
        if (weather == WARM) {
            System.out.println("You may travel to mountain ");
        } else {
            throw new InterruptedException("You may not travel to mountain ");
        }
    }
    
}

