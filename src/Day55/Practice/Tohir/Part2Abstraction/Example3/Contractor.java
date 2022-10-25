package Day55.Part2Abstraction.Example3;

public class Contractor extends Employee{
    public Contractor(double salary, int hours) {
        super(salary, hours);
    }

    @Override
    public void calculateSalary() {
      super.setSalary(super.hours*super.salaryPerHour);
    }

}
