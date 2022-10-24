package Week11.Task1;

public enum HouseTypeToPriceEnum {
    Apartment(20000),Condo(30000),House(40000);

    public int price;
    HouseTypeToPriceEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
