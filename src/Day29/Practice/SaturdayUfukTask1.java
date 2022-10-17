package Day29.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SaturdayUfukTask1 {

    public static void main(String[] args) {
        SaturdayUfukTask1 ut=new SaturdayUfukTask1();
        ArrayList<String> laptop = new ArrayList<>(Arrays.asList("Apple", "Mac Mini", "4 gb", "i5", "Red"));
        ArrayList<String> laptop1 = new ArrayList<>(Arrays.asList("Samsung", "Creator Max", "32 gb", "i7", "Red"));

        System.out.println("brand:" + ut.getBrandPrice(laptop1));
        System.out.println("model:" + ut.getModelPrice(laptop1));
        System.out.println("ram:" + ut.getRamPrice(laptop1));
        System.out.println("cpu:" + ut.getCpuPrice(laptop1));
        System.out.println("color:" + ut.getColorPrice(laptop1));

        ut.getTotalLaptopPrice(laptop1);
    }

    int getBrandPrice (ArrayList<String> laptop){
        int brandPrice = laptop.get(0) ==("Apple")?500:350;
        return brandPrice;
    }
    int getModelPrice (ArrayList<String> laptop){
        int modelPrice = laptop.get(1).contains("Mini")?100: laptop.get(1).contains("Middle")?200:300;
        return modelPrice;
    }
    int getRamPrice (ArrayList<String> laptop){
        int ramPrice = 0;
        if(laptop.get(2).contains("32")){ramPrice+=300;}
            else if (laptop.get(2).contains("16")) {ramPrice+=200;}
            else if (laptop.get(2).contains("8")) {ramPrice+=100;}
            else{ramPrice+=50;}
        return ramPrice;
    }
    int getCpuPrice (ArrayList<String> laptop){
        int cpuPrice = laptop.get(3).equals("i7") ?500: laptop.get(3).equals("i7") ?300:200;
        return cpuPrice;
    }

    int getColorPrice (ArrayList<String> laptop){
        int colorPrice = 0;
        if(laptop.get(2).equalsIgnoreCase("Red")){colorPrice+=400;}
        else if (laptop.get(2).equalsIgnoreCase("Orange")){colorPrice+=300;}
        else if (laptop.get(2).equalsIgnoreCase("Silver")){colorPrice+=200;}
        else{colorPrice+=150;}
        return colorPrice;
    }

    void getTotalLaptopPrice(ArrayList<String> laptop){
        System.out.println("Total Price for this laptop is: "+
                (getBrandPrice(laptop)+getModelPrice(laptop)+getRamPrice(laptop)+getCpuPrice(laptop)+getColorPrice(laptop)));
    }
}