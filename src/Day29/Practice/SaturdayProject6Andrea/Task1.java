package Day29.Practice.SaturdayProject6Andrea;

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

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Mac Mini", "4 gb", "i5", "Red"));
        System.out.println(getBrandPrice(list));
        System.out.println(getModelPrice(list));
        System.out.println(getRAMPrice(list));
        System.out.println(getCPUPrice(list));
        System.out.println(getColorPrice(list));
        getLaptopPrice(list);
    }
    static int getBrandPrice(ArrayList<String> list) {
        int price = 0;

        if (list.get(0).contains("Apple")) {
            price = 500;
        } else if (list.get(0).contains("Samsung")) {
            price = 350;
        } else {
            price = -1;
        }
        return price;
    }
    static int getModelPrice(ArrayList<String> list) {
        int price = 0;

        if (list.get(1).contains("Mini")) {
            price = 100;
        } else if (list.get(1).contains("Middle")) {
            price = 200;
        } else if (list.get(1).contains("Max")) {
            price = 300;
        } else {
            price = -1;
        }
        return price;
    }
    static int getRAMPrice(ArrayList<String> list) {
        int price = 0;

        if (list.get(2).contains("32")) {
            price = 300;
        } else if (list.get(2).contains("16")) {
            price = 200;
        } else if (list.get(2).contains("8")) {
            price = 100;
        } else if (list.get(2).contains("4")) {
            price = 50;
        } else {
            price = -1;
        }
        return price;
    }
    static int getCPUPrice(ArrayList<String> list) {
        int price = 0;

        if (list.get(3).contains("i3")) {
            price = 200;
        } else if (list.get(3).contains("i5")) {
            price = 300;
        } else if (list.get(3).contains("i7")) {
            price = 500;
        } else {
            price = -1;
        }
        return price;
    }

    static int getColorPrice(ArrayList<String> list) {
        int price = 0;

        if (list.get(4).contains("Red")) {
            price = 400;
        } else if (list.get(4).contains("Orange")) {
            price = 300;
        } else if (list.get(4).contains("Silver")) {
            price = 200;
        } else if (list.get(4).contains("Black")) {
            price = 150;
        } else {
            price = -1;
        }
        return price;
    }
    static void getLaptopPrice(ArrayList<String> list) {
        System.out.println("The total price of this laptop is: $" +
                (getBrandPrice(list)+getModelPrice(list)+getColorPrice(list)+getCPUPrice(list)+
                        getRAMPrice(list)));
    }
}