package Day55.Java.Abstraction.Example2;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(double salaryPerHour) {
        super(salaryPerHour);
    }

    @Override
    public void calculateSalary() {
       super.setSalary(super.salaryPerHour * 40);
    }
}
