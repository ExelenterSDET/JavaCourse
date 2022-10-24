package Week11.Task1;

public enum RoomCountToPriceEnum {

    roomCount0(10000),roomCount1(20000),roomCount2(30000),roomCount3(40000),roomCount4(50000),roomCount5(60000);

    private int price;

    RoomCountToPriceEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
