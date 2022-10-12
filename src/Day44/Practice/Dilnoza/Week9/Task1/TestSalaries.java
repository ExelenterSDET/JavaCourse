package Day44.Practice.Dilnoza.Week9.Task1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSalaries {
        Employee employee1 = new Employee(65000,45);
        Employee employee2 = new Employee(45000,25);
        Employee employee3 = new Employee(65000,35);
        Employee employee4 = new Employee(35000,45);
        Employee employee5 = new Employee(25000,15);
        Employee employee6 = new Employee(25000,15);

        @Test
        public void testNumberOfEmployees (){
            int num = Employee.getNumberOfEmployees();
            Assert.assertEquals(num,6);
        }
        @Test
        public void testTotalWage(){

            double total = employee1.calculateWage(4);
            Assert.assertEquals(total, 2070.0);
        }




    }
