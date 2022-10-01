package Day39.Practice.Andrea.Task2;

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

    public void setMPHtoKm(){
        this.kmHSpeed = (int) (this.mileHSpeed * 1.6);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", kmHSpeed=" + kmHSpeed +
                ", mileHSpeed=" + mileHSpeed +
                ", shortName=" + shortName +
                '}';
    }


}
