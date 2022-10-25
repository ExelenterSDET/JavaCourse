package Day55.Part2Abstraction.Example3;

public class FulltimeEmployee extends Employee{

    public FulltimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        super.setSalary(this.salaryPerHour*40);
    }
}
