package Day39.Practice.TohirDay39;

public class Animal_Tohir {
    String Name;
    double Speed_km_h;
    int Speed_miles_h;
    String ShortName;

    public void setAnimal(String name, int speed_miles_h) {
        this.Name = name;
        this.Speed_miles_h = speed_miles_h;
    }
    public void setShortName()
    {
        this.ShortName = this.Name.substring(0,1);
    }
    public void SetCamelCaseName(String name, int speed_miles_h)
    {
        this.Name = name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
        this.Speed_miles_h = speed_miles_h;
    }
    public void setSpeed_km_h()
    {
        this.Speed_km_h =1.61*this.Speed_miles_h;
    }

    @Override
    public String toString() {
        return "Animals_Tohir{" +
                "Name='" + Name + '\'' +
                ", Speed_km_h=" + Speed_km_h +
                ", Speed_miles_h=" + Speed_miles_h +
                ", ShortName='" + ShortName + '\'' +
                '}';
    }


}
