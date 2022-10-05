package Day40.Practice.Andrea.Practice.Task2;

public class Rectangle {

    private int length, width;
    int area, perimeter;

    private void setPerimeter (){
        this.perimeter = 2 * (this.length + this.width);
    }

    private void setArea (){
        this.area = this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        setArea();
        setPerimeter();
    }
}
