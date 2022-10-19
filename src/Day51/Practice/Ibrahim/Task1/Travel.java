package Day51.Practice.Ibrahim.Task1;

import jdk.jshell.spi.ExecutionControlProvider;

import java.io.FileNotFoundException;

public class Travel {

    public static void travelToOcean(Weather weather){

        switch (weather){
            case COLD :
                throw new RuntimeException("It's cold");
            case WARM :
                throw new RuntimeException("It's warm");
            case HOT:
                System.out.println("It's okay");break;
        }
//           if (weather == Weather.HOT){
//               System.out.println("You can travel to the ocean");
//           }else{
//               throw new RuntimeException("You may not travel to the ocean");
//           }

    }

    public static void travelToMountain(Weather weather) throws Exception{

        switch (weather){
            case COLD :
                throw new Exception("It's cold");
            case WARM :
                System.out.println("It's okay");break;
            case HOT:
                throw new Exception("It's hot");
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            travelToOcean(Weather.COLD);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        try {
        travelToMountain(Weather.HOT);
        }catch (Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}
