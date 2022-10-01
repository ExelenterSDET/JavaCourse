package Day39.Practice.Anthony.Task1;

public class Shapes {
    public static void main(String[] args) {
        
        //Instance or object of the class
        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleSides(5,10);
        rectangle.setPerimeter();
        rectangle.setArea();

        System.out.println("rectangle = " + rectangle);
    }
}
