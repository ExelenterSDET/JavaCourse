package Day53.Practice.Dilnoza.Task2;

public class Employee {
    String name;
    double hourlyRate;
    int totalHours;

    public Employee(String name, double hourlyRate, int totalHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }
public double getSalary(){
        return hourlyRate*totalHours;
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                '}';
    }
}
