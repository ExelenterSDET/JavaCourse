package Day41.Practice.Tohir;

public class StaticAttributes {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.EmployeeID = 10;
        employee.Name = "Korm";
        //System.out.println(employee);
        Employee employee1 = new Employee();
        employee1.number = 34;
        Employee.EmployeeID = 43;
        employee1.Name = "smith";



        Employee employee2 = new Employee();
        employee2.number = 44;
        Employee.EmployeeID = 53;
        employee2.Name = "jOMFS";
        System.out.println(employee1);
        System.out.println(employee2);


    }

}
class Employee{
    public String Name;
    public static int EmployeeID;
    public int number;

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", number=" + number +
                ", ID=" +EmployeeID +
                '}';
    }
}
