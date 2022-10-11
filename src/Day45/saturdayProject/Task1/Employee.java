package Day45.saturdayProject.Task1;

public class Employee {
    double baseSalary;
    double hourlyRate;
    static int numberOfEmployee;

    public Employee(){
        numberOfEmployee++;
    }
    public Employee(double baseSalary, double hourlyRate) {
        this();
       if(baseSalary < 0 && hourlyRate<= 0){
           this.hourlyRate =14.20;
           this.baseSalary = (this.hourlyRate * 40);
       }else {
           this.baseSalary = baseSalary;
           this.hourlyRate = hourlyRate;
       }
    }
    public  double calculateWage(double extraHours){
        return baseSalary + (hourlyRate * extraHours) * 1.5;
    }
    public static int getNumberOfEmployee(){
        return numberOfEmployee;
    }
}
