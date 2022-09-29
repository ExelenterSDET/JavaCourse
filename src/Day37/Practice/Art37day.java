package Day37.Practice;

import java.util.ArrayList;

public class Art37day {
    public static void main(String[] args) {
        Company IBM = new Company();
        IBM.Name = "IBM";
        IBM.type = "computer";
        Employee bill = createEmply("bill", IBM);
        Employee john = createEmply("John", IBM);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(bill);
        list.add(john);
        list.forEach(((a)->System.out.println(a.cpy.Name)));





        System.out.println(bill.fullName);
        System.out.println(bill.cpy.Name);

    }
    static Employee createEmply(String name, Company company ){
        Employee e = new Employee();
        e.fullName = name;
        e.cpy = company;

        return e;
    }
}

class Company{
    String Name;
    String type;
}
class Employee{
    String fullName;
    Company cpy;
}
