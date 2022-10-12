package Day44.Practice.Ibrahim.Saturday.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test_Employee {

    Employee em = new Employee(5);
    Employee em1 = new Employee(15);
    Employee em2 = new Employee(25);

    @Test
    public void validateEmployeeNumbers(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(em);
        employeeList.add(em1);
        employeeList.add(em2);

        Assert.assertEquals(employeeList.size(), Employee.numberOfEmployees);
    }

    @Test
    public void testTotalWage(){
        double totalWageOfEm = 237.5;
        double totalWageOfEm1 = 825;
        double totalWageOfEm2 = 1562.5;
        Assert. assertEquals(totalWageOfEm, em.calculateWage(5));
        Assert. assertEquals(totalWageOfEm1, em1.calculateWage(10));
        Assert. assertEquals(totalWageOfEm2, em2.calculateWage(15));
    }

    @Test
    public void Em1MoreThanEm2(){
        Assert.assertFalse(em1.calculateWage(0) > em2.calculateWage(0)  );

    }
}
