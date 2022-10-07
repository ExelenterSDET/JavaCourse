package Day43.Java.clothing.pants;

import static Day43.Java.clothing.Shirt.*;


public class Jeans {
    public void matchShirt(){
        String color = getColor();
        if(color.equals("Green")){
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {

        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
