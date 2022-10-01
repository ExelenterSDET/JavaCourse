package Day39.Java.ClassVoidMethodsExamples;

public class Rectangle {
    int length;
    int width;
    int perimeter;
    int area;

    public void setRectangleSides(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        return 2 *( this.length + this.width);
    }

    public void setArea(){
        this.area = this.length * this.width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
