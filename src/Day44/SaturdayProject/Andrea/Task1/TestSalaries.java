package Day44.SaturdayProject.Andrea.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSalaries {

        Employee e1 = new Employee(12.50);
        Employee e2 = new Employee(20.00);
        Employee e3 = new Employee(22.50);
        Employee e4 = new Employee(0);
        Employee e5 = new Employee(-4);
        Employee e6 = new Employee(33.25);
       // ArrayList<Employee> eList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));
    @Test
    public void testNumberOfEmployees(){
        int total = Employee.getNumberOfEmployees();
        Assert.assertEquals(total, 6);
    }

    @Test
    public void testTotalWage(){
        double total = e1.calculateWage(4);
        Assert.assertEquals(total, 575.00, "Total is not correct");
    }

    @Test
    public void testTotalWageFalse(){
        double total = e1.calculateWage(4);
        Assert.assertNotEquals(total, 576.00, "Total is correct");
    }
}

//    -  Create a class TestSalaries
//    -- create a test method to validate number of employees. (you should create multiple employees in the test method)
//    -- create a test method to validate the total wage for one employee
//    -- create another three methods, to validate any other possible scenarios
