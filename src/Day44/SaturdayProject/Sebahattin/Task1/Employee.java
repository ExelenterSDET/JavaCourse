package Day44.SaturdayProject.Sebahattin.Task1;

public class Employee {
        public double baseSalary;
        public double hourlyRate;
        public static int numberOfEmployees;

    public Employee (double hourlyRate) {
        if (hourlyRate < 0) {
            this.hourlyRate = 14.20;

        } else {
            this.hourlyRate = hourlyRate;
        }
        this.baseSalary = (this.hourlyRate * 40);
        numberOfEmployees++;
    }
    public double calculateWage (int extraHours){

        return (baseSalary + (hourlyRate * extraHours) * 1.5);
    }
    public int getNumberOfEmployees (){

        return numberOfEmployees;
    }
}

