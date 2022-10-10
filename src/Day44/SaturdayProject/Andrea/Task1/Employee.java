package Day44.SaturdayProject.Andrea.Task1;

public class Employee {

    double baseSalary;
    double hourlyRate;
    private static int numberOfEmployees = 0; //don't need a counter if we are not using the numberOfEmployees as an employee number

    public Employee(double hourlyRate) {
       if (hourlyRate > 0){
           this.hourlyRate = hourlyRate;
       }
       else {
           hourlyRate = 14.20;
       }
       this.baseSalary = hourlyRate * 40;
       numberOfEmployees++;
    }

    public double calculateWage (double extraHours){ //should be void? where do other params come from?
        return baseSalary + (hourlyRate * extraHours) * 1.5;
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}
//    Create a class called Employee with following attributes:
//            -- baseSalary
//    -- hourlyRate
//    -- numberOfEmployees (this field should be increased every time you create a new employee object - you shouldn't have a copy of this field for each object)
//            -	Create a constructor in Employee class to initialize baseSalary and hourlyRate
//            -- baseSalary cannot be less than or equal to zero
//            -- hourlyRate cannot be less than zero
//            -- If these conditions are not true while initializing baseSalary and hourlyRate, then return hourlyRate = 14.20
//                                  Note: baseSalary = (hourlyRate * 40)
//
//  -	Create a method in Employee class called calculateWage with a parameter extraHours.
//      And this method should calculate the wage (wage = baseSalary + (hourlyRate * extraHours) * 1.5)
//
//            -	Create a method in Employee class (named as getNumberOfEmployees) to return the number of employees
//