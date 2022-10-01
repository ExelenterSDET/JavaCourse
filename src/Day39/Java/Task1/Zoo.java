package Day39.Java.Task1;

public class Zoo {
    public static void main(String[] args) {

        Animal tiger = new Animal();
        Animal wolf =  new Animal();

        tiger.setValues("tigER", 40);
        tiger.setShortName();
        tiger.setKmHSpeed();

        wolf.setValues("WOLF", 50);
        wolf.setShortName();
        wolf.setKmHSpeed();

        System.out.println(tiger);
        System.out.println(wolf);

    }
}
