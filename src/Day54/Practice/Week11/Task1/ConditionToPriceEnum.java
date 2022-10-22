package Day54.Practice.Week11.Task1;

public enum ConditionToPriceEnum {
    New(5000),LikeNew(4000),Old(3000),RenovationRequired(1500);

    public int price;

//    New(50000),


    ConditionToPriceEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
