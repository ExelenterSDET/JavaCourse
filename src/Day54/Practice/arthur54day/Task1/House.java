package Day54.Practice.arthur54day.Task1;

public class House {
    String ownerName;
    String condition;
    String houseType;
    int roomCount;
    int downPayment;
    int numberOfMonths;
    StatesTax statesTax;


    House(){}
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
