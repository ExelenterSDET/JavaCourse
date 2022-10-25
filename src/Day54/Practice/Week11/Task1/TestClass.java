package Week11.Task1;

import Day54.StaticInheritance.C;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void test1() {
        HousePrices housePrices = new HousePrices("Fernando", ConditionToPriceEnum.New, HouseTypeToPriceEnum.Apartment,RoomCountToPriceEnum.roomCount3,40000,30, StatesTax.OHIO);
        Assert.assertEquals( "Fernando", housePrices.getOwnerName(),"Testing the name of the owner name of the house:");
        Assert.assertEquals(123200, housePrices.getPrice(),"Testing the total price of the house:");
        Assert.assertEquals(2773, housePrices.getMonthlyPayment(),"Testing the monthly payment of the house:");
    }
    @Test
    public void test2() {
        HousePrices housePrices = new HousePrices(
                "David",
                ConditionToPriceEnum.LikeNew,
                HouseTypeToPriceEnum.House,
                RoomCountToPriceEnum.roomCount5,
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
                ConditionToPriceEnum.Old,
                HouseTypeToPriceEnum.Condo,
                RoomCountToPriceEnum.roomCount4,
                30000,
                36, StatesTax.FLORIDA);
        Assert.assertEquals("Emily", housePrices.getOwnerName(), "Testing the name of the owner name of the house:");
        Assert.assertEquals( 115500, housePrices.getPrice(),"Testing the total price of the house:");
        Assert.assertEquals(2375, housePrices.getMonthlyPayment(),"Testing the monthly payment of the house:");
    }
    @Test
    public void test4() {
        HousePrices housePrices = new HousePrices(
                "Rinda",
                ConditionToPriceEnum.RenovationRequired,
                HouseTypeToPriceEnum.Condo,
                RoomCountToPriceEnum.roomCount1,
                50000,
                35, StatesTax.NEW_JERSEY);
        Assert.assertEquals("Rinda", housePrices.getOwnerName(),"Testing the name of the owner name of the house:" );
        Assert.assertEquals(74750, housePrices.getPrice(),"Testing the total price of the house:");
        Assert.assertEquals(707, housePrices.getMonthlyPayment(),"Testing the monthly payment of the house:");
    }
}
