package Week11.Task1;

public enum ConditionToPriceEnum {
    New(50000),LikeNew(40000),Old(30000),RenovationRequired(15000);

    private int price;

//    New(50000),


    ConditionToPriceEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
