package Day44.SaturdayProject.Tohir.TohirTask1;

public class TestSalaries {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1);
        System.out.println(employee1.getNumberOfEmployees());
        Employee employee2 = new Employee(50,2.5);
        System.out.println(employee2);
        System.out.println(employee2.getNumberOfEmployees());
        //employee1.calculateWage(25);
        System.out.println(employee1);
        System.out.println(employee1.calculateWage(25));
        System.out.println(employee1.getNumberOfEmployees());

    }
}
