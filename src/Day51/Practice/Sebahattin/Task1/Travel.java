package Day51.Practice.Sebahattin.Task1;

public class Travel {
    public static void main(String[] args) {
        try{
            travelToOcean(Weather.WARM);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            travelToMountain(Weather.WARM);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void travelToOcean(Weather weather){
        switch (weather){
            case COLD:
                throw new RuntimeException("Weather is cold. Not a good idea to go to the ocean.");
            case WARM:
                throw new RuntimeException("Weather is warm. Better to wait until it is hot.");
            case HOT:
                System.out.println("Weather is hot. Good time for the ocean trip.");
                break;
        }
    }
    public static void travelToMountain(Weather weather) throws Exception{
        switch (weather){
            case COLD:
                throw new Exception("Weather is cold. Too dangerous for hiking.");
            case WARM:
                System.out.println("Weather is warm. It is the best time for hiking.");
                break;
            case HOT:
                throw new Exception("Weather is hot. Better to have trip to the ocean.");
        }

    }
}