package Day30.Java;

import java.util.ArrayList;

public class OCAQ155 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1000);
        points.add(2000);
        points.add(3000);
        points.add(4000);
        points.add(null);
        points.remove(Integer.valueOf(2000));
        points.remove(1);
//        points.remove(Integer.valueOf(1));
//        points.remove(new Integer("2"));
        System.out.println(points);

        ArrayList<Double> points2 = new ArrayList<>();
        points2.add(12.0);
        points2.add(13.2);
        points2.add(41.25);
        points2.add(40.5);
        points2.add(null);
        points2.remove(12.0);
//        points.remove(null);
//        points.remove(Integer.valueOf(1));
//        points.remove(new Integer("2"));
        System.out.println(points2);

    }
}
