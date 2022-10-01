package Day39.Java.ClassVoidMethodsExamples;

public class Shapes {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleSides(5, 10);

        int perimeter = rectangle.getPerimeter();
        rectangle.perimeter = perimeter;

        rectangle.setArea();

        System.out.println(rectangle);

        System.out.println(perimeter);
    }
}
