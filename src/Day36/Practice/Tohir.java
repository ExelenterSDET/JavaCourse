package Day36.Practice;

import java.util.Arrays;

public class Tohir {
    public static void main(String[] args) {

      Tohir asg = new Tohir();

        Company company = asg.Createcompany("MR","12@mr",2340);
        Employee employee = asg.Createemployee("Tju","Thu@mr",2365,company);

        System.out.println(employee.email);
        System.out.println(employee.company.email+" "+employee.company.name+" "+employee.company.phonenumber);
        System.out.println(employee.phonenumber);
        System.out.println(employee.name);


    }
    class Employee {

        String name;
        String email;
        int phonenumber;

        Company company = new Company();

    }
    class Company {
        String name;
        String email;
        int phonenumber;
    }
    public Employee Createemployee(String name, String email, int phonenumber, Company company)
    {
        Employee emp = new Employee();
        emp.name = name;
        emp.email = email;
        emp.phonenumber = phonenumber;
        emp.company.email = company.email;
        emp.company.name = company.name;
        emp.company.phonenumber = company.phonenumber;
        return emp;

    }
    public Company Createcompany(String name, String email, int phonenumber)
    {
        Company company = new Company();
        company.name = name;
        company.email = email;
        company.phonenumber = phonenumber;
        return company;
    }

}
