package Day55.Java.Abstraction.Example2;

public abstract class Employee {
    private double salary;
    int hours;
    double salaryPerHour;

    public Employee( int hours, double salaryPerHour) {
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    public Employee(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public abstract void calculateSalary();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
