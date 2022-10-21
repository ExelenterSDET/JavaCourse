package Day53.Practice.Ibrahim.Task;

import Day53.Java.Task.Employee;
import Day53.Java.Task.SDET;

public class HR {


    public static void main(String[] args) {
        Day53.Java.Task.Employee emp =  new Employee("Michael", 40, 60);
        System.out.println(emp);

        Day53.Java.Task.SDET sd = new SDET("John", 40, 60);
        System.out.println(sd);

    }
}
