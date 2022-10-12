package Day44.Practice.Ibrahim.Saturday.Task1;

public class Employee {
    double baseSalary;
    double hourlyRate;
    public static int numberOfEmployees;



    public Employee() {
        numberOfEmployees ++;
    }

    public Employee(double hourlyRate) {
        this();
        this. hourlyRate = hourlyRate < 0 ? 14.20 : hourlyRate;
        this.baseSalary = this.hourlyRate * 40;
    }

    public double calculateWage(double extraHours){
        extraHours = extraHours <= 0 ? 1 : extraHours;
        return this.baseSalary + (this.hourlyRate * extraHours) * 1.5;
    }
    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
