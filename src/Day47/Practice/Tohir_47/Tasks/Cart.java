package Day46.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Cart {
   private final ArrayList<BuyProduct> cart = new ArrayList<>();
   static double Balancedue;

    public void setBalancedue() {
        for(BuyProduct product:this.cart){
            Balancedue += product.TotalPrice;
        }
    }
    @Test
    public void testBalanceDue()
    {
        //BuyProduct cola = new BuyProduct(Drink.COLA,2);
        //BuyProduct sprite = new BuyProduct(Drink.SPRITE,4);
        cart.add(new BuyProduct(Drink.COLA,2));
        cart.add(new BuyProduct(Drink.SPRITE,5));
        cart.add(new BuyProduct(Drink.FANTA,9));
        cart.add(new BuyProduct(Drink.PEPSI,1));
        for (BuyProduct product : cart) {
            System.out.println(product);
        }
        setBalancedue();
        String fortmat = String.format("%.2f",Balancedue);
        Assert.assertEquals(Double.parseDouble(fortmat),33.6);
       //Assert.assertEquals(Double.parseDouble(fortmat),33.48);

    }

}
