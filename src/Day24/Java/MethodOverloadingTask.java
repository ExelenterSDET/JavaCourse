package Day24.Java;

public class MethodOverloadingTask {
    // Create a method which will return the perimeter of the triangle
    // Create a method which will return the perimeter of the rectangle
    // Create a method which will return the perimeter of Pentagon, Octagon or Decagon
    public static void main(String[] args) {

    }

    public static int getPerimeter(int a, int b, int c){
        return a+b+c;
    }

    public static int getPerimeter(int width, int length){
        return 2*(width+length);
    }

    public static int getPerimeter(byte numSides, int side){
        return numSides*side;
    }

}
