package Day55.Java.Abstraction.Example2;

public class Contractor extends Employee {


    public Contractor(int hours, double salaryPerHour) {
        super(hours, salaryPerHour);
    }

    @Override
    public void calculateSalary() {
        super.setSalary(super.hours * salaryPerHour);
    }
}
