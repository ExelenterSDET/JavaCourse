package Day47.Practice.Ibrahim.Task;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<BuyProduct> cart = new ArrayList<>();
    static double balanceDue;

    public void calculateBalanceDue(){
        for(BuyProduct product : cart){
            balanceDue += product.totalPrice;
        }
    }

    @Test
    public void testBalance(){
        BuyProduct p1 = new BuyProduct(Drink.COLA, 1);
        BuyProduct p2 = new BuyProduct(Drink.SPRITE, 5);

        cart.add(p1);
        cart.add(p2);
        calculateBalanceDue();
        double expected = Drink.COLA.price * p1.qty + Drink.SPRITE.price * p2.qty;
        double actual = Cart.balanceDue;

        Assert.assertEquals(actual, expected);

        cart.forEach(p -> System.out.println(p));
        System.out.println("balanceDue = " + balanceDue);
    }
}
