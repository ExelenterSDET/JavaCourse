package Day36.Practice.Bahridin_JavaOOP;

public class Task {
    public static void main(String[] args) {
        Company company=new Company();
        company.name="Apple";
        company.address="111 Apple Street";
        company.wedSite="www.apple.com";
        Employee allAtrbs = printAllAtrbs("Ahmad", 1234, 85000D, company);
        fieldOfEmp(allAtrbs);
    }
    public static void fieldOfEmp(Employee employee) {
        System.out.println(employee.empName+" "+employee.id+" "+employee.salary+" \n"+employee.company.name+" "
                +employee.company.address+" "+employee.company.wedSite);
    }
    public static Employee printAllAtrbs(String empName,int id,double salary,Company company) {
        Employee emp=new Employee();
        emp.empName=empName;
        emp.id=id;
        emp.salary=salary;
        emp.company.name= company.name;
        emp.company.address= company.address;
        emp.company.wedSite= company.wedSite;
        return emp;


    }
}

class Company{
    String name;
    String address;
    String wedSite;
}

class Employee{
    String empName;
    int id;
    double salary;
    Company company =new Company();
}
