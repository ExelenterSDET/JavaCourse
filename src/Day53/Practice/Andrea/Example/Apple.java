package Day53.Practice.Andrea.Example;

public class Apple extends Fruit{

    int discount;

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        super.price = price - (price * discount/100);
    }

}
