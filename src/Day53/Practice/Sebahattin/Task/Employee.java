package Day53.Practice.Sebahattin.Task;

public class Employee {
    String name;
    double hourlyRate;
    int totalHours;
    double salary;

    public Employee(String name, double hourlyRate, int totalHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
        setSalary();
    }

    public  void setSalary() {
        this.salary = totalHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                ", salary=" + salary +
                '}';
    }
}
