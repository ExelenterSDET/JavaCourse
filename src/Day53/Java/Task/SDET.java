package Day53.Java.Task;

public class SDET extends Employee {
    int overTime;

    public SDET(String name, double hourlyRate, int totalHours) {
        super(name, hourlyRate, totalHours);
        setOverTime();

        setSalary();
    }
    public void setOverTime(){
       this.overTime = (this.totalHours > 40) ? this.totalHours - 40 : 0;
    }

    @Override
    public void setSalary(){
        super.salary = (totalHours>40)
                ? (40 * hourlyRate) + (overTime * 1.5 * hourlyRate)
                : hourlyRate * totalHours;
    }

}
