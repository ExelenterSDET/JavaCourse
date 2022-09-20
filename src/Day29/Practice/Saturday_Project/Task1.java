package Day29.Practice.Saturday_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {


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
        ArrayList<String> list =new ArrayList<>(Arrays.asList("Apple", "Max", "32 gb", "i5","Red"));

        System.out.println(getBrandPrice(list));

        int modelPrice = getModelPrice(list);
        System.out.println("modelPrice = " + modelPrice);

        int raMPrice = getRAMPrice(list);
        System.out.println("raMlPrice = " + raMPrice);

        int cpuPrice = getCPUPrice(list);
        System.out.println("cpuPrice = " + cpuPrice);

        int colorPrice = getColorPrice(list);
        System.out.println("colorPrice = " + colorPrice);

        getTotalPrice(list);


    }

    static int getBrandPrice(ArrayList<String> list) {
        int price=0;

        return  price= list.contains("Apple")? 500
                : list.contains("Samsung")? 350 :-1;
    }

    static int getModelPrice(ArrayList<String> list) {
        int price=0;

        return  price= list.contains("Mini")? 100
                : list.contains("Middle")? 200
                : list.contains("Max")? 300:-1;
    }

    static int getRAMPrice(ArrayList<String> list) {
        int price=0;

        return  price= list.contains("32 gb")? 300
                : list.contains("16 gb")? 200
                : list.contains("8 gb")? 100
                : list.contains("4 gb")? 50 :-1;
    }
    static int getCPUPrice(ArrayList<String> list) {
        int price=0;

        return  price= list.contains("i3")? 200
                : list.contains("i5")? 300
                : list.contains("i7")? 500:-1;
    }

    static int getColorPrice(ArrayList<String> list) {
        int price=0;

        return  price= list.contains("Red")? 400
                : list.contains("Orange")? 300
                : list.contains("Silver")? 200
                : list.contains("Black")? 150 :-1;
    }

    static void getTotalPrice(ArrayList<String>list) {
        System.out.println("Total price is = $" +(getBrandPrice(list)+getModelPrice(list)+getRAMPrice(list)
                +getCPUPrice(list)+getColorPrice(list)));

    }
}
