package Day51.Practice.Andrea;

import java.io.IOException;

import static Day51.Practice.Andrea.Weather.HOT;


public class Travel {

    public static void travelToSea(Weather weather) {
        if (weather == HOT) {
            System.out.println("You may travel to the ocean");
        } else {
            throw new RuntimeException("You may not travel to the ocean");
        }

    }

    public static void travelToMountain(Weather weather) throws Exception {

        switch (weather) {
            case COLD:
                throw new RuntimeException("Weather is cold. Too dangerous for hiking");
            case HOT:
                throw new RuntimeException("Weather is too hot for hiking");
            case WARM:
                System.out.println("Weather is warm. Great time for hiking!");
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            travelToSea(Weather.WARM);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            travelToMountain(Weather.COLD);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void ohNo() throws IOException {
        // works:  System.out.println("it's ok");
        // does not work: throw new Exception();
        // works: throw new IllegalArgumentException();
        // works: throw new java.io.IOException();
       //  works: throw new RuntimeException();
    }
}
