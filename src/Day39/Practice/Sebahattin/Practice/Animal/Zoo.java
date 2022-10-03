package Day39.Practice.Sebahattin.Practice.Animal;

public class Zoo {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        Animal wolf = new Animal();

        wolf.setValues("wOlF",40);
        wolf.setShortName();
        wolf.setKmHSpeed();

        monkey.setValues("monKEY",25);
        monkey.setShortName();
        monkey.setKmHSpeed();

        System.out.println(monkey);
        System.out.println(wolf);

    }
}
