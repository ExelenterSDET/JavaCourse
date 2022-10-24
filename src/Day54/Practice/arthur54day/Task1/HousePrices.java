package Day54.Practice.arthur54day.Task1;

public class HousePrices extends House{
    int price;

    public HousePrices() {

    }

    public int getPrice() {
        return price;
    }

    public HousePrices(String ownerName, String condition, String houseType, int roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
        super(ownerName, condition, houseType, roomCount, downPayment, numberOfMonths, statesTax);


        roomCountToPrice();
        conditionToPrice();
        houseTypeToPrice();
        calculateTotalPriceOfHouse();
//        createtotalpricehere
    }

    void roomCountToPrice(){
        switch(this.roomCount){
            case(0):
                this.price += 10000;
                break;
            case(1):
                this.price += 20000;
                break;
            case(2):
                this.price += 30000;
                break;
            case(3):
                this.price += 40000;
                break;
            case(4):
                this.price += 50000;
                break;
            case(5):
                this.price += 60000;
                break;

        }

    }

    void conditionToPrice(){
        switch(this.condition){
            case("New"):
                this.price += 50000;
                break;
            case("LikeNew"):
                this.price += 40000;
                break;
            case("Old"):
                this.price += 30000;
                break;
            case("RenovationRequired"):
                this.price += 15000;
                break;
        }
    }

    void houseTypeToPrice(){
        switch(this.houseType) {
            case ("Apartment"):
                this.price += 20000;
                break;
            case ("Condo"):
                this.price += 30000;
                break;
            case ("House"):
                this.price += 40000;
                break;
        }
    }

    private void calculateTotalPriceOfHouse(){

        double dprice;
        dprice = this.price + this.price*statesTax.getStatesTax()/100.0;
        this.price = (int)dprice;

    }

    int getMonthlyPayment(){
        int payment=0;
        double dpayment;
        dpayment = (this.price-this.downPayment)/this.numberOfMonths;
        //must subtract downpayment
        return (int)dpayment;
    }



}
