package Day51.Practice.Dilnoza;

public class Travel {

    public static void travelToOcean(Weather weather){
        switch(weather){
            case COLD:
                throw new RuntimeException("Weather is cold. Not a good idea to swim");
            case WARM:
                throw new RuntimeException("Weather is warm. Better to wait until hot");
            case HOT:
                System.out.println("Good time for the ocean trip");
        }
    }

    public static void travelToMountain(Weather weather)throws Exception {
        switch (weather) {
            case COLD:
                throw new RuntimeException("Weather is cold. Too dangerous for hiking");
            case HOT:
                throw new Exception("Weather is Hot. Better to wait until warm");
            case WARM:
                System.out.println("Weather is warm. Great time for hiking");

        }
    }

    public static void main(String[] args) throws Exception {
       try{
           travelToOcean(Weather.COLD);
       }catch (RuntimeException exc ){
           System.out.println(exc.getMessage());
           System.out.println("Weather is cold. Better to wait until it is HOT");
           System.out.println("Catch Block");

try {
    travelToMountain(Weather.WARM);

}catch (Exception e){
    System.out.println(e.getMessage());
}

}
}
}
