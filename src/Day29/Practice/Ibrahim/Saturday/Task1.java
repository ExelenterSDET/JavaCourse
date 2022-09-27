package Day29.Practice.Ibrahim.Saturday;
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
         note: reuse methods 1,2,3,4,5 within this method.*/


import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    static Integer getBrandPrice(ArrayList<String> brand){
        return brand.get(0).equals("Apple") ? 500 : 350;
    }

    static Integer getModelPrice(ArrayList<String> brand){
        int modelPrice = 0;
        for (String s : brand) {
            if (s.contains("Mini")){
                modelPrice = 100;
            }else if(s.contains("Middle")){
                modelPrice = 200;
            } else if (s.contains("Max")){
                modelPrice = 300;
            }
        }
        return modelPrice;
    }

    static Integer getRamPrice(ArrayList<String> brand){
        int ramPrice = 0;
        switch (brand.get(2)){
            case ("32 gb") : ramPrice = 300; break;
            case ("16 gb") : ramPrice = 200; break;
            case ("8 gb") : ramPrice = 100; break;
            case ("4 gb") : ramPrice = 50; break;
        }
        return ramPrice;
    }
    static Integer getCpuPrice(ArrayList<String> brand){
        int cpuPrice = 0;
        switch (brand.get(3)){
            case ("i3") : cpuPrice = 200; break;
            case ("i5") : cpuPrice = 300; break;
            case ("i7") : cpuPrice = 400; break;
        }
        return cpuPrice;
    }

    static Integer getColorPrice(ArrayList<String> brand) {
        int colorPrice = switch (brand.get(4)) {
            case ("Red") -> 400;
            case ("Orange") -> 300;
            case ("silver") -> 200;
            case ("Black") -> 150;
            default -> 0;
        };
        return colorPrice;
    }

    static Integer getTotalPrice(ArrayList<String> str ){
        int total = getBrandPrice(str)
                + getCpuPrice(str)
                + getRamPrice(str)
                + getModelPrice(str)
                + getColorPrice(str);
        return total;
    }

    public static void main(String[] args) {

        ArrayList<String> confg1 = new ArrayList<>(Arrays.asList("Apple", "Mac Mini", "4 gb", "i5", "Red"));
        ArrayList<String> confg2 = new ArrayList<>(Arrays.asList("Apple", "Mac Middle", "8 gb", "i5", "Black"));
        ArrayList<String> confg3 = new ArrayList<>(Arrays.asList("Apple", "Mac Max", "8 gb", "i7", "Silver"));
        ArrayList<String> confg4 = new ArrayList<>(Arrays.asList("Apple", "Mac Max", "16 gb", "i7", "Red"));
        ArrayList<String> confg5 = new ArrayList<>(Arrays.asList("Apple", "Mac Max", "32 gb", "i7", "Black"));
        ArrayList<String> confg6 = new ArrayList<>(Arrays.asList("Samsung", "Creator Mini", "4 gb", "i3", "Red"));
        ArrayList<String> confg7 = new ArrayList<>(Arrays.asList("Samsung", "Creator Middle", "8 gb", "i5", "Black"));
        ArrayList<String> confg8 = new ArrayList<>(Arrays.asList("Samsung", "Creator Max", "16 gb", "i7", "Orange"));
        ArrayList<String> confg9 = new ArrayList<>(Arrays.asList("Samsung", "Creator Max", "32 gb", "i7", "Red"));

        System.out.println("Laptop Configuration is : " + confg1 + "\nTotal price is $ " + getTotalPrice(confg1));
        System.out.println("Laptop Configuration is : " + confg2 + "\nTotal price is $ " + getTotalPrice(confg2));
        System.out.println("Laptop Configuration is : " + confg3 + "\nTotal price is $ " + getTotalPrice(confg3));
        System.out.println("Laptop Configuration is : " + confg4 + "\nTotal price is $ " + getTotalPrice(confg4));
        System.out.println("Laptop Configuration is : " + confg5 + "\nTotal price is $ " + getTotalPrice(confg5));
        System.out.println("Laptop Configuration is : " + confg6 + "\nTotal price is $ " + getTotalPrice(confg6));
        System.out.println("Laptop Configuration is : " + confg7 + "\nTotal price is $ " + getTotalPrice(confg7));
        System.out.println("Laptop Configuration is : " + confg8 + "\nTotal price is $ " + getTotalPrice(confg8));
        System.out.println("Laptop Configuration is : " + confg9 + "\nTotal price is $ " + getTotalPrice(confg9));
    }

}
