package Day44.UfukSaturdayProject.Task1;

public class Employee {
    double baseSalary;
    double hourlyRate;
    static int numberOfEmployees;

    public Employee() {
        numberOfEmployees++;
    }

    public Employee(double baseSalary, double hourlyRate) {
        this();
       if(baseSalary<0 && hourlyRate<=00 ){
           this.hourlyRate = 14.20;
           this.baseSalary = this.hourlyRate*40;
       }else{
           this.baseSalary = baseSalary;
           this.hourlyRate = hourlyRate;
       }
    }

    public double calculateWage(double extraHours){
        double wage = baseSalary + (hourlyRate * extraHours) * 1.5;
        return wage;
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;

    }


}
