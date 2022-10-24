package Day54.Practice.DilnozaSP.Task1;

public class HousePrices extends House {
    private int price;

    public int getPrice() {
        return price;
    }

    public HousePrices(String ownerName, String condition, String houseType, int roomCount, int downPayment, int numberOfMonths, StatesTax statesTax) {
        super(ownerName, condition, houseType, roomCount, downPayment, numberOfMonths,statesTax);
        calculateTotalPriceOfHouse();
    }
public void roomCountToPrice(){

        if (getRoomCount()==0){
            price+=10000;
        }else if (getRoomCount()==1){
            price+=20000;
        }else if (getRoomCount()==2){
            price+=30000;
        }else if (getRoomCount()==3){
            price+=40000;
        }else if (getRoomCount()==4){
            price+=50000;
        }else if (getRoomCount()==5){
            price+=60000;
        }

    }

    public void conditionToPrice(){
        if (getCondition().equalsIgnoreCase("new")){
            price+=50000;
        }else if (getCondition().equalsIgnoreCase("LikeNew")){
            price+=40000;
        }else if (getCondition().equalsIgnoreCase("old")){
            price+=30000;
        }else if (getCondition().equalsIgnoreCase("Renovation Required")){
            price+=15000;
    }
    }

    public void houseTypeToPrice(){
        if(getHouseType().equalsIgnoreCase("Apartment")){
            price+=20000;
        }else if(getHouseType().equalsIgnoreCase("Condo")){
            price +=30000;
        }else if(getHouseType().equalsIgnoreCase("House")){
            price+=40000;
        }



        }

    private void calculateTotalPriceOfHouse() {
        price=0;
        this.roomCountToPrice();
        this.conditionToPrice();
        this.houseTypeToPrice();
        int ttlPrice = price *this.getStatesTax().getRate() / 100;
        price +=  ttlPrice;


    }
    public int getMonthlyPayment(){
        return (getPrice()-getDownPayment())/getNumberOfMonths();

        }


}






