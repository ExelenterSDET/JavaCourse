package Day29.Practice.Sebahattin;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
/*
        Task 1. Laptop Price

        You have a laptop specifications which is stored in the ArrayList as follows:
        [Brand, Model, Ram, CPU, Color]

        example:
        [Apple, Mac Mini, 4 gb, i5, Red]
        [Apple, Mac Middle, 8 gb, i5, Black]
        [Apple, Mac Max, 8 gb, i7, Silver]
        [Apple, Mac Max, 16 gb, i7, Red]
        [Apple, Mac Max, 32 gb, i7, Black]
        [Samsung , Creator Mini, 4 gb, i3, Red]
        [Samsung, Creator Middle, 8 gb, i5, Black]
        [Samsung, Creator Max, 16 gb, i7, Orange]
        [Samsung, Creator Max, 32 gb, i7, Red]

        To get the totalPrice for the laptop, you need to calculate each specification separately.

        1. Get Brand Price:
            Create a method which will have ArrayList<String> as a parameter and will return int(price).
            Price for Apple is 500
            Price for Samsung is 350

        2. Get Model Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if Model contains "Mini" add 100 to price
           if Model contains "Middle" add 200 to price
           if Model contains "Max" add 300 to price

       3. Get Ram Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if ram is 32 gb add 300 to price
           if ram is 16 gb add 200 to price
           if ram is 8 gb add 100 to price
           if ram is 4 gb add 50 to price

       4. Get CPU Price:
           Create a method which will have ArrayList<String> as a parameter and will return int(price).
           if CPU is i3 add 200 to price
           if CPU is i5 add 300 to price
           if CPU is i7 add 500 to price

       5. Get Color Price:
          Create a method which will have ArrayList<String> as a parameter and will return int(price).
          if Color is Red add 400 to price
          if Color is Orange add 300 to price
          if Color is Silver add 200 to price
          if Color is Black add 150 to price

       6. Get Total Laptop Price:
         Create a void method which will have ArrayList<String> as a parameter and will print total price.
         Calculate total for a laptop according to the laptop specification.
         note: reuse methods 1,2,3,4,5 within this method.
 */
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple" , "Creator Mini", "4 Gb", "i3", "Red"));

            System.out.println("Brand Price Only = "+ (getBrandPrice(list)));
            System.out.println("Model Price Only = "+ (getModelPrice(list)));
            System.out.println("Ram Price Only = "+ (getRamPrice(list)));
            System.out.println("CPU Price Only = "+ (getCPUPrice(list)));
            System.out.println("Color Price Only = "+ (getColorPrice(list)));
            getTotalLaptopPrice(list);
        }
        static int getBrandPrice (ArrayList<String> list){
            int brandPrice = list.get(0).equals("Apple")? 500
                             : list.get(0).equals("Samsung") ? 350 :0;
            return brandPrice;
        }
        static int getModelPrice (ArrayList<String> list){
            int modelPrice = list.get(1).contains("Mini")? 100
                : list.get(1).contains("Middle") ? 250
                : list.get(1).contains("Max") ? 300 :0;
            return modelPrice;
    }
        static int getRamPrice (ArrayList<String> list){
            int ramPrice = list.get(2).contains("32 Gb")? 300
                : list.get(2).equals("16 Gb") ? 200
                    : list.get(2).equals("8 Gb") ? 100
                    : list.get(2).equals("4 Gb") ? 50 : 0;
            return ramPrice;
    }
        static int getCPUPrice (ArrayList<String> list){
            int cpuPrice = list.get(3).equals("i7")? 500
                : list.get(3).equals("i5") ? 300
                    : list.get(3).equals("i3") ? 200 :0 ;
            return cpuPrice;
    }
        static int getColorPrice (ArrayList<String> list){
            int colorPrice = list.get(4).equals("Red")? 400
                : list.get(4).equals("Orange") ? 300
                : list.get(4).equals("Silver") ? 200
                : list.get(4).equals("Black") ? 150 :0;
            return colorPrice;
    }
    static void getTotalLaptopPrice (ArrayList<String> list){
        System.out.println("Total Laptop Price = "+(getBrandPrice(list)+getModelPrice(list)
                                +getRamPrice(list)+getCPUPrice(list)+getColorPrice(list)));
    }
}
