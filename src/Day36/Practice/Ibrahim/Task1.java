package Day36.Practice.Ibrahim;
/*
*

1. Create a class as Employee with 3 attributes on of them should be Company.
2. Create a class as Company with 3 attributes.
3. Create a method to populate all fields in the Employee class.
4. Create a method to print all attributes of Employee class.


 */


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Employee employee = createEmployee();
        printEmployee(employee);
    }

    public static Employee createEmployee(){
        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter employee name : ");
        employee.name = scan.nextLine();

        System.out.print("Please enter employee lastname : ");
        employee.lastname = scan.nextLine();

        System.out.print("Please enter company name : ");
        employee.company.companyName = scan.nextLine();

        System.out.print("Please enter company website : ");
        employee.company.companyWebsite = scan.nextLine();

        System.out.print("Please enter company phone number : ");
        employee.company.companyPhone = scan.nextLine();

        return employee;
    }

    public static void printEmployee(Employee employee){
        System.out.println(employee.name + " " + employee.lastname +
                "\n" + employee.company.companyName
                +"\n" + employee.company.companyWebsite
                +"\n" + employee.company.companyPhone);
    }
}

class Employee {
    String name;
    String lastname;
    Company company = new Company();
}
class Company{
    String companyName;
    String companyWebsite;
    String companyPhone;
}



