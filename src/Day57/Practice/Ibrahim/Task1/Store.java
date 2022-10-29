package Day57.Practice.Ibrahim.Task1;

import Day57.Practice.Ibrahim.Task1.Tablets.Ipad;
import Day57.Practice.Ibrahim.Task1.Tablets.TabletBrands;

public class Store {
    static Ipad ipad;

    static {
        ipad = new Ipad("Ipad", 1099);
        ipad.setMemory(256);
        ipad.setBrand(TabletBrands.APPLE);
    }

    public static void main(String[] args) {
        System.out.println(ipad);
    }
}
