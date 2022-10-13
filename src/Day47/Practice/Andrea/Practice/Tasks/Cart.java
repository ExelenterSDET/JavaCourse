package Day47.Practice.Andrea.Practice.Tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class Cart {

    private final ArrayList<BuyProduct> cart = new ArrayList<>();

    static double balanceDue;

    void getBalanceDue(){
        for (BuyProduct product : this.cart) {
            balanceDue += product.totalPrice;
        }
    }

    @Test
    public void testBalance(){

        cart.add(new BuyProduct(Drink.PEPSI, 5));
        cart.add(new BuyProduct(Drink.SPRITE, 3));
        cart.add(new BuyProduct(Drink.FANTA, 5));
        getBalanceDue();

        cart.forEach(a -> System.out.println(a));
        System.out.println(balanceDue);


    }
}
