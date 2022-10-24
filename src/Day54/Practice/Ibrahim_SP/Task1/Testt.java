package Day54.Practice.Ibrahim_SP.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Testt {

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
        Assert.assertEquals("Fernando", housePrices.getOwnerName());
        Assert.assertEquals(123200, housePrices.getPrice());
        Assert.assertEquals(2773, housePrices.getMonthlyPayment());
    }

    @Test
    public void test2() {
        HousePrices housePrices = new HousePrices(
                "David",
                "Like New",
                "House",
                5,
                50000,
                30,
                StatesTax.NEW_YORK);
        Assert.assertEquals("David", housePrices.getOwnerName());
        Assert.assertEquals(168000, housePrices.getPrice());
        Assert.assertEquals(3933, housePrices.getMonthlyPayment());
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
        Assert.assertEquals("Emily", housePrices.getOwnerName());
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
        Assert.assertEquals(74750, housePrices.getPrice());
        Assert.assertEquals(707, housePrices.getMonthlyPayment());
    }
}

