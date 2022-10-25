package Week11.Task1;

public class House {

   private String ownerName;
   private ConditionToPriceEnum condition;
   private HouseTypeToPriceEnum houseType;
   private RoomCountToPriceEnum roomCount;
   private int downPayment;
   private int numberOfMonths;
   private StatesTax statesTax;

   public House(){}

    public House(String ownerName, ConditionToPriceEnum condition, HouseTypeToPriceEnum houseType, RoomCountToPriceEnum roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
        this.ownerName = ownerName;
        this.condition = condition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.numberOfMonths = numberOfMonths;
        this.statesTax = statesTax;

    }

    public String getOwnerName() {
        return ownerName;
    }

    public ConditionToPriceEnum getCondition() {
        return condition;
    }

    public HouseTypeToPriceEnum getHouseType() {
        return houseType;
    }

    public RoomCountToPriceEnum getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }


}
