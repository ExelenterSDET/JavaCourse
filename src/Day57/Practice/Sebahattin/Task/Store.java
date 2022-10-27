package Day57.Practice.Sebahattin.Task;

import Day57.Practice.Sebahattin.Task.TVs.SmartTv;
import Day57.Practice.Sebahattin.Task.TVs.TVModels;
import Day57.Practice.Sebahattin.Task.Tablets.Ipad;
import Day57.Practice.Sebahattin.Task.Tablets.TabletModels;

public class Store {
    static Ipad ipad;
    static SmartTv tv;

    static {
        ipad = new Ipad("Ipad", 700);
        ipad.setMemory(1024);
        ipad.setModels(TabletModels.APPLE);
    }

    static {
        tv = new SmartTv("TV", 800);
        tv.setPixels(720);
        tv.setSize(55);
        tv.setModels(TVModels.LG);
    }
    public static void main(String[] args) {
        System.out.println(ipad);
        System.out.println("\n" + ipad.getModel()
                +"\n" + ipad.getName()
                +"\n" + ipad.getPrice()
                +"\n" + ipad.getModel()
        );


        System.out.println();
        System.out.println(tv);
        System.out.println( "\n" + tv.getName()
                +"\n" + tv .getModel()
                +"\n" + tv.getSize()
                +"\n" + tv.getPrice()
                +"\n" + tv.getPixels());
    }
}
