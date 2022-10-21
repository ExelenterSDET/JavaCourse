package Day53.Practice.Dilnoza.Task2;

public class HR {
    public static void main(String[] args) {
        Employee employee = new Employee("John",90.00,40);
        double salary = employee.getSalary();
        System.out.println("Employee = " + employee + "Salary = " + "$"+salary);

        SDET sdet = new SDET("Sam",120.00,40,20);
        double salary1 = sdet.getSalary();
        System.out.println("Sdet = " + sdet + "salary1 = " + "$"+salary1);
    }
}
