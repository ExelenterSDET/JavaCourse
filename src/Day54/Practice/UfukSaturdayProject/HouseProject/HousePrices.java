package Day54.Practice.UfukSaturdayProject.HouseProject;

public class HousePrices  extends House{
    private int price;

    public int getPrice() {
        return price;
    }

    public HousePrices(String ownerName, String condition, String houseType, int roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
        super(ownerName, condition, houseType, roomCount, downPayment, numberOfMonths, statesTax);
        calculateTotalPriceOfHouse();
    }

    public void roomCountToPrice(){
        if(getRoomCount()==0){price+=10000;}
        else if (getRoomCount()==1) {price+=20000;}
        else if (getRoomCount()==2) {price+=30000;}
        else if (getRoomCount()==3) {price+=40000;}
        else if (getRoomCount()==4) {price+=50000;}
        else if (getRoomCount()==5) {price+=60000;}
    }

    public void conditionToPrice(){
        if(getCondition().equals("New")){price+=50000;}
        else if (getCondition().equals("LikeNew")) {price+=40000;}
        else if (getCondition().equals("Old")) {price+=30000;}
        else if (getCondition().equals("Renovation Required")) {price+=15000;}
    }

    public void houseTypeToPrice(){
        if(getHouseType().equals("Apartment")){price+=20000;}
        else if (getHouseType().equals("Condo")) {price+=30000;}
        else if (getHouseType().equals("House")) {price+=40000;}
    }

    private int calculateTotalPriceOfHouse(){
        price=0;
        roomCountToPrice();
        conditionToPrice();
        houseTypeToPrice();
        price+= price*getStatesTax().getRate()/100;
        return price;
    }

    public int getMonthlyPayment(){
         int monthly_payment=(calculateTotalPriceOfHouse()-getDownPayment())/getNumberOfMonths();
         return monthly_payment;
    }
}
