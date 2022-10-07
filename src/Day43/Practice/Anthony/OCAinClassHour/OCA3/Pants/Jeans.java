package Day43.Practice.Anthony.OCAinClassHour.OCA3.Pants;//package clothing.pants

import Day43.Practice.Anthony.OCAinClassHour.OCA3.Clothing.Shirt;

//line n1
public class Jeans {
    public void matchShirt (){
        String color = Shirt.getColor();//line n2
        if(color.equals("Green")){
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
