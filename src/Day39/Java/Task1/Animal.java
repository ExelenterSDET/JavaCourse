package Day39.Java.Task1;

public class Animal {
    String name;
    int kmHSpeed;
    int mileHSpeed;
    char shortName;

    public void setValues(String name, int mileHSpeed){
        this.name = name.substring(0,1).toUpperCase()
                +name.substring(1).toLowerCase();
        this.mileHSpeed = mileHSpeed;
    }

    public void setShortName(){
        this.shortName = this.name.charAt(0);
    }

    public void setKmHSpeed(){
        this.kmHSpeed = (int)(this.mileHSpeed * 1.61);
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kmHSpeed=" + kmHSpeed +
                ", mileHSpeed=" + mileHSpeed +
                ", shortName=" + shortName +
                '}';
    }
}
