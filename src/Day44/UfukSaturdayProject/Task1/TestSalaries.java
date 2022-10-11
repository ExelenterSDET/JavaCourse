package Day44.UfukSaturdayProject.Task1;

import Day44.UfukSaturdayProject.Task1.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSalaries {
    @Test
    public void numberOfEmployeesValidate(){
        Employee employee = new Employee();
        Employee employee1 =new Employee();
        Employee employee2 = new Employee();
        int expectedNumOfEmp=3;
        Assert.assertEquals(Employee.getNumberOfEmployees(),expectedNumOfEmp);
    }

    @Test
    public void totalWageValidation(){
        double extraHours = 10;
        double baseSalary = 60000;
        double hourlyRate = 25;
        double wage = baseSalary + (hourlyRate*extraHours)*1.5;

        Employee employee = new Employee(baseSalary,hourlyRate);
        Assert.assertEquals(wage,employee.calculateWage(extraHours));
        Assert.assertNotNull(employee.baseSalary);
    }

}
