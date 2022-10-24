package Week11.Task1;

public class TesttoWork {

  public static void main(String[] args) {
        HousePrices housePrices = new HousePrices("Fernando", ConditionToPriceEnum.New, HouseTypeToPriceEnum.Apartment,RoomCountToPriceEnum.roomCount3,40000,30, StatesTax.OHIO);
        System.out.println(housePrices.getOwnerName());
        System.out.println(housePrices.getPrice());
        System.out.println(housePrices.getMonthlyPayment());
    }
}
