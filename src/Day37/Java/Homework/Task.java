package Day37.Java.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task {

    public static void main(String[] args) {
        Company company = populateCompany("Sun Corp.", "www.suncorp.com", 43);
        Employee employee = populateEmployee("Fred Flinstone", 38277, company);
        Employee employee3 = populateEmployee("Jacki Chan", 38250, company);
        Employee employee4 = populateEmployee("Mark Twan", 38250456, company);
        Employee employee5 = populateEmployee("Mike Bedford", 345657, company);
//        printAllInfo(employee);
//        printAllInfo(employee3);
//        printAllInfo(employee4);
//        printAllInfo(employee5);

        Employee employee2 = populateEmployee("Steeve Jobs",1000,"Apple", "www.apple.com", 15000);
//        printAllInfo(employee2);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

//        printEmployeeList(employeeList);

        HashMap<Integer, Employee> mapOfEmployee = new HashMap<>();
        mapOfEmployee.put(employee.id, employee);
        mapOfEmployee.put(employee2.id, employee2);
        mapOfEmployee.put(employee3.id, employee3);
        mapOfEmployee.put(employee4.id, employee4);
        mapOfEmployee.put(employee5.id, employee5);

        printEmployeeMap(mapOfEmployee);

    }

    public static void printEmployeeMap(HashMap<Integer, Employee> map){
        for(Map.Entry<Integer, Employee> employee: map.entrySet()){
            System.out.print(employee.getKey() + " : ");
            printAllInfo(employee.getValue());
        }
    }
    public static void printEmployeeList(ArrayList<Employee> list){
        list.forEach((a) -> printAllInfo(a));
    }
    public static Employee populateEmployee(String name, int id, String coName, String website, int numEmps ) {
        Employee employee = new Employee();
        employee.fullName = name;
        employee.id = id;
        employee.company = new Company();
        employee.company.numOfEmployees = numEmps;
        employee.company.coName = coName;
        employee.company.website = website;
        return employee;
    }
    public static Employee populateEmployee(String name, int id, Company company) {
        Employee employee = new Employee();
        employee.fullName = name;
        employee.company = company;
        employee.id = id;
        return employee;
    }
    public static void printAllInfo (Employee emp){
        System.out.println(emp.fullName + " " + emp.id + " " + emp.company.coName + " " + emp.company.website + " " + emp.company.numOfEmployees);
    }
    public static Company populateCompany(String coName, String website, int numEmps) {
        Company company = new Company();
        company.coName = coName;
        company.website = website;
        company.numOfEmployees = numEmps;
        return company;
    }
}
class Employee {
    String fullName;
    int id;
    Company company;
}
class Company{
    String coName;
    String website;
    int numOfEmployees;
}