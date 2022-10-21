package Day53.Java.Example;

public class Fruit {
    String name;
    String color;
    double price;

    public Fruit() {
    }

    public Fruit(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
