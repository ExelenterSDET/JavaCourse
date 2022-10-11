package Day45.saturdayProject.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSalaries {
    @Test
    public void validateNumberEmployee(){
       /* Employee employee = new Employee();

        int employeeNumber = 1;
        Assert.assertEquals(employeeNumber, Employee.getNumberOfEmployee());*/
    }
    @Test
    public void validateTotalWage(){
            double baseSalary = 65000;
            double hourlyRate = 20;
            double extraHours = 10;
            double expectedWage = baseSalary + (hourlyRate * extraHours) * 1.5;

            Employee employee1 = new Employee(baseSalary, hourlyRate);

            Assert.assertEquals(expectedWage, employee1.calculateWage(extraHours));
            Assert.assertNotNull(employee1.baseSalary);
            
    }

}
