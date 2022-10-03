package Day39.Practice.TohirDay39;

public class Rectangle {
    int Width;
    int Lenght;
    int Perimeter;
    int Area;

    public void setRectangleSides(int width, int lenght) {
        this.Width = width;
        this.Lenght = lenght;
    }
     public void setPerimeter()
     {
         this.Perimeter = 2*(this.Width+this.Lenght);
     }

    public int setArea() {
       return this.Area = this.Lenght*this.Width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Width=" + Width +
                ", Lenght=" + Lenght +
                ", Perimeter=" + Perimeter +
                ", Area=" + Area +
                '}';
    }
}
