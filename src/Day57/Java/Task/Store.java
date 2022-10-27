package Day57.Java.Task;

import Day57.Java.Task.TVs.SmartTv;
import Day57.Java.Task.TVs.TVModels;
import Day57.Java.Task.Tablets.Ipad;
import Day57.Java.Task.Tablets.TabletModels;

public class Store {
    static Ipad ipad;
    static SmartTv tv;
    static{
        ipad = new Ipad("Ipad", 550);
        ipad.setMemory(512);
        ipad.setModels(TabletModels.APPLE);
    }
    static{
        tv = new SmartTv("TV", 600);
        tv.setPixels(1080);
        tv.setSize(54);
        tv.setModels(TVModels.SAMSUNG);
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
