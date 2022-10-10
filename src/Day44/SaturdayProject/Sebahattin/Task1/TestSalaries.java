package Day44.SaturdayProject.Sebahattin.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSalaries {
    Employee employee1 = new Employee(20);
    Employee employee2 = new Employee(30);
    Employee employee3 = new Employee(15);
    Employee employee4 = new Employee(40);

    @Test
    public void testNumberOfEmployees() {
        int num = employee1.getNumberOfEmployees();
        Assert.assertEquals(num, 4);
    }

    @Test
    public void testTotalWage() {

        double total1 = employee1.calculateWage(4);
        double total2 = employee2.calculateWage(4);
        double total3 = employee3.calculateWage(4);
        double total4 = employee4.calculateWage(4);


        Assert.assertEquals(total1, 920);
        Assert.assertEquals(total2, 1380);
        Assert.assertEquals(total3, 690);
        Assert.assertEquals(total4, 1840);
    }
}
