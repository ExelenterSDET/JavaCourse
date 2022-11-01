package Day57.Tohir.Task;

import Day57.Tohir.Task.TVs.SmartTV;
import Day57.Tohir.Task.TVs.TVModels;
import Day57.Tohir.Task.Tablets.TabletModels;
import Day57.Tohir.Task.Tablets.iPad;

public class Store {
    static iPad ipad;
    static SmartTV smartTV;

    static {
        ipad = new iPad("iPad Air",599);
        ipad.setMemory(256);
        ipad.setTabletModels(TabletModels.APPPLE);
    }
    static {
        smartTV = new SmartTV("TV",499);
        smartTV.setPixels(34567);
        smartTV.setSize(43);
        smartTV.setTvModels(TVModels.SAMSUNG);
    }

    public static void main(String[] args) {
        System.out.println(ipad);
        System.out.println(smartTV);
    }
}
