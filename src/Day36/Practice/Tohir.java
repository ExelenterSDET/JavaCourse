package Day36.Practice;

public class Tohir {
    public static void main(String[] args) {

    }
    class Employee {
        String name;
        String email;
        int phonenumber;
    }
    class Company {
        String name;
        String email;
        int phonenumber;
    }
    public  Employee Createemployee(String name, String email, int phonenumber)
    {
        Employee emp = new Employee();
        emp.name = name;
        emp.email = email;
        emp.phonenumber = phonenumber;
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
