package Day39.Practice.Anthony.Task1;

public class Rectangle {

    int length;
    int width;
    //encapsulation
    //setters and getters
    //private

    int perimeter;
    int area;

    public void setRectangleSides(int length, int width){

        this.length = length;
        this.width = width;

    }
    public void setPerimeter(){
        this.perimeter = 2*(this.length+this.width);
    }
    public void setArea(){
        this.area = this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
