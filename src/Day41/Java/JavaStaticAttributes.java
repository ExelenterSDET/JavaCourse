package Day41.Java;

public class JavaStaticAttributes {

    public static void main(String[] args) {
        Employee.employeeId = 20;

        Employee e = new Employee();
        e.name = "John Wick";

        System.out.println(e);

        System.out.println("==================");

        Employee e1 = new Employee();
        e1.number = 200;
//        e1.employeeId = 200;
        Employee.employeeId = 200;

        Employee e2 = new Employee();
        e2.number = 300;
//        e2.employeeId = 300;
        Employee.employeeId = 300;

        Employee.employeeId = 1000;

        Employee e3 = new Employee();
        e3.number = 1500;
        e3.employeeId = 1500;


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }


}

class Employee{
    public String name;
    public static int employeeId;
    public int number;

    public String toString() {
        return "Employee{" +
                ", employeeId=" + employeeId +
                ", number=" + number +
                '}';
    }
}
