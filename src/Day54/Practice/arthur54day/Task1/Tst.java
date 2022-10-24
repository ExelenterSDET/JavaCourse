package Day54.Practice.arthur54day.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Tst {
    @Test
    public void test1() {
        HousePrices housePrices = new HousePrices(
                "Fernando",
                "New",
                "Apartment",
                3,
                40000,
                30,
                StatesTax.OHIO);
        System.out.println("name");
        Assert.assertEquals( "Fernando", housePrices.getOwnerName(),"Testing the name of the owner name of the house:");
        System.out.println("price");
        Assert.assertEquals( 123200, housePrices.getPrice());
        System.out.println("payment");
        Assert.assertEquals(2773, housePrices.getMonthlyPayment());
    }

    @Test
    public void test2() {
        HousePrices housePrices = new HousePrices(
                "David",
                "LikeNew",
                "House",
                5,
                50000,
                30,
                StatesTax.NEW_YORK);
        Assert.assertEquals( "David", housePrices.getOwnerName(),"Testing the name of the owner name of the house:");
        Assert.assertEquals( 168000, housePrices.getPrice(),"Testing the total price of the house:");
        Assert.assertEquals(3933, housePrices.getMonthlyPayment(),"Testing the monthly payment of the house:");
    }

    @Test
    public void test3() {
        HousePrices housePrices = new HousePrices(
                "Emily",
                "Old",
                "Condo",
                4,
                30000,
                36, StatesTax.FLORIDA);
        Assert.assertEquals( "Emily", housePrices.getOwnerName());
        Assert.assertEquals(115500, housePrices.getPrice());
        Assert.assertEquals(2375, housePrices.getMonthlyPayment());
    }

    @Test
    public void test4() {
        HousePrices housePrices = new HousePrices(
                "Rinda",
                "Renovation Required",
                "Condo",
                1,
                50000,
                35, StatesTax.NEW_JERSEY);
        Assert.assertEquals("Rinda", housePrices.getOwnerName());
        Assert.assertEquals( 74750, housePrices.getPrice());
        Assert.assertEquals(707, housePrices.getMonthlyPayment());
    }

}
