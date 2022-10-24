package Day54.Practice.AndreaSaturdayProject.Task1;

public class HousePrices extends House {

    private static int price;

    public HousePrices(String ownerName, String condition, String houseType, int roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
        super(ownerName, condition, houseType, roomCount, downPayment, numberOfMonths, statesTax);
        calculateTotalPriceOfHouse();
    }

    public int getPrice() {
        return price;
    }

    public void roomCountToPrice(){
        if (this.getRoomCount() == 0) {
            price += 10000;
        }
        if (getRoomCount() == 1) {
            price += 20000;
        }
        if (getRoomCount() == 2) {
            price += 30000;
        }
        if (getRoomCount() == 3) {
            price += 40000;
        }
        if (getRoomCount() == 4) {
            price += 50000;
        }
        if (getRoomCount() == 5) {
            price += 60000;
        }
    }

    public void conditionToPrice(){
        if (getCondition().equalsIgnoreCase("New")){
            price += 50000;
        }
        if (getCondition().equalsIgnoreCase("LikeNew")){
            price += 40000;
        }
        if (getCondition().equalsIgnoreCase("Old")){
            price += 30000;
        }
        if (getCondition().equalsIgnoreCase("Renovation Required")){
            price += 15000;
        }
    }

    public void houseTypeToPrice(){
        if (getHouseType().equalsIgnoreCase("Apartment")){
            price += 20000;
        }
        if (getHouseType().equalsIgnoreCase("Condo")){
            price += 30000;
        }
        if (getHouseType().equalsIgnoreCase("House")){
            price += 40000;
        }
    }

    private void calculateTotalPriceOfHouse(){
        price = 0;
        this.roomCountToPrice();
        this.conditionToPrice();
        this.houseTypeToPrice();
        int taxes = price * this.getStatesTax().getTaxRate()/100;
        price += taxes;
    }

    public int getMonthlyPayment(){
        return (getPrice()-getDownPayment())/getNumberOfMonths();
    }

}


