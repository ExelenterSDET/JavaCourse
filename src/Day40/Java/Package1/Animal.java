package Day40.Java.Package1;

public class Animal {
    private String name;
    private int speed;
    String color;

    public Animal(String name, int speed, String color) {
        this(name, speed);
        this.color = color;
    }

    public Animal(String name, int speed) {
        this();
        this.name = name;
        this.speed = speed;
    }

    private Animal() {
        this.color = "any color";
    }

    public void print(){
        System.out.println(this.name + " " + this.color + " " + this.speed);
    }
}

class Fish{
    String name;
}
