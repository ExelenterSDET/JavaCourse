package Day37.Practice.Andrea.Day37;


public class Task {

    public static void main(String[] args) {
            Company company = populateCompany("Sun Corp.", "www.suncorp.com", 43);
            Employee employee = populateEmployee("Fred Flinstone", 38277, company);
            printAllInfo(employee);
        }
        public static Employee populateEmployee(String name, int id, Company company) {
            Employee employee = new Employee();
            employee.fullName = name;
            employee.company = company;
            employee.id = id;
            return employee;
        }
        public static void printAllInfo (Employee emp){
            System.out.println(emp.fullName + " " + emp.id + " " + emp.company.coName + " " + emp.company.website);
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


