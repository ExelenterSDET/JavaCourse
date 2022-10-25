package Day55.Part2Abstraction.Example3;

public abstract class Employee {
    private static double salary;
    int hours;
    double salaryPerHour;
    public abstract void calculateSalary();

    public Employee(double salaryPerHour, int hours) {
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }

    public Employee(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
