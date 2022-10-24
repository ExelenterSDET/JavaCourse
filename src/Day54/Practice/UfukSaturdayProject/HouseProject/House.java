package Day54.Practice.UfukSaturdayProject.HouseProject;

public class House {
    private String ownerName;
    private String condition;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int numberOfMonths;
    private StatesTax statesTax;

    public House(String ownerName, String condition, String houseType, int roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
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
