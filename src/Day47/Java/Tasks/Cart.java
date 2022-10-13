package Day47.Java.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<BuyProduct> cart = new ArrayList<>();
    static double balanceDue;

    public void setBalanceDue(){
        for(BuyProduct product : this.cart){
            balanceDue += product.totalPrice;
        }
    }

    @Test
    public void testBalance(){

        cart.add(new BuyProduct(Drink.COLA, 2));
        cart.add(new BuyProduct(Drink.SPRITE, 1));
        cart.add(new BuyProduct(Drink.FANTA, 3));
        cart.add(new BuyProduct(Drink.PEPSI, 2));
        setBalanceDue();

        String balanceDueFormatted = String.format("%.2f", balanceDue);

        System.out.println("Your total is = $" + balanceDueFormatted);
        cart.forEach(a -> System.out.println(a));

        Assert.assertEquals(Double.parseDouble(balanceDueFormatted),15.85);
    }

}
