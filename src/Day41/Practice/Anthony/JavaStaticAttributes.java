package Day41.Practice.Anthony;

public class JavaStaticAttributes {
    public static void main(String[] args) {

        Employee.employeeId = 20;

        Employee e = new Employee();
        e.name = "Joe Blow";

        System.out.println(e);

        System.out.println("=================================");

        Employee e1 = new Employee();
        e1.number=200;
        Employee.employeeId = 200;

        Employee e2 = new Employee();
        e2.number = 300;
        Employee.employeeId = 300;

        Employee.employeeId = 1000;

        System.out.println(e1);
        e2.employeeId =300;

        Employee e3 = new Employee();
        e3.number = 1500;
        e3.employeeId = 1500;

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }


}
class Employee {
    public String name;
    public static int employeeId;
    public int number;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", number=" + number +
                '}';
    }
}
