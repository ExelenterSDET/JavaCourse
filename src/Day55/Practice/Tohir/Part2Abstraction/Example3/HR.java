package Day55.Part2Abstraction.Example3;

public class HR {
    public static void main(String[] args) {
        Contractor contractor = new Contractor(20,50);
        contractor.calculateSalary();
        double salary = contractor.getSalary();
        System.out.println(salary);

        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(20);
        fulltimeEmployee.calculateSalary();
        double salary1 = fulltimeEmployee.getSalary();
        System.out.println(salary1);
    }
}
