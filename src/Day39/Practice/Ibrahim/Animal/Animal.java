package Day39.Practice.Ibrahim.Animal;

public class Animal {
    String name;
    double speedInKm;
    double speedInMile;
    String shortName;

    public void setAnimal(String name, double speedInMile){
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        this.speedInMile = speedInMile;
    }
    public void setShortName(){
        this.shortName = this.name.substring(0,1);
    }
    public void mileToKm(){
        this.speedInKm = Math.round(this.speedInMile * 1.61);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name ='" + name + '\'' +
                ", speedInKm = " + speedInKm +
                ", speedInMile = " + speedInMile +
                ", shortName ='" + shortName + '\'' +
                '}';
    }
}
