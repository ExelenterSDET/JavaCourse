package Week11.Task1;

public class HousePrices extends House {
    private static int price;

    public HousePrices(String ownername, ConditionToPriceEnum condition, HouseTypeToPriceEnum houseType, RoomCountToPriceEnum roomCount, int downpayment, int numberofmonth, StatesTax statesTax) {
        super(ownername,condition,houseType,roomCount,downpayment,numberofmonth,statesTax);
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void addPrice(int price) {
        this.price += price;
    }

    public void addTaxtoPrice(StatesTax statesTax) {
        int tsx = this.price*(statesTax.getTaxRate())/100;
        this.price += tsx;
    }

    public int getPrice() {
        roomCountToPrice();
        conditionToPrice();
        houseTypeToPrice();
        calculateTotalPriceOfHouse();
        return price;
    }



    public void roomCountToPrice(){
        switch (super.getRoomCount()){
            case roomCount0:
                addPrice(super.getRoomCount().getPrice());
                break;
            case roomCount1:
                addPrice(super.getRoomCount().getPrice());
                break;
            case roomCount2:
                addPrice(super.getRoomCount().getPrice());
                break;
            case roomCount3:
                addPrice(super.getRoomCount().getPrice());;
                break;
            case roomCount4:
                addPrice(super.getRoomCount().getPrice());
                break;
            case roomCount5:
                addPrice(super.getRoomCount().getPrice());
                break;
        }
    }

    public void conditionToPrice(){
        switch (super.getCondition()){
            case New:
                addPrice(super.getCondition().getPrice());
                break;
            case LikeNew:
                addPrice(super.getCondition().getPrice());
                break;
            case Old:
                addPrice(super.getCondition().getPrice());
                break;
            case RenovationRequired:
                addPrice(super.getCondition().getPrice());
                break;
        }
    }

    public void houseTypeToPrice(){
        switch (super.getHouseType()){
            case Apartment:
                addPrice(super.getHouseType().getPrice());
                break;
            case Condo:
                addPrice(super.getHouseType().getPrice());
                break;
            case House:
                addPrice(super.getHouseType().getPrice());
                break;
        }
    }

    private void calculateTotalPriceOfHouse(){
        switch (super.getStatesTax()){
            case NEW_YORK:
                addTaxtoPrice(super.getStatesTax());
                break;
            case NEW_JERSEY:
                addTaxtoPrice(super.getStatesTax());
                break;
            case FLORIDA:
                addTaxtoPrice(super.getStatesTax());
                break;
            case OHIO:
                addTaxtoPrice(super.getStatesTax());
                break;
        }
    }

    public int getMonthlyPayment(){
        int getmonthlypayment = (price-super.getDownPayment())/super.getNumberOfMonths();
        return getmonthlypayment;
    }
}
