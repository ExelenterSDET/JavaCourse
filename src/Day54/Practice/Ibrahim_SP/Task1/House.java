package Day54.Practice.Ibrahim_SP.Task1;

public class House {

    private final String ownerName;
    private final String condition;
    private final String houseType;
    private final int roomCount;
    private final int downPayment;
    private final int numberOfMonths;
    private final StatesTax statesTax;

    public House(String ownerName, String condition, String houseType, int roomCount,
                 int downPayment, int numberOfMonths, StatesTax statesTax) {
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

    public String getCondition() {
        return condition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
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
