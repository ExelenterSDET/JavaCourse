package Day55.Java.Abstraction.Example2;

public class HR {
    public static void main(String[] args) {
        Contractor contractor = new Contractor(20, 25);
        contractor.calculateSalary();
        double salary = contractor.getSalary();
        System.out.println(salary);

        FullTimeEmployee employee = new FullTimeEmployee(30);
        employee.calculateSalary();
        double salary1 = employee.getSalary();
        System.out.println("salary1 = " + salary1);

    }
}
