package Day39.Practice.TohirDay39;

public class Voidfunctions {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleSides(5,8);
        int area = rectangle.setArea();
        rectangle.setPerimeter();
        System.out.println(rectangle);
        Animal_Tohir animals_tohir = new Animal_Tohir();
        animals_tohir.setAnimal("Camel",12);
        animals_tohir.setShortName();
        //System.out.println(animals_tohir);
        animals_tohir.SetCamelCaseName("dOg",12);
        animals_tohir.setShortName();
        animals_tohir.setSpeed_km_h();
        System.out.println(animals_tohir);
        animals_tohir.SetCamelCaseName("CheeTaH",45);
        animals_tohir.setShortName();
        animals_tohir.setSpeed_km_h();
        System.out.println(animals_tohir);
    }
}
