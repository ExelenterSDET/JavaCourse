package Day36.Practice.Andrea;

public class Task {
//not finished
    class Employee{

        String fullName;
        int id;
        Company company;
    }

    class Company{
        String coName;
        String website;
        int numOfEmployees;
    }
    public void populateEmployee(String name, int id, Company company) {
        Employee employee = new Employee();
        employee.fullName = name;
        employee.company = company;
        employee.id = id;
    }

    public static void main(String[] args) {

    }

}
