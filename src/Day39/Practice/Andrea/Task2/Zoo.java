package Day39.Practice.Andrea.Task2;

public class Zoo {
    public static void main(String[] args) {


        Animal cheetah = new Animal();
        Animal orca = new Animal();

        cheetah.setValues("Cheetah", 40);
        cheetah.setShortName();
        cheetah.setMPHtoKm();

        orca.setValues("orca", 65);
        orca.setShortName();
        orca.setMPHtoKm();

        System.out.println(cheetah);
        System.out.println(orca);

    }
}
