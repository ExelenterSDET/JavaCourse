package Day36.Practice.Anthony.TaskHW;

public class TaskOOP {
    /*

1. Create a class as Employee with 3 attributes on of them should be Company.
2. Create a class as Company with 3 attributes.
3. Create a method to populate all fields in the Employee class.
4. Create a method to print all attributes of Employee class.


 */
    public static void main(String[] args) {
        Company company = new Company();
        company.name = "Google";
        company.address = "1600 Amphitheatre Pkwy, Mountain View, CA 94043";
        company.webSite = "https://about.google/locations/?region=north-america";
        Employee AllValues = printAllValues("Anthony", 1,100000D,company);
        valuesOfEmployees(AllValues);

    }

    public static void valuesOfEmployees (Employee employee){
        System.out.println("Employee: " +employee.employeeName+ ", ID# = "+ employee.id+", Salary = $" +employee.salary+"\n\"Working for Company: "+ employee.company.name+", Company Address: "
                +employee.company.address+" Company Website: "+employee.company.webSite);

    }

    public static Employee printAllValues(String employeeName, int id, double salary, Company company){
        Employee employee = new Employee();
        employee.employeeName=employeeName;
        employee.id=id;
        employee.salary=salary;
        employee.company.name= company.name;
        employee.company.address= company.address;
        employee.company.webSite= company.webSite;
        return employee;

    }
}

class Company{
    String name;
    String address;
    String webSite;
}
class Employee{
    String employeeName;
    int id;
    double salary;
    Company company = new Company();
}


