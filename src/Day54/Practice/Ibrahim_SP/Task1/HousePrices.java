package Day54.Practice.Ibrahim_SP.Task1;

public class HousePrices extends House{

    int price;
    public HousePrices(String ownerName, String condition, String houseType, int roomCount,
                       int downPayment, int numberOfMonths, StatesTax statesTax) {
        super(ownerName, condition, houseType, roomCount, downPayment,
                numberOfMonths, statesTax);
    }

    public void roomCountToPrice(){
        switch (getRoomCount()){
            case 0 : this.price += 10000;break;
            case 1 : this.price += 20000;break;
            case 2 : this.price += 30000;break;
            case 3 : this.price += 40000;break;
            case 4 : this.price += 50000;break;
            case 5 : this.price += 60000;break;
        }
    }

    public void conditionToPrice(){
        switch (getCondition()){
            case "New" : this.price += 50000;break;
            case "Like New" : this.price += 40000;break;
            case "Old" : this.price += 30000;break;
            case "Renovation Required" : this.price += 15000;break;
        }
    }

    public void houseTypeToPrice(){
        switch (getHouseType()){
            case "Apartment" : this.price += 20000;break;
            case "Condo" : this.price += 30000;break;
            case "House" : this.price += 40000;break;
        }
    }

    public double calculateTotalPriceOfHouse(){
        roomCountToPrice();
        conditionToPrice();
        houseTypeToPrice();
        this.price += this.price * getStatesTax().taxRate / 100;
        return price;
    }

    public double getPrice(){
       return calculateTotalPriceOfHouse();
    }

    public int getMonthlyPayment(){
        return ((this.price - this.getDownPayment()) / this.getNumberOfMonths());
    }

}
