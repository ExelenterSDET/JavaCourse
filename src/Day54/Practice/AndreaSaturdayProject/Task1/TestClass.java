package Day54.Practice.AndreaSaturdayProject.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass {

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

        Assert.assertEquals(housePrices.getOwnerName(), "Fernando", "Testing the name of the owner name of the house: ");
        Assert.assertEquals(housePrices.getPrice(), 123200, "Testing the total price of the house: ");
        Assert.assertEquals(housePrices.getMonthlyPayment(),2773,  "Testing the monthly payment of the house: ");
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
        Assert.assertEquals(housePrices.getOwnerName(), "David", "Testing the name of the owner name of the house: ");
        Assert.assertEquals(housePrices.getPrice(), 168000, "Testing the total price of the house: ");
        Assert.assertEquals(housePrices.getMonthlyPayment(), 3933, "Testing the monthly payment of the house: ");
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
        Assert.assertEquals(housePrices.getOwnerName(), "Emily",  "Testing the name of the owner name of the house: ");
        Assert.assertEquals(housePrices.getPrice(), 115500, "Testing the total price of the house: ");
        Assert.assertEquals(housePrices.getMonthlyPayment(),2375, "Testing the monthly payment of the house: ");
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
        Assert.assertEquals(housePrices.getOwnerName(), "Rinda", "Testing the name of the owner name of the house: ");
        Assert.assertEquals(housePrices.getPrice(), 74750, "Testing the total price of the house: ");
        Assert.assertEquals(housePrices.getMonthlyPayment(),707, "Testing the monthly payment of the house:");
    }
}
