package Day36.Practice.Dilnoza;

public class Task {
    /*
1. Create a class as Employee with 3 attributes on of them should be Company.
2. Create a class as Company with 3 attributes.
3. Create a method to populate all fields in the Employee class.
4. Create a method to print all attributes of Employee class.
 */
static class Employee{
    String name;
    String department;
    Company company = new Company();
}

static class Company{
    String position;
    double salary;
    int empId;

}

    public static void main(String[] args) {
       Employee employee = new Employee();
       toPrint("John","finance","financial adviser",85000.00,123456);
        System.out.println("================================================");

        Company company = new Company();
        employee.company.position="Accountant";
        employee.company.salary= 100000.00;
        employee.company.empId=123456;
        System.out.println(employee.company.position+"\n"+employee.company.salary+"\n"+employee.company.empId);
        System.out.println();


    }
    static void toPrint( String name,String department,String position, double salary, int empId){
        System.out.println("name => "+name+ "\ndepartment=> "+department+"\nposition => "+position+ "\nsalary=> "+salary+"\nempId => "+empId);
    }
    static Employee populateNames(String name,String department, Company company){
  Employee employee = new Employee();
  employee.name=name;
  employee.department=department;

    return employee;
}

}