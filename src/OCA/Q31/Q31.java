package OCA.Q31;

public class Q31 {

    public static void main(String[] args) {

    }
}

class Vehicle {
    int x;
    String str;
    Vehicle(){
        this(10);// line n1

    }
    Vehicle(int x){
        this.x = x;
    }
}
class Car extends Vehicle{
    int y;
    Car(){
        super();
//        this(20); // line n2
    }
    Car(int y){
        this.y = y;
    }
    public String toString(){
        return super.x + ":" + this.y;
    }
}