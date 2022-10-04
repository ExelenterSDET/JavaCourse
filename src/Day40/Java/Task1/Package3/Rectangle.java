package Day40.Java.Task1.Package3;

public class Rectangle {
    private int length;
    int width;
    public int area;
    int perimeter;
    protected int value;

    private void setPerimeter(){
        this.perimeter = 2 * (this.length + this.width);
    }

    private void setArea(){
        this.area = this.length * this.width;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        setPerimeter();
        setArea();
    }


    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
