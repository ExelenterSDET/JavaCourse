package Day40.Practice.Anthony.Task1.Package3;

public class taskRectangle {

    private int length;
    private int width;
    public double area;
    public double perimeter;

    private void calculatePerimeter() {


        this.perimeter = 2 *(this.length+this.width);

    }

    private void calculateArea(){
        this.area = (this.length*this.width);
    }

    public taskRectangle(int length, int width) {
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public String toString() {
        return "taskRectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
