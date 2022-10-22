package Day53.Practice.Dilnoza.Task2;

public class SDET extends Employee{
    int overTime;

    public SDET(String name, double hourlyRate, int totalHours, int overTime) {
        super(name, hourlyRate, totalHours);
        this.overTime = overTime;
    }
    public double getSalary(){
       return hourlyRate*totalHours+overTime*1.5*hourlyRate;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "overTime=" + overTime +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                '}';
    }
}
