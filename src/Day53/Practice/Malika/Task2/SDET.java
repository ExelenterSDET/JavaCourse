package Day53.Practice.Malika.Task2;

public class SDET extends Employee {
    double overtime;

    public SDET(String name, double hourlyRate, int totalHours) {
        super(name, hourlyRate, totalHours);
        setOverTime();
        setSalary();
    }

    public void setOverTime() {
        this.overtime = (this.totalHours > 40) ? this.totalHours - 40 : 0;
    }

    @Override
    public void setSalary() {
        super.salary = (totalHours > 40)
                ? (40 * hourlyRate) + (overtime * 1.5 * hourlyRate)
                : hourlyRate * totalHours;
    }
}



