package Day44.SaturdayProject.Tohir.TohirTask1;

public class Employee {
    double Basesalary;
    double hourlyRate;
   static int NumberOfEmployees = 0;

    public void EmployeeNumber()
    {
       NumberOfEmployees++;
    }
    public Employee()
    {
        this.hourlyRate =14.2;
        this.Basesalary = 40*this.hourlyRate;
        EmployeeNumber();
    }
    public Employee(double basesalary, double hourlyRate) {
        if(basesalary >0 && basesalary!=0 && hourlyRate>0)
        {
            Basesalary = basesalary;
        this.hourlyRate = hourlyRate;
            EmployeeNumber();
        }
    }

    public double calculateWage(int extraHours)
    {
        return this.Basesalary+(this.hourlyRate*extraHours)*1.5;
    }

    public int getNumberOfEmployees() {
        return NumberOfEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Basesalary=" + Basesalary +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
