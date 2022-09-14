package Day24.Practice.Mustafa;

public class Task {
    // Create a method which will return the perimeter of the triangle
    // Create a method which will return the perimeter of the rectangle
    // Create a method which will return the perimeter of Pentagon, Octagon or Decagon
    static int PTriangle(int a, int b, int c){
        return a+b+c;

    }
    static int PRectangle(int a, int b){
        return a+a+b+b;
    }
    static int PShape(int numangle, int a){
        return numangle * a;
    }
}
