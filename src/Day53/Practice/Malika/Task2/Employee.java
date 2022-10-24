package Day53.Practice.Malika.Task2;
public class Employee {
    String name;
    double hourlyRate;
    double totalHours;
    double salary;

    public Employee(String name, double hourlyRate, double totalHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
        setSalary();
    }
    public void setSalary (){
        this.salary = hourlyRate * totalHours;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +
                " name = '" + name + '\'' +
                ", hourlyRate = " + hourlyRate +
                ", totalHours = " + totalHours +
                ", salary = " + salary +
                '}';
    }
}


