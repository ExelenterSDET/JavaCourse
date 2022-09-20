package Day29.Practice._09_19_2022_Mentoring_SP6;

import java.util.ArrayList;

public class Task1 {
    /*Task 1. Laptop Price

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

============================================================================*/



    int getBrandPrice(ArrayList<String> list){
        return list.get(0).contains("Apple") ? 500 : list.get(0).contains("Samsung") ? 350 : 0;
    }
    int getModelPrice(ArrayList<String> list){
        return list.get(1).contains("Mini") ? 100
                : list.get(1).contains("Middle") ? 200
                : list.get(1).contains("Max") ? 300
                : 0;
    }
    int getRamPrice(ArrayList<String> list){
        return list.get(2).contains("32 gb") ? 300
                : list.get(2).contains("16 gb") ? 200
                : list.get(2).contains("8 gb") ? 100
                : list.get(2).contains("4 gb") ? 50
                : 0;
    }
    int getCpuPrice(ArrayList<String> list){
        return list.get(3).contains("i3") ? 200
                : list.get(3).contains("i5") ? 300
                : list.get(3).contains("i7") ? 500
                : 0;
    }
    int getColorPrice(ArrayList<String> list){
        return list.get(4).contains("Red") ? 400
                : list.get(4).contains("Orange") ? 300
                : list.get(4).contains("Silver") ? 200
                : list.get(4).contains("Black") ? 150
                : 0;
    }
    void getTotalLaptopPrice(ArrayList<String> list){
        int laptop_price = getBrandPrice(list) + getModelPrice(list) + getRamPrice(list)
                            + getCpuPrice(list) + getColorPrice(list);
        System.out.println("Total price for this laptop is = " + laptop_price);
    }
}
